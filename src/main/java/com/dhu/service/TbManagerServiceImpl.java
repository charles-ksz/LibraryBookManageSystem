package com.dhu.service;

import  com.dhu.pojo.TbManager;
import com.dhu.dao.TbManagerDAO;
import org.hibernate.sql.Update;
import  org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional(readOnly = false,propagation = Propagation.REQUIRES_NEW)
public class TbManagerServiceImpl implements TbManagerService{
    TbManagerDAO tbManagerDAO;

    public TbManagerDAO getTbManagerDAO() {
        return tbManagerDAO;
    }

    public void setTbManagerDAO(TbManagerDAO tbManagerDAO) {
        this.tbManagerDAO = tbManagerDAO;
    }

    @Override
    public void add(TbManager p)
    {
        tbManagerDAO.add(p);
    }

    @Override
    public void delete(TbManager p)
    {
        tbManagerDAO.delete(p);
    }

    @Override
    public void update(TbManager p)
    {
        tbManagerDAO.update(p);
    }

    @Override
    public TbManager get(String username) {
        return tbManagerDAO.get(username);
    }

    @Override
    public List<TbManager> list() {
        List<TbManager> tbManagers=tbManagerDAO.list();
        if(tbManagers.isEmpty())
        {
            for (int i=0;i<2;i++)
            {
                TbManager p=new TbManager();
                p.setName("tbManager"+i);
                tbManagerDAO.add(p);
                tbManagers.add(p);
            }
        }
        return  tbManagers;
    }
}
