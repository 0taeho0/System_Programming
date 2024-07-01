<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>요청정보</title>
</head>
<body>
	안녕하세요~<br>
	현재시간은 <%= new java.util.Date() %> 입니다.<br>
	클라리언트IP : <%= request.getRemoteAddr() %> <br>
	요청정보 길이 : <%= request.getContentLength() %><br>
	요청정보 인코딩 : <%= request.getCharacterEncoding() %><br>
	요청정보 문서타입 : <%= request.getContentType() %><br>
	요청정보 전송방식 : <%= request.getMethod() %><br>
	요청 URL : <%= request.getRequestURL() %> <br>
	요청 URI : <%= request.getRequestURI() %> <br>
	컨텍스트 경로 : <%= request.getContextPath() %><hr>
	서버이름 : <%= request.getServerName() %><br>
	서버포트 : <%= request.getServerPort() %><br>
</body>
</html>