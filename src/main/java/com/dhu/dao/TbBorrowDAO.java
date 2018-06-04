package com.dhu.dao;
import com.dhu.pojo.TbBorrow ;
import java.util.List;
public interface TbBorrowDAO {
    public List<TbBorrow > list();
    public void add(TbBorrow  p);
    public TbBorrow  get(int bookid);
    public void update(TbBorrow  p);
    public void delete(TbBorrow  p);
}