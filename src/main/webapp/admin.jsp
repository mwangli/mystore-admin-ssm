<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="css/style.css" type="text/css"/>
    <link rel="stylesheet" href="css/amazeui.min.css"/>
    <link rel="stylesheet" href="js/pageStyle.css">
    <script src="js/jquery.min.js"></script>
</head>
<body>

<div class="main_top">
    <div class="am-cf am-padding am-padding-bottom-0">
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">管理员列表</strong>
            <small></small>
        </div>
    </div>
    <hr>
    <div class="am-g">
        <div class="am-u-sm-12 am-u-md-6">
            <div class="am-btn-toolbar">
                <div class="am-btn-group am-btn-group-xs">
                    <button id="add" class="am-btn am-btn-default">
                        <span class="am-icon-plus"></span> 添加管理员
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>

<div class="goods_list" id="account_List">
    <ul class="title_ul">
        <li>序号</li>

        <li>用户</li>
        <li>修改密码</li>
        <li>移除管理员</li>
    </ul>
    <c:forEach items="${list}" var="admin" varStatus="status">
        <ul class="list_goods_ul">
            <li>${status.index+1}</li>
            <li>${admin.name}</li>

            <li><a href="#"><img class="img_icon" src="images/edit_icon.png" alt=""></a></li>
            <li><a href="#"><img class="img_icon" src="images/delete_icon.png" alt=""></a></li>
        </ul>
    </c:forEach>
</div>
<div id="modal_view">
</div>
<div id="modal_content_account">
    <div id="close"><img src="images/delete_icon.png" alt=""></div>
    <div class="edit_content">

        <div class="item1">
            <div>
                <span>添加管理员：</span>
            </div>
        </div>
        <div class="item1">
            <div>
                <span>用户名：</span>
                <input type="text" class="am-form-field">&nbsp;&nbsp;
            </div>

        </div>
        <div class="item1">
            <div>
                <span>用户名：</span>
                <input type="text" class="am-form-field">&nbsp;&nbsp;
            </div>

        </div>
        <div class="item1">
            <button class="am-btn am-btn-default" type="button">添加</button>
        </div>

    </div>
</div>

<script>
    $(function () {
        $('#add').click(function () {
            $("#modal_view").fadeIn();
            $("#modal_content_account").fadeIn();
        });

        $("#close").click(function () {
            $("#modal_view").fadeOut();
            $("#modal_content_account").fadeOut();
        });
    });
</script>
</body>
</html>