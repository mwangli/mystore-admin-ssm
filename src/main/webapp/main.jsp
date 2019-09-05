<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<html>

<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Language" content="zh-cn">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>

<!--

frameset:对窗口进行分隔，不能够放到body当中

rows 上下分隔    70 *  上部占70  剩余高度全部给下部
cols 左右分隔    250 * 左边占250 剩余宽度全部给右边 

frame：分隔出来对应的窗口
frameborder：设置没有边框
src 设置当前窗口中显示的页面
name 链接时， 可以根据名称跳转到指定的窗口显示
scrolling：是否有滚动条

-->

<frameset rows="70,*" frameborder=0 border="0" framespacing="0">

    <frame src="top.jsp" name="topFrame" scrolling="NO" noresize>

    <frameset cols="250,*" frameborder="0" border="0" framespacing="10">

        <frame src="left.jsp" name="leftFrame" scrolling="NO">

        <frame src="listGoods.do" name="mainFrame">

    </frameset>

</frameset>


</html>
