<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/6/1
  Time: 10:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" import="java.util.*" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
    <title>图书管理系统</title>

</head>
<div>
    <h2> 欢迎使用图书管理系统</h2>


    <form action="login" method="post">

        用户名:<input type="text" name="username" />

        密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="password" /><br />
       权限： <input type="radio" name="param" value="1" checked>管理员
        <input type="radio" name="param" value="0">普通用户
        <input type="submit" value="登录" />

        <input type="reset" value="重置" />
        如果您还没有注册，请单击<a href="editTbReader.jsp">这里</a>注册！



    </form>

</div>
</body>
</html>
