<%@page pageEncoding="utf-8" contentType="text/html; UTF-8" isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <script type="text/javascript" src="/springboot_day2/js/jquery.min.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/jquery.edatagrid.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/datagrid-detailview.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/echarts.min.js"></script>
    <script type="text/javascript" src="/springboot_day2/js/china.js"></script>

    <script type="text/javascript">
        $(function () {
            $.ajax({
                url: "${pageContext.request.contextPath}/originality/showAll",
                type: "post",
                dataType: "JSON",//将他转化为js对象
                /*data:""在这里处理请求参数*/
                success: function (success) {
                    //var jsonObj=eval("("+date+")");
                    var tbody = "";
                    //$.each(success,function(index,originality))
                    //success(拿到的是js对象|数组)  function(下标，遍历出来的对象)
                    $.each(success, function (index, list) {
                        //alert(index+''+list);
                        var trs = "";
                        //通过对象.属性   获取到值
                        trs += "<tr><td >" + list.title + "</td></tr>" +
                            "<tr><td>" + list.content + "</td></tr>" +
                            "<tr><td>" + list.imgContent + "</td></tr>" +
                            //"<tr><td>"+list.img+"</td></tr>"+
                            "<tr><td>" + '<img src=' + "audio/" + list.newName + '>' + "</td></tr>";


                        //$("#albumdetail").dialog('open');
                        //$("#albumdesimg").prop("src","${pageContext.request.contextPath}"+list.img);
                        //alert(list.id)
                        tbody += trs;
                        //alert("id="+second.id+"    title="+second.title+"    content="+second.content);

                        //$.each(list.originalities,function(index1,second){
                        //console.log(list)


                        console.log(list);
                        //$('#albumdetailform').form('load',list);
                        //$("#albumdesimg").prop("src","${pageContext.request.contextPath}"+row.coverImg);
                        //c += "<p style='text-align:center'><a href='#' class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" onclick=\"addTabs('"+second.id+"','"+second.title+"','"+second.content+"')\">"+second.img+"</a></p>"
                        //});
                    });
                    $("#project").append(tbody)
                }
            });
        });

        $.get("url", {"username": "zhangsan", "password": "123456"}, function (result) {


        }, JSON);

        /*$.each(success,function(index,first){
            var c ="";
            //menus  是实体类中list的属性  将对象转化为list集合
            $.each(first.menus,function(index1,second){
                /!*console.log(second)*!/
                c += "<p style='text-align:center'><a href='#' class=\"easyui-linkbutton\" data-options=\"iconCls:'icon-search'\" onclick=\"addTabs('"+second.name+"','"+second.href+"','"+second.iconCls+"')\">"+second.name+"</a></p>"
            });
            $('#t_menu').accordion('add', {
                title: first.name,
                content: c,
                selected: false,
                iconCls:first.iconCls
            });
        });*/


    </script>
</head>

<body>
<h2>Hello World!</h2>

<div id="project">


</div>


<%--<div id="albumdetail" class="easyui-dialog"  title="专辑详情" style="width:400px;height:200px;"
     data-options="iconCls:'icon-save',resizable:true,modal:true,closed:true">

    <div>
        <img id="albumdesimg" src="C:\MyIDEA\springboot_day2\src\main\webapp\audio/cee0ac29-edb6-4f4b-a96c-86270e748e82.jpg">
    </div>
    &lt;%&ndash;<form id="albumdetailform" method="post" style="text-align: center">
        <div>
            <label for="1">标题:</label>
            <input id="1" class="easyui-validatebox" type="text" name="title" data-options="required:true" />
        </div>
        <div>            <label for="2">内容:</label>
            <input id="2" class="easyui-validatebox" type="text" name="content" data-options="" />
        </div>
        <div>
            <label for="3">图片信息:</label>
            <input id="3" class="easyui-validatebox" type="text" name="imgContent" data-options="" />
        </div>

    </form>&ndash;%&gt;


</div>--%>


</body>
</html>

