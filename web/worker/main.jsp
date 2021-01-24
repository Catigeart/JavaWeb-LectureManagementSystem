<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 16:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../style.css" />
    <title>主页</title>
</head>
<body>
<%@include file="../header.jsp" %>
<div style="text-align: center;">
    <h1>组织工作人员主页</h1>
    <a href="expert?action=get"><button>查看专家候选</button></a>
    <a href="expert_update.jsp"><button>更新专家资料</button></a>
    <a href="plan?action=get"><button>查看计划列表</button></a>
    <a href="release.jsp"><button>发布讲座信息</button></a>
</div>
<%@include file="../footer.jsp" %>
</body>
</html>
