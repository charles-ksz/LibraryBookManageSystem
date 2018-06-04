package com.dhu.service;
import  com.dhu.dao.TbBorrowDAO;

import com.dhu.pojo.TbBorrow;
import com.dhu.pojo.TbManager;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import  java.util.List;
@Transactional(readOnly = false,propagation = Propagation.REQUIRES_NEW)
public class TbBorrowServiceImpl implements TbBorrowService {
    TbBorrowDAO tbBorrowDAO;



    public  TbBorrowDAO getTbBorrowDAO()
    {
        return tbBorrowDAO;
    }


    public void setTbBorrowDAO(TbBorrowDAO tbBorrowDAO) {
        this.tbBorrowDAO = tbBorrowDAO;
    }

    @Override
    public void add (TbBorrow p)
    {
            tbBorrowDAO.add(p);

    }
    @Override
    public void update (TbBorrow p)
    {
        tbBorrowDAO.update(p);
    }
    @Override
    public  void delete(TbBorrow p)
    {
        tbBorrowDAO.delete(p);
    }
    @Override
    public   TbBorrow get(int bookid)
    {
         return  tbBorrowDAO.get(bookid);
    }

    @Override
    public List<TbBorrow> list() {
        List<TbBorrow> tbBorrows=tbBorrowDAO.list();
        if (tbBorrows.isEmpty())
        {
            for (int i=0;i<2;i++)
            {
               TbBorrow p=new TbBorrow();
               p.setBookid(i);
               tbBorrowDAO.add(p);
               tbBorrows.add(p);
            }
        }
        return tbBorrows;
    }


}
