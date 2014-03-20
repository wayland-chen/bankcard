package com.offke.core.bu.struct.pojo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Column implements Serializable {
    private String id;
    private String cn;
    //private String type;
    //private String len;
    //private String empty;

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setCn(String cn) {
        this.cn = cn;
    }

    public String getCn() {
        return cn;
    }


}
