package com.zk.test;

import com.opensymphony.xwork2.ActionContext;
import com.zk.bean.Studenttb;
import com.zk.dao.StudenttbDao;
import com.zk.dao.StudenttbDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/12/20.
 */
public class Test {
    public static void main(String[] args) {
        Studenttb studenttb =new Studenttb();
        studenttb.setSname("tom");
        studenttb.setSex("男");

      /*  StudenttbDao studenttbDao = new StudenttbDaoImpl();
        studenttbDao.saveStudent(studenttb);*/

        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        StudenttbDao  studenttbDao1= (StudenttbDao) applicationContext.getBean("studenttbDao");
        studenttbDao1.saveStudent(studenttb);

    }
}
