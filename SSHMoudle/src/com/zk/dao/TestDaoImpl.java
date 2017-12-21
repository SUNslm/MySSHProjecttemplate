package com.zk.dao;

import com.zk.bean.Studenttb;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Created by Administrator on 2017/12/20.
 */
public class TestDaoImpl extends HibernateDaoSupport implements TestDao {
    @Override
    public void delete(Studenttb studenttb) {
        super.getHibernateTemplate().delete(studenttb);
    }
}
