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

<%--
    private String creativeType;  //创意状态
    private String title;//标题
    private String contents;//标题内容
    private String imgContents;//图片信息
    private String imgUrls;//图片存放的路径
    private String landingUrl;//落地页链接
    private String brandName;//品牌名称
    private String logoUrl;//logo图片存放的路径
    private String oldName;//老名字
    private String newName;//新名字
    private String oldLogoName; //logo老名称
    private String newLogoName; //logo新名称

    private MultipartFile[] files;//上传图片的格式

    private MultipartFile file;  //logo图片  单独划分出来，这样不乱
--%>


<form action="${pageContext.request.contextPath}/imgfile/file" method="post" enctype="multipart/form-data">

    <%--  private MultipartFile daFile;  //大图
    private MultipartFile danFile;  //单图--%>
    创意状态：<input type="text" name="list[0].creativeType" value="heh"><br/>
    标题：<input type="text" name="list[0].title" value="标题1"><br/>
    标题内容：<input type="text" name="list[0].contents" value="标题内容1"><br/>
    图片信息：<input type="text" name="list[0].imgContents" value="图片内容1"><br/>
    落地页链接：<input type="text" name="list[0].landingUrl" value="heh"><br/>
    品牌名称：<input type="text" name="list[0].brandName" value="heh"><br/>
    商品价格：<input type="file" name="list[0].files" value="heh" multiple="multiple"><br/>
    商品价格：<input type="file" name="list[0].file" value="heh"><br/>
    商品价格：<input type="file" name="list[0].daFile" value="大图"><br/>
    商品价格：<input type="file" name="list[0].danFile" value="单图"><br/>


    创意状态：<input type="text" name="list[1].creativeType" value="heh"><br/>
    标题：<input type="text" name="list[1].title" value="标题2"><br/>
    标题内容：<input type="text" name="list[1].contents" value="标题内容2"><br/>
    图片信息：<input type="text" name="list[1].imgContents" value="图片内荣2"><br/>
    落地页链接：<input type="text" name="list[1].landingUrl" value="heh"><br/>
    品牌名称：<input type="text" name="list[1].brandName" value="heh"><br/>
    商品价格：<input type="file" name="list[1].files" multiple="multiple"><br/>
    商品价格：<input type="file" name="list[1].file"><br/>
    商品价格：<input type="file" name="list[1].daFile" value="大图"><br/>
    商品价格：<input type="file" name="list[1].danFile" value="单图"><br/>

    <%--商品名称：<input type="text" name="name" value="heh"><br/>
    商品价格：<input type="text" name="content" value="heh"><br/>
    商品产地：<input type="file" name="file" multiple="multiple"><br/> --%> <%--multiple="multiple"  添加这个属性能够一次性选择多个文件--%>

    <input type="submit" value="提交">
</form>
</body>
</html>

