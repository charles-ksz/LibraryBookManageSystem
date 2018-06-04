package com.dhu.dao;
import com.dhu.pojo.TbBookinfo ;
import java.util.List;
public interface TbBookinfoDAO {
    public List<TbBookinfo > list();
    public void add(TbBookinfo  p);
    public TbBookinfo  get(int bookid);
    public void update(TbBookinfo  p);
    public void delete(TbBookinfo  p);
}