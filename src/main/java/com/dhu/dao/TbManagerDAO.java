package com.dhu.dao;

import com.dhu.pojo.TbManager;


import  java.util.List;
public interface TbManagerDAO {
    public  List<TbManager> list();
    public void  add(TbManager p);
    public  void delete(TbManager p);
    public  void update(TbManager p);
    public  TbManager get(String username );
}

