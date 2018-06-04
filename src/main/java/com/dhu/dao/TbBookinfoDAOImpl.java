package com.dhu.dao;
import com.dhu.pojo.TbBookinfo ;
import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;
public class TbBookinfoDAOImpl extends HibernateTemplate implements TbBookinfoDAO{
    public List<TbBookinfo > list() {
        return (List<TbBookinfo >) find("from TbBookinfo ");
    }

    @Override
    public void add(TbBookinfo  p) {
        super.save(p);
    }

    @Override
    public TbBookinfo  get(int bookid) {
        return get(TbBookinfo .class,bookid);
    }

    @Override
    public void update(TbBookinfo  p) {
        super.update(p);
    }

    @Override
    public void delete(TbBookinfo  p) {
        super.delete(p);
    }
}