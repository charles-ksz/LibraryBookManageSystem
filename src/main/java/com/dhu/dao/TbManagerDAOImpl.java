package com.dhu.dao;

import  com.dhu.pojo.TbManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class TbManagerDAOImpl extends HibernateTemplate implements  TbManagerDAO{

    @Override
    public void add(TbManager p)
    {
        super.save(p);
    }
    @Override
    public  void delete(TbManager p)
    {
        super.delete(p);
    }

    @Override
    public  void update( TbManager p)
    {
        super.update(p);
    }


    public List<TbManager> list()
    {
        return (List<TbManager>) find("from TbManager ");
    }

    @Override
    public TbManager get(String username)
    {
        return  get(TbManager.class,username);
    }
}
