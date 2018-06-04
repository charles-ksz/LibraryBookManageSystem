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
    <title>图书管理系统个人信息查看</title>
</head>
<body>
<h2>个人信息查看</h2>
<form action="updateTbReader"  method="post">
您的姓名：${TbReader.name}<br/>
您的学号：${TbReader.studentId}<br/>
您的性别：${TbReader.sex}<br/>
电话号码：${TbReader.tel}<br/>
借书数量：${TbReader.num}<br/>
赔&nbsp;&nbsp;&nbsp;&nbsp;偿:${TbReader.pay};<br/>
您的密码：${TbReader.password}

</form>
</body>
</html>
