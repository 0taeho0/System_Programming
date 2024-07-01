<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>
</head>
<script type="text/javascript">
function checkValue() {
	var tf = document.testForm
	if(!document.testForm.kor.value){
		alert("국어 성적을 입력하세요.");
		document.testForm.kor.focus();
		return false;
	} else if(!tf.inf.value){
		alert("정보 점수를 입력하세요.");
		tf.inf.focus();
		return false;
	} else if(tf.rmk.value==""){
		alert("평가 내용을 입력하세요.");
		tf.rmk.focus();
		return false;
	} else if(tf.rmk.value.length < 4 || tf.rmk.value.length > 12){
		alert("평가는 4자~12자 내에서 입력하세요");
		tf.rmk.focus();
		return false;
	}
}
</script>
<body>

</body>