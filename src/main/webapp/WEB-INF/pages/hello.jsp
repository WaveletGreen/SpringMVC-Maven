<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试主题页</title>
</head>
<body>
	<h1 style="color: blue">${greeting}</h1>
	<ul>
		<li><a href="withhttp">测试servlet原生</a></li>
		<li><a href="redirect">测试重定向</a></li>
		<li><a href="pathVariable">测试PathVariable</a></li>
		<li><a href="getResopnse">获取返回主体</a></li>
		<li><a href="getResponseObject">获取返回对象</a></li>
	</ul>
</body>
</html>