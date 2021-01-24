<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 20:09
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
        span{
            display:inline-block;
            width: 150px;

            text-align: right;
        }
        div{
            margin-bottom: 10px;
        }
    </style>
    <title>注册</title>
</head>
<body>
<div style="text-align: center;">
    <h1>开发人员注册</h1>
    <form action="user" class="container">
        <div>
            <span>登录名：</span>
            <input type="text" name="username" class="common" maxlength="20" placeholder="输入登录名">
        </div>
        <div>
            <span>密码</span>
            <input type="password" name="password" class="common" maxlength="20" placeholder="输入密码">
        </div>
        <div>
            <span>确认密码</span>
            <input type="password" name="password" class="common" maxlength="20" placeholder="再次输入密码">
        </div>
        <div>
            <span>昵称：</span>
            <input type="text" name="nickname" class="common" maxlength="20" placeholder="输入昵称">
        </div>
        <div>
            <span>性别：</span>
            <input type="radio" id="male" name="sex"/>
            <label for="male">男</label>
            <input type="radio" id="female" name="sex"/>
            <label for="female">女</label>
        </div>
        <div>
            <span>手机：</span>
            <input type="text" name="phone" class="common" maxlength="20" placeholder="输入手机">
        </div>
        <div>
            <span>邮箱：</span>
            <input type="text" name="email" class="common" maxlength="20" placeholder="输入邮箱">
        </div>
        <div>
            <span></span>
            <input type="submit" class="common" value="提交"/>
        </div>
        <input type="hidden" name="action" value="register"/>
    </form>
</div>
</body>
</html>
