package com.zk.service;

import com.zk.bean.Studenttb;

/**
 * Created by Administrator on 2017/12/20.
 */
public interface StudentService {

    public void saveServiceStudent(Studenttb studenttb);
    public String findServiceStudent(Studenttb studenttb);
}
