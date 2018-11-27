<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title></title>
    <script type="text/javascript" src="../../../static/js/jquery-1.12.4.js"></script>
    <script type="text/javascript">
        $(document).ready(function(){
            $(".dele").click(function(){
                if(confirm("确定删除吗？")){
                    return true;
                }else{
                    return false;
                }
            });
            $(".dele").click(function () {
                $.ajax({
                    "url":"/entry/delete",
                    "type":"get",
                    "data":"id="+$(this).next().val(),
                    "dataType":"json",
                    "success":function create(data) {
                        $("#tr_"+data+"").remove();
                        alert("2354====="+data)
                    },
                    "error":function () {
                        alert("error")
                    }
                })

            })
        });
    </script>
</head>
<body>
<form action="/entry/GetByName.html" method="get">
    <table align="center" border="1">
        <tr><td>文档分类：<select name="entry">
            <option value="">请选择</option>
            <option>IT计算机</option>
            <option>办公文档</option>
            <option>外语学习</option>
        </select>
            <input type="submit" value="查询">
            <input>
        </td>
        </tr>
        <tr>
            <td>文档编号</td>
            <td>文档名称</td>
            <td>文档摘要</td>
            <td>上传人</td>
            <td>上传日期</td>
            <td>操作</td>
        </tr>
        <c:forEach var="entry" items="${list }" varStatus="status">
            <tr id="tr_${entry.id }"
                    <c:if test="${status.index%2==0 }"> style=background-color:red;</c:if>>
                <td>${entry.id }</td>
                <td>${entry.title }</td>
                <td>${entry.summary }</td>
                <td>${entry.uplogaduser }</td>
                <td>${entry.createdate }</td>
                <td>
                    <a href="javascript:void(0)" class="dele">删除</a>
                    <input type="hidden" value="${entry.id }">
                </td>
            </tr>
        </c:forEach>
    </table>
</form>
</body>
</html>