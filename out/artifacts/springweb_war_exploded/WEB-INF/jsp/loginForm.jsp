<%--
  Created by IntelliJ IDEA.
  User: Gaol
  Date: 2018/4/16
  Time: 07:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>LoginForm</title>
    <%@include file="head.jsp"%>
</head>
<body>
<div class="container">
    <h2>用户登录</h2>
    <form action="login" method="post">
        <div class="form-group">
            <label>用户名:</label>
            <input type="text" class="form-control" id="loginName" name="loginName" placeholder="请输入用户名">
        </div>
        <div class="form-group">
            <label>密码:</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="请输入密码">
        </div>
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
</div>
</body>
</html>
