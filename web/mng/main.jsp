<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 15:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../style.css" />
    <title>经理主页</title>
</head>
<body>
<%@include file="../header.jsp" %>
<div style="text-align: center;">
    <h1>经理主页</h1>
    <a href="expert?action=get"><button>查看专家候选</button></a>
    <a href="plan.jsp"><button>拟定讲座计划</button></a>
</div>
<%@include file="../footer.jsp" %>
</body>
</html>
