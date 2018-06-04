package com.dhu.pojo;

import javax.persistence.*;

@Entity
@Table(name = "tb_manager", schema = "library", catalog = "")
public class TbManager {
    private int id;
    private String name;
    private String pwd;

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
    @Column(name = "pwd")
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TbManager tbManager = (TbManager) o;

        if (id != tbManager.id) return false;
        if (name != null ? !name.equals(tbManager.name) : tbManager.name != null) return false;
        if (pwd != null ? !pwd.equals(tbManager.pwd) : tbManager.pwd != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (pwd != null ? pwd.hashCode() : 0);
        return result;
    }
}
