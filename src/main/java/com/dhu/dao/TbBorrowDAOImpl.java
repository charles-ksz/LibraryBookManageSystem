package com.dhu.dao;
import com.dhu.pojo.TbBorrow ;
import org.springframework.orm.hibernate5.HibernateTemplate;
import java.util.List;
public class TbBorrowDAOImpl extends HibernateTemplate implements TbBorrowDAO{
   @Override
    public List<TbBorrow > list() {
        return (List<TbBorrow >) find("from TbBorrow ");
    }

    @Override
    public void add(TbBorrow  p) {
        super.save(p);
    }

    @Override
    public TbBorrow  get(int bookid) {
        return get(TbBorrow.class,bookid);
    }

    @Override
    public void update(TbBorrow  p) {
        super.update(p);
    }

    @Override
    public void delete(TbBorrow  p) {
        super.delete(p);
    }
}