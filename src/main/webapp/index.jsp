<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE HTML>
<html dir="ltr" lang="en-US">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>码蚁商城后台管理系统</title>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
</head>
<body>
<div id="container">
    <form action="login.do" method="post">
        <div class="login">码蚁商城后台管理系统
            <span style="color:red">${error}</span>
        </div>
        <div class="username-text">用户名:</div>
        <div class="password-text">密码:</div>
        <div class="username-field">
            <input type="text" name="name" value=""/>
        </div>
        <div class="password-field">
            <input type="password" name="password" value=""/>
        </div>
        <input type="checkbox" name="remember-me" id="remember-me"/>
        <label for="remember-me">记住用户名</label>
        <div class="forgot-usr-pwd"></div>
        <input type="submit" value="GO"/>
    </form>
</div>
</body>
</html>
