package com.dhu.service;
import com.dhu.pojo.TbReader;

import java.util.List;
public interface TbReaderService {
    public List<TbReader> list();
    public void add(TbReader p);
    public TbReader get(String username);
    public void update(TbReader p);
    public void delete(TbReader p);
}