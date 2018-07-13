<%@page pageEncoding="utf-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<html>


<body>
<h2>Hello World!</h2>

<%--action="${pageContext.request.contextPath}/originality/add" id="insert" method="post"--%>

<form action="${pageContext.request.contextPath}/upload/file" id="insert" method="post"
      enctype="multipart/form-data">
    标题：<input name="title" type="text"><br/>
    内容：<input name="content" type="text"><br/>
    图片信息：<input name="imgContent" type="text"><br/>
    请选择图片：<input name="file" type="file"><br/>
    <input type="submit" name="提交">
</form>
</body>
</html>