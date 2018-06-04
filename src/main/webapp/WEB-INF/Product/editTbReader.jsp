<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/6/1
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>图书管理系统个人信息修改</title>
    <style type="text/css">
        input[type=text], input[type=password] {width: 150px;}
    </style>
</head>
<body>
<h2>个人信息修改</h2>
< action="editTbReader"  method="post">
您的姓名：<input type="text" name="username" >  <br/>
您的学号：<input type="text" name="studentId"><br/>
您的性别：<input type="button" name="sex" value="0" checked>男
            <input type="button" name="sex" value="1">女<br/>
电话号码：<input type="text" name="tel"><br/>
您的密码：<input type="text" name="password1"><br/>
确认密码：<input type="text" name="password2"><br/>

<input type="submit" value="修改">
<input type="reset" value="重置">

</form>
</body>
</html>
