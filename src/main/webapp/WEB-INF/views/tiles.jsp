<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<div>
	<table style="border:1px solid; ">
	<tr>
			<th>sentno</th>
			<th>senttype</th>
			<th>sentcont</th>
		</tr>
<c:forEach var="jObj" items="${restRES_arraylist}"><!-- �𵨿��� addattribute�� ������ �ٷ� �� �� ���� -->
	<tr>
		<td> 
			${jObj.sentno}
		</td>
		<td> 
			${jObj.senttype}
		</td>
		<td> 
			${jObj.sentcont}
		</td>
	</tr>
</c:forEach>
	</table>
	</div>

</body>
</html>