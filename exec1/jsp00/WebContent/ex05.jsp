<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!
	int global_cnt = 0;
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청정보</title>
</head>
<body>
	<%
		int local_cnt = 0;
	
		out.print("<br> local_cnt : ");
		out.print(++local_cnt);

		out.print("<br> global_cnt : ");
		out.print(++global_cnt);
		%>
</body>
</html>