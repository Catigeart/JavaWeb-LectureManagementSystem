<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 20:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../style.css" />
    <title>登录</title>
</head>
<body>
<div style="text-align: center;">
    <h1>组织工作人员登录</h1>
    <form action="user" method="post">
        <div style="display: inline-block">
            <div>
                <span>用户名：</span>
                <input type="text" name="username" class="common" maxlength="20" placeholder="输入用户名"/>
            </div>
            <div>
                <span>密&nbsp&nbsp&nbsp&nbsp码：</span>
                <input type="password" name="password" class="common" maxlength="20" placeholder="输入密码"/>
            </div>
            <div style="text-align:center;">
                <span>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</span>
                <input type="submit" value="登录" class="common" style="text-align:center" />
            </div>
        </div>
        <input type="hidden" name="action" value="login"/>
    </form>
</div>
</body>
</html>
