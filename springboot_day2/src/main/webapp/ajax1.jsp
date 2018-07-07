<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

    <script type="text/javascript" src="/springboot_day2/js/jquery.min.js"></script>
    <%--<script type="text/javascript" src="/springboot_day2/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/jquery.edatagrid.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/datagrid-detailview.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/echarts.min.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/china.js"></script>--%>


    <script type="text/javascript">


        $.ajax({
            url: "${pageContext.request.contextPath}/user/hello",
            type: "post",
            dataType: "JSON",
            data: {username: "lijie", password: "123456"},
            success: function (result) {
                console.log(result)
            }

        });


    </script>


    <title>Document</title>
</head>
<body>
<h3>Hello World</h3>


</body>
</html>