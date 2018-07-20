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
<form action="${pageContext.request.contextPath}/imgfile/file" method="post" enctype="multipart/form-data">
    商品名称：<input type="text" name="list[0].name" value="heh"><br/>
    商品价格：<input type="text" name="list[0].content" value="heh"><br/>
    商品产地：<input type="file" name="list[0].files"><br/>

    商品名称：<input type="text" name="list[1].name" value="heh"><br/>
    商品价格：<input type="text" name="list[1].content" value="heh"><br/>
    商品产地：<input type="file" name="list[1].files"><br/>

    <%--商品名称：<input type="text" name="name" value="heh"><br/>
    商品价格：<input type="text" name="content" value="heh"><br/>
    商品产地：<input type="file" name="file" multiple="multiple"><br/> --%> <%--multiple="multiple"  添加这个属性能够一次性选择多个文件--%>

    <input type="submit" value="提交">
</form>
</body>
</html>
