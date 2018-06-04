package com.dhu.action;
import com.dhu.pojo.TbReader;
import com.dhu.service.TbReaderServiceImpl;
import  com.opensymphony.xwork2.*;

public class RegisterAction extends ActionSupport {
        private  String name;
        private String sex;
        private String tel;
        private String password1;
        private String password2;
        private Integer studentId ;
        private Integer num;
        private double pay;
        private TbReader tbReader;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getPassword1() {
        return password1;
    }

    public void setPassword1(String password1) {
        this.password1 = password1;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum() {
        this.num = 0;
    }

    public Double getPay() {
        return pay;
    }

    public void setPay(float pay) {
        this.pay = pay;
    }

    public void validate(){
        if(this.getName()==null||this.getName().length()==0){
            addFieldError("userName", "用户名不能为空！");
        }else{
            TbReaderServiceImpl info= new TbReaderServiceImpl();
            tbReader=info.get(this.getName());
            TbReader ui=new TbReader();
                if(ui.getName().equals(this.getName())){
                    addFieldError("userName", "用户名已存在！");
                }

        }
        if(this.getPassword1()==null||this.getPassword1().length()==0){
            addFieldError("password1", "登录密码不许为空！");
        }else if(this.getPassword2()==null||this.getPassword2().length()==0){
            addFieldError("password2", "重复密码不许为空！");
        }else if(!this.getPassword1().equals(this.getPassword2())){
            addFieldError("password2", "两次密码不一致！");
        }

    }



    public String execute() throws Exception {


        return SUCCESS;

    }
}
