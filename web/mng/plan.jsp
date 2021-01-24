<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 19:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
    <title>拟定讲座计划</title>
</head>
<body>
<%@include file="../header.jsp" %>
<ul>
    <c:forEach var="error" items="${errors}">
        <li class="error">${error}</li>
    </c:forEach>
</ul>
<div style="text-align: center;">
    <h1>拟定讲座计划</h1>
    <form action="plan" class="container" method="post">
        <div>
            <span>主题：</span>
            <input type="text" name="topic" class="common" maxlength="20" placeholder="输入主题">
        </div>
        <div>
            <span>描述：</span>
            <input type="text" name="description" class="big" maxlength="20" placeholder="输入描述">
        </div>
        <div>
            <span>专家：</span>
            <input type="text" name="expert" class="common" maxlength="20" placeholder="输入专家">
        </div>
        <div>
            <span>专家描述：</span>
            <input type="text" name="expertDescription" class="big" maxlength="20" placeholder="输入专家描述">
        </div>
        <div>
            <span>时间描述：</span>
            <input type="text" name="time" class="common" maxlength="20" placeholder="输入时间">
        </div>
        <div>
            <span>地点描述：</span>
            <input type="text" name="location" class="common" maxlength="20" placeholder="输入地点">
        </div>
        <div>
            <span></span>
            <input type="submit" class="common" value="提交" placeholder="提交"/>
        </div>
        <input type="hidden" name="action" value="post"/>
    </form>
    <div>
        <span></span>
        <a href="main.jsp"><button class="common">返回</button></a>
    </div>
</div>
<%@include file="../footer.jsp" %>
</body>
</html>
