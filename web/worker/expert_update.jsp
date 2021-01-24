<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 20:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../style.css" />
    <style>
        .container{
            width: 40%;
            margin: 20px auto;
        }
        .common{
            width:230px;
            height: 30px;
        }
        .big{
            width:230px;
            height:100px;
        }
        span{
            display:inline-block;
            width: 150px;

            text-align: right;
        }
        div{
            margin-bottom: 10px;
        }
    </style>
    <title>更新专家信息</title>
</head>
<body>
<%@include file="../header.jsp" %>
<ul>
    <c:forEach var="error" items="${errors}">
        <li class="error">${error}</li>
    </c:forEach>
</ul>
<div style="text-align: center;">
    <h1>更新专家信息</h1>
    <form action="expert" class="container" method="post">
        <div>
            <label for="id">编号：</label>
            <input id="id" type="text" class="common" name="id" maxlength="20"/>
        </div>
        <div>
            <label for="name">姓名：</label>
            <input id="name" type="text" class="common" name="name" maxlength="20"/>
        </div>
        <div>
            <label for="sex">性别：</label>
            <input id="sex" type="text" class="common" name="sex" maxlength="20"/>
        </div>
        <div>
            <label for="area">领域：</label>
            <input id="area" type="text" class="common" name="area" maxlength="20"/>
        </div>
        <div>
            <label for="organizationId">单位编号：</label>
            <input id="organizationId" type="text" class="common" name="organizationId" maxlength="20">
        </div>
        <div>
            <label for="job">职位：</label>
            <input id="job" type="text" class="common" name="job" maxlength="20"/>
        </div>
        <div>
            <label for="location">地址：</label>
            <input id="location" type="text" class="common" name="location" maxlength="20">
        </div>
        <div>
            <label for="phone">手机：</label>
            <input id="phone" type="text" class="common" name="phone" maxlength="20">
        </div>
        <div>
            <label for="location">邮箱：</label>
            <input id="email" type="text" class="common" name="email" maxlength="20">
        </div>
        <div>
            <label for="submit"></label>
            <input id="submit" type="submit" class="common" value="提交"/>
        </div>
        <input type="hidden" name="action" value="post"/>
    </form>
    <a href="main.jsp"><button class="common">返回</button></a>
</div>
<%@include file="../footer.jsp" %>
</body>
</html>
