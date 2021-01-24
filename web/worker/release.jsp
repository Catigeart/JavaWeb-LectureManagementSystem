<%--
  Created by IntelliJ IDEA.
  User: Catigeart
  Date: 2021/1/18
  Time: 20:22
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
    <title>发布讲座</title>
</head>
<body>
<%@include file="../header.jsp" %>
<div style="text-align: center;">
    <h1>发布讲座信息</h1>
    <form action="release" class="container" method="post">
        <div>
            <span>计划编号：</span>
            <input type="text" name="planId" class="common" maxlength="20" placeholder="计划编号"/>
        </div>
        <div>
            <span>名称：</span>
            <input type="text" name="name" class="common" maxlength="20" placeholder="名称"/>
        </div>
        <div>
            <span>主题：</span>
            <input type="text" name="topic" class="common" maxlength="20" placeholder="主题"/>
        </div>
        <div>
            <span>专家编号：</span>
            <input type="text" name="expertId" class="common" maxlength="20" placeholder="专家"/>
        </div>
        <div>
            <span>介绍：</span>
            <input type="text" name="introduction" class="big" maxlength="20" placeholder="介绍"/>
        </div>
        <div>
            <label for="host">主办方：</label>
            <input id="host" name="host" type="text" class="common"/>
        </div>
        <div>
            <label for="beginDate">开始日期：</label>
            <input id="beginDate" name="beginDate" type="date" value="2021-01-01"/>
            <label for="beginTime">开始时间：</label>
            <input id="beginTime" name="beginTime" type="time" value="08:00:00"/>
        </div>
        <div>
            <label for="endDate">结束日期：</label>
            <input id="endDate" name="endDate" type="date" value="2021-01-01"/>
            <label for="endTime">结束时间：</label>
            <input id="endTime" name="endTime" type="time" value="08:00:00"/>
        </div>
        <div>
            <span>地点：</span>
            <input type="text" name="location" class="common" maxlength="20" placeholder=""/>
        </div>
        <div>
            <span>报名人数上限：</span>
            <input type="text" name="maxStudentNumber" class="common" maxlength="20" placeholder=""/>
        </div>
        <div>
            <label for="latestDate">最迟报名时间</label>
            <input type="date" id="latestDate" name="latestDate" value="2021-01-01"/>
        </div>
        <div>
            <label for="workingYear">工作时限</label>
            <input type="text" id="workingYear" name="workingYear" maxlength="5"/>
        </div>
        <div>
            <label for="job">职位限制</label>
            <input type="text" id="job" name="job" maxlength="20"/>
        </div>
        <div>

        </div>
        <div>
            <span></span>
            <input type="submit" class="common" value="提交"/>
        </div>
        <div>
            <span></span>
        </div>
        <input type="hidden" name="action" value="post"/>
    </form>
    <a href="main.jsp"><button>返回</button></a>
</div>
<%@include file="../footer.jsp" %>
</body>
</html>
