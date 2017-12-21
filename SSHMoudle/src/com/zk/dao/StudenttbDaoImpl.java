package com.zk.dao;

import com.zk.bean.Studenttb;
import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by Administrator on 2017/12/19.
 */
public class StudenttbDaoImpl extends HibernateDaoSupport implements StudenttbDao {


    @Override
    public void saveStudent(Studenttb studenttb) {
         super.getHibernateTemplate().save(studenttb);
    }
}




