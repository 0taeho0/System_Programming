<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이제 HTML JSP를 시작합니다. <br>
	
	<%
		String strA = "스크립트릿 태그A : ";
	for(int i=0; i<5; i++){
		out.println(strA + i + "<br>" );
	}
	%>
	<hr>
	<%
		String strB = "스크립트릿 태그B : ";
	for(int i=0; i<5; i++){
		out.println(strB + i + "<br>" );	
	}
	%>
	
	이제 HTML JSP를 종료합니다.
</body>
</html>