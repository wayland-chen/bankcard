package com.offke.core.bu.struct.pojo;

import java.io.RandomAccessFile;
import java.util.Date;

/**
 * <p>ICE文件信息</p>
 *
 * @version 1.0
 * @since 2012/4/2
 */
public class ICEFileRecord {
    private RandomAccessFile raf;
    private long position;
    private int limit;

    private long lastTime = new Date().getTime();

    public ICEFileRecord(long position) {
        this.position = position;
    }

    public ICEFileRecord(RandomAccessFile raf, long position, int limit, long lastTime) {
        super();
        this.raf = raf;
        this.position = position;
        this.limit = limit;
        this.lastTime = lastTime;
    }

    public RandomAccessFile getRaf() {
        return raf;
    }

    public void setRaf(RandomAccessFile raf) {
        this.raf = raf;
    }

    public long getPosition() {
        return position;
    }

    public void setPosition(long position) {
        this.position = position;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public long getLastTime() {
        return lastTime;
    }

    public void setLastTime(long lastTime) {
        this.lastTime = lastTime;
    }

}
