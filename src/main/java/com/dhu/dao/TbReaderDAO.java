package com.dhu.dao;
import com.dhu.pojo.TbReader;

import java.util.List;
public interface TbReaderDAO {
    public List<TbReader> list();
    public void add(TbReader p);
    public TbReader get(String username);
    public void update(TbReader p);
    public void delete(TbReader p);
}