package com.dhu.service;
import com.dhu.dao.TbBookinfoDAO;
import com.dhu.pojo.TbBookinfo;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW )
public class TbBookinfoServiceImpl implements TbBookinfoService {
    TbBookinfoDAO tbbookinfoDAO;
    public List<TbBookinfo> list() {
        List<TbBookinfo> tbbookinfos= tbbookinfoDAO.list();
        if(tbbookinfos.isEmpty()){
            for (int i = 0; i < 5; i++) {
                TbBookinfo p = new TbBookinfo();
                p.setBookname("TbBookinfo " + i);
                tbbookinfoDAO.add(p);
                tbbookinfos.add(p);
            }
        }
        return tbbookinfos;
    }

    public TbBookinfoDAO getTbBookinfoDAO() {
        return tbbookinfoDAO;
    }

    public void setTbBookinfoDAO(TbBookinfoDAO tbbookinfoDAO) {
        this.tbbookinfoDAO = tbbookinfoDAO;
    }

    @Override
    public void add(TbBookinfo p) {
        tbbookinfoDAO.add(p);

    }

    @Override
    public void update(TbBookinfo p) {
        tbbookinfoDAO.update(p);
    }

    @Override
    public void delete(TbBookinfo p) {
        tbbookinfoDAO.delete(p);
    }

    @Override
    public TbBookinfo get(int bookid) {
        return tbbookinfoDAO.get(bookid);
    }



}