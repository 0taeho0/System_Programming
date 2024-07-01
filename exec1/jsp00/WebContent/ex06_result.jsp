<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int mat = Integer.parseInt(request.getParameter("mat"));
		int inf = Integer.parseInt(request.getParameter("inf"));
		int tot = kor + eng + mat + inf;
		double avg = tot / 4.;
	%>
	국어 : <%= request.getParameter("kor") %><br>
	영어 : <%= request.getParameter("eng") %><br>
	수학 : <%= mat%><br>
	정보 : <%= inf%><br>
	합계 : <%= tot%><br>
	평균 : <%= avg%><br>
</body>
</html>