package com.dhu.pojo;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "tb_borrow", schema = "library", catalog = "")
public class TbBorrow {
    private int id;
    private Integer readerid;
    private Integer bookid;
    private Timestamp borrowtime;
    private Timestamp backtime;
    private byte ifback;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "readerid")
    public Integer getReaderid() {
        return readerid;
    }

    public void setReaderid(Integer readerid) {
        this.readerid = readerid;
    }

    @Basic
    @Column(name = "bookid")
    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    @Basic
    @Column(name = "borrowtime")
    public Timestamp getBorrowtime() {
        return borrowtime;
    }

    public void setBorrowtime(Timestamp borrowtime) {
        this.borrowtime = borrowtime;
    }

    @Basic
    @Column(name = "backtime")
    public Timestamp getBacktime() {
        return backtime;
    }

    public void setBacktime(Timestamp backtime) {
        this.backtime = backtime;
    }

    @Basic
    @Column(name = "ifback")
    public byte getIfback() {
        return ifback;
    }

    public void setIfback(byte ifback) {
        this.ifback = ifback;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbBorrow tbBorrow = (TbBorrow) o;

        if (id != tbBorrow.id) return false;
        if (ifback != tbBorrow.ifback) return false;
        if (readerid != null ? !readerid.equals(tbBorrow.readerid) : tbBorrow.readerid != null) return false;
        if (bookid != null ? !bookid.equals(tbBorrow.bookid) : tbBorrow.bookid != null) return false;
        if (borrowtime != null ? !borrowtime.equals(tbBorrow.borrowtime) : tbBorrow.borrowtime != null) return false;
        if (backtime != null ? !backtime.equals(tbBorrow.backtime) : tbBorrow.backtime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (readerid != null ? readerid.hashCode() : 0);
        result = 31 * result + (bookid != null ? bookid.hashCode() : 0);
        result = 31 * result + (borrowtime != null ? borrowtime.hashCode() : 0);
        result = 31 * result + (backtime != null ? backtime.hashCode() : 0);
        result = 31 * result + (int) ifback;
        return result;
    }
}
