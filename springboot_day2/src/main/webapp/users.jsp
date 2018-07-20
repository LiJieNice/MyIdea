<%--
  Created by IntelliJ IDEA.
  User: EDZ
  Date: 2018/7/18
  Time: 16:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form id="form" action="${pageContext.request.contextPath}/user/list" method="post">
    <input type="text" name="users[0].name" value="jobs"/>
    <input type="text" name="users[0].age" value="55"/><br/>
    <input type="text" name="users[1].name" value="jim"/>
    <input type="text" name="users[1].age" value="21"/><br/>
    <input type="submit" value="提交">
</form>

</body>
</html>
