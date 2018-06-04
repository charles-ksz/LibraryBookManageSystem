package com.dhu.action;

import com.dhu.pojo.TbBorrow;
import com.dhu.service.TbBorrowService;

import java.util.List;

public class TbBorrowAction {
    TbBorrowService tbBorrowService;
    List<TbBorrow> tbBorrows;
    TbBorrow tbBorrow;

    public  String list()
    {
        tbBorrows=tbBorrowService.list();
        return  "listTbBorrow";
    }
    public  String add()
    {
        tbBorrowService.add(tbBorrow);
        return "listTbBorrowAction";
    }

    public  String edit()
    {

        tbBorrow=tbBorrowService.get(tbBorrow.getBookid());
        return "editTbBorrowAction";
    }
    public  String update()
    {
        tbBorrowService.update(tbBorrow);
        return "listTbBorrowAction";
    }

    public  String delete()
    {
        tbBorrowService.delete(tbBorrow);
        return  "listTbBorrowAction";
    }

    public TbBorrowService getTbBorrowService() {
        return tbBorrowService;
    }

    public void setTbBorrowService(TbBorrowService tbBorrowService) {
        this.tbBorrowService = tbBorrowService;
    }

    public List<TbBorrow> getTbBorrows() {
        return tbBorrows;
    }

    public void setTbBorrows(List<TbBorrow> tbBorrows) {
        this.tbBorrows = tbBorrows;
    }

    public TbBorrow getTbBorrow() {
        return tbBorrow;
    }

    public void setTbBorrow(TbBorrow tbBorrow) {
        this.tbBorrow = tbBorrow;
    }
}
