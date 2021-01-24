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
    <title>专家信息</title>
</head>
<body>
<%@include file="../header.jsp" %>
<div style="text-align: center;">
    <h1>专家信息</h1>
    <table width="100%" border="0" align="center">
        <tr bgcolor="#b4c8ed">
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>领域</th>
            <th>单位</th>
            <th>职位</th>
            <th>联系地址</th>
            <th>手机</th>
            <th>邮箱</th>
        </tr>
        <c:forEach var="expert" items="${expertList}" varStatus="status">
            <tr
                    <c:if test="${status.index % 2 == 0}">
                        bgcolor='#ffffff'
                    </c:if>
                    <c:if test="${status.index % 2 != 0}">
                        bgcolor='#edf8ff'
                    </c:if>
            >
                <td>${expert.id}</td>
                <td>${expert.name}</td>
                <td>${expert.sex}</td>
                <td>${expert.area}</td>
                <td>${expert.organization.name}</td>
                <td>${expert.job}</td>
                <td>${expert.address}</td>
                <td>${expert.phone}</td>
                <td>${expert.email}</td>
            </tr>
        </c:forEach>
    </table>
    <a href="main.jsp"><button>返回</button></a>
</div>
<%@include file="../footer.jsp" %>
</body>
</html>
