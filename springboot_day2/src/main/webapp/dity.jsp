<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2018/7/7
  Time: 11:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/dity/showDity" method="post">
    商品名称：<input type="text" name="dity.name"><br/>
    商品价格：<input type="text" name="dity.dityType"><br/>
    商品类型：<input type="text" name="dity.price"><br/>
    商品产地：<input type="text" name="dity.city"><br/>
    <input type="submit" name="提交">
</form>
</body>
</html>
