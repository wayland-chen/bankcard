package com.offke.core.standard.abstracts;

import com.offke.core.common.mgr.Atommgr;
import com.offke.core.common.util.SessionUtil;
import com.offke.core.standard.interfaces.IAtom;
import com.offke.core.status.procedure.TradeInfo;
import org.hibernate.Session;

import java.sql.Connection;
import java.sql.SQLException;

public abstract class AbstractBasicAtom implements IAtom {

    private Session session;

    public AbstractBasicAtom() {
    }


    /*
    * 原子交易链
    */
    private IAtom atom;

    /**
     * <p>调用其他相关的原子交易</p>
     *
     * @param tradeCode
     * @return 原子交易对象
     */
    public <T> T instance(String tradeCode) {
        IAtom atomBean;
        try {
            atomBean = (IAtom) Atommgr.instance().getPlugin(tradeCode);
            if (atomBean instanceof AbstractBasicAtom) {
                ((AbstractBasicAtom) atomBean).atom = atomBean;
                ((AbstractBasicAtom) atomBean).session = this.session;
            }
            return (T) atomBean;
        } catch (Exception e) {
            throw new RuntimeException(tradeCode, e);
        }
    }


    /**
     * <p>获取Connection</p>
     *
     * @return Connection
     * @throws SQLException
     */
    @SuppressWarnings("deprecation")
    public Connection getConnection() throws SQLException {
        return getSession().connection();
    }

    /**
     * <p>获取session</p>
     *
     * @return session
     */
    public Session getSession() {
        if (session == null)/* || !session.isOpen( ) || !session.isConnected( )*/ {
            session = SessionUtil.getSessionFactory().openSession();
        }

        return session;
    }

    protected void setSession(Session session) {
        if (this.session == null || !session.isOpen() || !session.isConnected()) {
            this.session = session;
        }
    }

    /**
     * <p>原子交易方法，必须实现</p>
     *
     * @param tradeInfo 交易过程数据
     * @return 是否成功
     */
    public abstract boolean atomicTransaction(TradeInfo tradeInfo);

    /**
     * <p>清理资源</p>
     */
    public void clear() {
        if (session != null && session.isConnected()) {
            session.disconnect();
        }
        if (session != null && session.isOpen()) {
            SessionUtil.closeSession(session);
            session = null;
        }
    }


    /**
     * <p>事务开始</p>
     */
    public void beginTransaction() {
        if (atom == null) {
            getSession().getTransaction().begin();
        }
    }

    /**
     * <p>事务提交</p>
     */
    public void commitTransaction() {
        if (atom == null && getSession().getTransaction().isActive()) {
            getSession().getTransaction().commit();
        }
    }

    /**
     * <p>事务回滚</p>
     */
    public void rollbackTransaction() {
        if (atom == null && getSession().getTransaction().isActive()) {
            getSession().getTransaction().rollback();
        }
    }

    /**
     * <p>自动事务提交</p>
     */
    public void autoTransaction(boolean isException) throws SQLException {
        if (atom == null && session != null) {
            if (isException) {
                if (session.isOpen() && session.getTransaction().isActive()) {
                    this.rollbackTransaction();
                }
            } else {
                if (session.isOpen() && session.getTransaction().isActive()) {
                    this.commitTransaction();
                }
            }
        }
    }
}
