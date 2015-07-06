<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><tiles:insertAttribute name="title" /></title>
<tiles:insertAttribute name="css" />
</head>
<body>

<div style="width:100%;height:100%;border:1px solid black;float:left;">
	<div style="width:100%;height:13%;border:1px solid black;float:left;">
		<tiles:insertAttribute name="search" />
	</div>
	<div style="width:100%;height:13%;border:1px solid black;float:left;">
		<tiles:insertAttribute name="menu" />
	</div>
	<div style="width:100%;height:74%;border:1px solid black;float:left;">
		<tiles:insertAttribute name="main" />
	</div>
</div>



</body>
</html>