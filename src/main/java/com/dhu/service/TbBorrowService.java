package com.dhu.service;
import  com.dhu.pojo.TbBorrow;
import java.util.List;
public interface TbBorrowService {
    public List<TbBorrow> list();
    public  void add(TbBorrow P);
    public  TbBorrow get(int bookid);
    public  void update(TbBorrow p);
    public void delete (TbBorrow p);
}
