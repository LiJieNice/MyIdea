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
<form action="${pageContext.request.contextPath}/dity/add" method="post">
    商品名称：<input type="text" name="name" value="heh"><br/>
    商品价格：<input type="text" name="dityType" value="heh"><br/>
    商品：<input type="text" name="price" value="11.00"><br/> <%--这样就可以了，直接传double类型的数字--%>
    商品产地：<input type="text" name="city" value="heh"><br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
