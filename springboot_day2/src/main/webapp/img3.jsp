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

<%--multiple="multiple"  添加这个属性能够一次性选择多个文件--%>


<form action="${pageContext.request.contextPath}/pc/s" method="post" enctype="multipart/form-data">


    创意标签：<input type="text" name="pictures[0].imgContent" value="创意标签1"><br/>
    创意图片：<input type="file" name="pictures[0].files" value="heh" multiple="multiple"><br/>
    <h3>====</h3>
    创意标签：<input type="text" name="pictures[1].imgContent" value="创意标签2"><br/>
    创意图片：<input type="file" name="pictures[1].files" value="heh" multiple="multiple"><br/>
    <h3>====</h3>
    创意标签：<input type="text" name="pictures[2].imgContent" value="创意标签3"><br/>
    创意图片：<input type="file" name="pictures[2].files" value="heh" multiple="multiple"><br/>


    <h3>====</h3>
    标题：<input type="text" name="titleContents[0].title" value="标题1"><br/>
    标题内容：<input type="text" name="titleContents[0].content" value="标签1"><br/>
    <h3>====</h3>
    标题：<input type="text" name="titleContents[1].title" value="标题2"><br/>
    标题内容：<input type="text" name="titleContents[1].content" value="标签2"><br/>

    <h3>====</h3>
    标题：<input type="text" name="titleContents[2].title" value="标题3"><br/>
    标题内容：<input type="text" name="titleContents[2].content" value="标签3"><br/>

    <h3>====</h3>
    标题：<input type="text" name="titleContents[3].title" value="标题4"><br/>
    标题内容：<input type="text" name="titleContents[3].content" value="标签4"><br/>


    <h1>++++++++</h1>
    落地页链接:<input type="text" name="url" value="www.baidu.com"><br/>
    公司名称:<input type="text" name="logoName" value="锐之旗"><br/>
    公司logo:<input type="file" name="file"><br/>


    <%--商品名称：<input type="text" name="name" value="heh"><br/>
    商品价格：<input type="text" name="content" value="heh"><br/>
    商品产地：<input type="file" name="file" multiple="multiple"><br/> --%> <%--multiple="multiple"  添加这个属性能够一次性选择多个文件--%>

    <input type="submit" value="提交">
</form>
</body>
</html>

