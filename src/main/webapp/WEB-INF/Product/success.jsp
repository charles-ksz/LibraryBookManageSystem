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
    <title>图书管理系统</title>
    <style type="text/css">
        input[type=text], input[type=password] {width: 150px;}
    </style>
</head>
<body>
    <form name="dealAction" method="post">
        <a herf ="editTbReader?tbReader.username=${tbreader.username}">修改</a>
        <a herf ="updateTbReader?tbReader.username=${tbreader.username}">查看</a>
        书名：<input type="text" name="bookname" value="">
        类型：<input type="text" name="type" value="">
        作者：<input type="text" name="auther" value="">
        出版社：<input  type="text" name="press" value="">
        <input type="submit" value="查询">
        <input type="reset" value="重置">

        搜索结果：<a href="getTbBookinfoe"></a>
    </form>
</body>
</html>
