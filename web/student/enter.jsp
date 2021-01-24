<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 19:58
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
    <title>报名</title>
</head>
<body>
<div style="text-align: center;">
    <h1>学员报名</h1>
    <form action="student" class="container" method="post">
        <div>
            <span>讲座：</span>
            <input type="text" class="common" value="系统分析与设计" disabled placeholder="讲座名称"/>
        </div>
        <div>
            <span>姓名：</span>
            <input type="text" class="common" maxlength="20" placeholder="专家姓名">
        </div>
        <div>
            <span>性别：</span>
            <input type="radio" id="male" name="sex" placeholder="男"/>
            <label for="male">男</label>
            <input type="radio" id="female" name="sex" placeholder="女"/>
            <label for="female">女</label>
        </div>
        <div>
            <span>单位名称：</span>
            <input type="text" class="common" maxlength="20" placeholder="单位名称"/>
        </div>
        <div>
            <span>职位：</span>
            <input type="text" class="common" maxlength="20" placeholder="职位">
        </div>
        <div>
            <span>手机：</span>
            <input type="text" class="common" maxlength="20" placeholder="手机">
        </div>
        <div>
            <span>邮箱：</span>
            <input type="text" class="common" maxlength="20" placeholder="邮箱">
        </div>
        <div>
            <span></span>
            <input type="submit" class="common" value="提交"/>
        </div>
        <input type="hidden" name="action" value="post"/>
    </form>
</div>
</body>
</html>
