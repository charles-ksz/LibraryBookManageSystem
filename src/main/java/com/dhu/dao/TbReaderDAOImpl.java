package com.dhu.dao;
import com.dhu.pojo.TbReader;
import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;
public class TbReaderDAOImpl extends HibernateTemplate implements TbReaderDAO{
    public List<TbReader> list() {
        return (List<TbReader>) find("from TbReader");
    }

    @Override
    public void add(TbReader p) {
        super.save(p);
    }

    @Override
    public TbReader get(String username ) {
        return get(TbReader.class,username);
    }

    @Override
    public void update(TbReader p) {
        super.update(p);
    }

    @Override
    public void delete(TbReader p) {
        super.delete(p);
    }
}