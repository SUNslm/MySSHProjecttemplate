package com.zk.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/12/19.
 */
public class Studenttb implements Serializable{
    private Integer sid;
    private String sname;
    private String sex ;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
