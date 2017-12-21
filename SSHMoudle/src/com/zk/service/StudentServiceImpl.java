package com.zk.service;

import com.zk.bean.Studenttb;
import com.zk.dao.StudenttbDao;
import com.zk.dao.StudenttbDaoImpl;

/**
 * Created by Administrator on 2017/12/20.
 */
//目标对象
public class StudentServiceImpl implements StudentService {
    //等待IOC注入
    private StudenttbDao studenttbDao;
    @Override
    //切点
    public void saveServiceStudent(Studenttb studenttb) {
        System.out.println("StudentServiceImpl：saveServiceStudent");
        studenttbDao.saveStudent(studenttb);
    }

    @Override
    public String  findServiceStudent(Studenttb studenttb) {
        System.out.println("StudentServiceImpl：findServiceStudent");
        studenttbDao.saveStudent(studenttb);
        return "ok";
    }

    public void setStudenttbDao(StudenttbDao studenttbDao) {
        this.studenttbDao = studenttbDao;
    }
}
