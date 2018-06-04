package com.dhu.action;

import com.dhu.pojo.TbManager;
import com.dhu.pojo.TbReader;
import com.dhu.service.TbManagerServiceImpl;
import com.dhu.service.TbReaderServiceImpl;
import  com.opensymphony.xwork2.ActionSupport;

import java.util.List;
import java.lang.String;
public class LoginAction extends ActionSupport {
    private static  final long serialVersionUID=1L;
    private TbReader tbReader=new TbReader();
    private TbManager tbManager=new TbManager();
    private String message="error";
    private String username;
    private String password;
    private String param;
    private List list;


    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




   public String excute() throws Exception{
        return message;
   }
   public void validate()
   {

       if(this.getParam().equals("0")) {

       TbReaderServiceImpl rs=new TbReaderServiceImpl() ;
       tbReader = rs.get( "username");
       if (list.size()== 0) {
           addFieldError("username", "您的账户尚未注册，或者权限错误");
       } else {

           for (int i = 0; i < list.size(); i++) {
               tbReader = (TbReader) list.get(i);
               if (this.getUsername().equals(tbReader.getName())) {
                   if (this.getPassword().equals(tbReader.getPassword())) {
                       message = "success";
                   } else {
                       addFieldError("password", "登录密码不正确");
                   }
               }
           }
       }

   } else {
           TbManagerServiceImpl rt=new TbManagerServiceImpl();
           tbManager=rt.get("username");
           if (list.size()==0) {addFieldError("username","您的账户尚未注册，或者权限错误");}
           for(int i=0;i<list.size();i++)
           {
               tbManager =(TbManager)list.get(i);
               if (this.getUsername().equals(tbManager.getName())){
                   if(this.getPassword().equals(tbManager.getPwd()))
                   {
                       message=SUCCESS;
                   }else{
                       addFieldError("password","登录密码不正确");
                   }
               }
           }
       }


   }


}
