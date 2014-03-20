package com.wisdragon.splus.main.command;

import com.offke.core.AppConst;
import com.offke.core.common.util.SplusProperties;
import com.offke.core.common.util.Splusswitch;
import com.offke.core.communication.ice.SystemServiceImp;
import com.offke.core.standard.interfaces.ICommand;
import com.offke.core.status.procedure.TradeInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * <p>ice服务启动</p>
 *
 * @version 1.0
 * @since 2012/3/31
 */
public class ICEService implements ICommand {
    private static final Logger _logger = LoggerFactory.getLogger(ICEService.class);
    private Ice.Communicator ic;
    private ReentrantLock lock = new ReentrantLock();


    @Override
    public boolean execute(TradeInfo tradeInfo) {
        _logger.info("Begin ICEService........");

        lock.lock();
        try {
            final Condition condition = lock.newCondition();
            Thread thread = new Thread() {
                public void run() {
                    String port = SplusProperties.getConfig("app.port");
                    try {
                        Ice.Properties beforeProperties = Ice.Util.createProperties();
                        beforeProperties.setProperty("Ice.MessageSizeMax", SplusProperties.getConfig("Ice.MessageSizeMax"));
                        beforeProperties.setProperty("Ice.ThreadPool.Server.Size", SplusProperties.getConfig("Ice.ThreadPool.Server.Size"));
                        beforeProperties.setProperty("Ice.ThreadPool.Server.SizeMax", SplusProperties.getConfig("Ice.ThreadPool.Server.SizeMax"));
                        Ice.InitializationData initData = new Ice.InitializationData();
                        initData.properties = beforeProperties;
                        ic = Ice.Util.initialize(initData);

                        Ice.ObjectAdapter adapter = ic.createObjectAdapterWithEndpoints("WisdragonIceSyncAdapter", "default -p " + port);
                        adapter.add(new SystemServiceImp(), ic.stringToIdentity("WisdragonIceSync"));
//                        adapter.add( new CallbackSystemServiceImp( ), ic.stringToIdentity( "WisdragonIceAsyn" ) );
                        adapter.activate();

                        _logger.info("启动【WisdragonIceAdapter:{}】成功.", port);
                        _logger.info("绑定WisdragonIceSync成功.");
                        lock.lock();
                        try {
                            condition.signal();
                        } finally {
                            lock.unlock();
                        }
                        ic.waitForShutdown();
                    } catch (Exception e) {
                        _logger.info("启动【WisdragonIceSyncAdapter:{}】成功.error=[{}]", port, e);
                        Splusswitch.stop(AppConst.SysExitException);
                    }

                }
            };
            thread.setName(AppConst.Thread_wisdragon_ice);
            thread.start();
            condition.await();
        } catch (InterruptedException e) {
            _logger.error("InterruptedException={}", e);
        } finally {
            lock.unlock();
        }

        _logger.info("Success ICEService.");
        return true;
    }

    @Override
    public void stop() {
        if (ic != null) {
            try {
                ic.destroy();
            } catch (Exception e) {
                _logger.info("Exception，", e);
            }
        }
    }
}