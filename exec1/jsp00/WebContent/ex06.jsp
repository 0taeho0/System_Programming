<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form name="formInput" action="ex08.jsp"
   onsubmit="return checkValue()" method="post">
   <h2>유효성 검사 / 입력 데이터 유무</h2>
   국어 : <input type="text" name="kor" ><br>
   영어 : <input type="text" name="eng" ><br>
   수학 : <input type="text" name="mat" ><br>
   정보 : <input type="text" name="inf" > <hr>
   입력 : <input type="submit" value= "확인">
         <input type ="reset" value="재작성">
</form>
</body>
</html>