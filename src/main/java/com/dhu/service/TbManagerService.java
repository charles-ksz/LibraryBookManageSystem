package com.dhu.service;
import  com.dhu.pojo.TbManager;
import java.util.List;
public interface TbManagerService {
    public void add(TbManager p);
    public void delete(TbManager p);
    public void update(TbManager p);
    public TbManager get( String  username );
    public  List<TbManager> list();
}
