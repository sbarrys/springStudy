<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/main.css" />"/>
<title>Welcome~</title>
</head>

<body>
<div id="wrapper">
	<div id="header">
		<tiles:insertAttribute name="header"/>
	</div>
	<div id="nav">
		<tiles:insertAttribute name="nav"/>
	</div>	
	<div id="left">
		<tiles:insertAttribute name="left"/>
	</div>

	<div id="content">
		<tiles:insertAttribute name="content"/>
	</div>
	<div id="footer">
		<tiles:insertAttribute name="footer"/>
	</div>
</div>

</body>