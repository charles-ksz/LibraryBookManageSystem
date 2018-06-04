package com.dhu.service;
import com.dhu.dao.TbReaderDAO;
import com.dhu.pojo.TbReader;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public class TbReaderServiceImpl implements TbReaderService {
    TbReaderDAO tbreaderDAO;
    public List<TbReader> list() {
        List<TbReader> tbreaders= tbreaderDAO.list();
        if(tbreaders.isEmpty()){
            for (int i = 0; i < 5; i++) {
                TbReader p = new TbReader();
                p.setName("TbReader " + i);
                tbreaderDAO.add(p);
                tbreaders.add(p);
            }
        }
        return tbreaders;
    }

    public TbReaderDAO getTbReaderDAO() {
        return tbreaderDAO;
    }

    public void setTbReaderDAO(TbReaderDAO tbreaderDAO) {
        this.tbreaderDAO = tbreaderDAO;
    }

    @Override
    public void add(TbReader p) {
        tbreaderDAO.add(p);

    }

    @Override
    public void update(TbReader p) {
        tbreaderDAO.update(p);
    }

    @Override
    public void delete(TbReader p) {
        tbreaderDAO.delete(p);
    }

    @Override
    public TbReader get(String username) {
        return tbreaderDAO.get(username);
    }



}

