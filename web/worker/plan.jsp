<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../style.css" />
    <title>专家信息</title>
</head>
<body>
<%@include file="../header.jsp" %>
<div style="text-align: center;">
    <h1>计划列表</h1>
    <table width="100%" border="0" align="center">
        <tr bgcolor="#b4c8ed">
            <th>编号</th>
            <th>主题</th>
            <th>描述</th>
            <th>专家</th>
            <th>专家描述</th>
            <th>时间</th>
            <th>地点</th>
            <th>落实情况</th>
        </tr>
        <c:forEach var="plan" items="${planList}" varStatus="status">
            <tr
                    <c:if test="${status.index % 2 == 0}">
                        bgcolor='#ffffff'
                    </c:if>
                    <c:if test="${status.index % 2 != 0}">
                        bgcolor='#edf8ff'
                    </c:if>
            >
                <td>${plan.id}</td>
                <td>${plan.topic}</td>
                <td>${plan.description}</td>
                <td>${plan.expert}</td>
                <td>${plan.expertDescription}</td>
                <td>${plan.time}</td>
                <td>${plan.location}</td>
                <td>${plan.done}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="release.jsp"><button>发布讲座信息</button></a>
    <a href="main.jsp"><button>返回</button></a>
</div>
<%@include file="../footer.jsp" %>
</body>
</html>
