package com.dhu.pojo;

import javax.persistence.*;

@Entity
@Table(name = "tb_reader", schema = "library", catalog = "")
public class TbReader {
    private int id;
    private String name;
    private String sex;
    private String tel;
    private String password;
    private Integer studentId;
    private Integer num;
    private Double pay;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "studentId")
    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    @Basic
    @Column(name = "num")
    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Basic
    @Column(name = "pay")
    public Double getPay() {
        return pay;
    }

    public void setPay(Double pay) {
        this.pay = pay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbReader tbReader = (TbReader) o;

        if (id != tbReader.id) return false;
        if (name != null ? !name.equals(tbReader.name) : tbReader.name != null) return false;
        if (sex != null ? !sex.equals(tbReader.sex) : tbReader.sex != null) return false;
        if (tel != null ? !tel.equals(tbReader.tel) : tbReader.tel != null) return false;
        if (password != null ? !password.equals(tbReader.password) : tbReader.password != null) return false;
        if (studentId != null ? !studentId.equals(tbReader.studentId) : tbReader.studentId != null) return false;
        if (num != null ? !num.equals(tbReader.num) : tbReader.num != null) return false;
        if (pay != null ? !pay.equals(tbReader.pay) : tbReader.pay != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (studentId != null ? studentId.hashCode() : 0);
        result = 31 * result + (num != null ? num.hashCode() : 0);
        result = 31 * result + (pay != null ? pay.hashCode() : 0);
        return result;
    }
}
