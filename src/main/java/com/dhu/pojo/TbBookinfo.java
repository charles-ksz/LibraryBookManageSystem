package com.dhu.pojo;

import javax.persistence.*;

@Entity
@Table(name = "tb_bookinfo", schema = "library", catalog = "")
public class TbBookinfo {
    private int id;
    private Integer bookid;
    private String bookname;
    private String type;
    private String author;
    private String press;
    private Integer allamount;
    private Integer amount;
    private Double price;
    private String remark;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "bookname")
    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "author")
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Basic
    @Column(name = "press")
    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    @Basic
    @Column(name = "allamount")
    public Integer getAllamount() {
        return allamount;
    }

    public void setAllamount(Integer allamount) {
        this.allamount = allamount;
    }

    @Basic
    @Column(name = "amount")
    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    @Basic
    @Column(name = "price")
    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Basic
    @Column(name = "remark")
    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbBookinfo that = (TbBookinfo) o;

        if (id != that.id) return false;
        if (bookid != null ? !bookid.equals(that.bookid) : that.bookid != null) return false;
        if (bookname != null ? !bookname.equals(that.bookname) : that.bookname != null) return false;
        if (type != null ? !type.equals(that.type) : that.type != null) return false;
        if (author != null ? !author.equals(that.author) : that.author != null) return false;
        if (press != null ? !press.equals(that.press) : that.press != null) return false;
        if (allamount != null ? !allamount.equals(that.allamount) : that.allamount != null) return false;
        if (amount != null ? !amount.equals(that.amount) : that.amount != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (remark != null ? !remark.equals(that.remark) : that.remark != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (bookid != null ? bookid.hashCode() : 0);
        result = 31 * result + (bookname != null ? bookname.hashCode() : 0);
        result = 31 * result + (type != null ? type.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        result = 31 * result + (press != null ? press.hashCode() : 0);
        result = 31 * result + (allamount != null ? allamount.hashCode() : 0);
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (remark != null ? remark.hashCode() : 0);
        return result;
    }
}
