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
   var finp = document.formInput;
   if(!document.formInput.kor.value) {
      alert("국어 성적을 입력하세요");
      document.formInput.kor.focus();
      return false;
   }else if(!finp.eng.value) {
      alert("영어 점수를 입력하세요");
      finp.eng.focus();
      return false;
   }else if(!finp.mat.value) {
      alert("수학 점수를 입력하세요");
      finp.mat.focus();
      return false;
   }else if(!finp.inf.value) {
      alert("정보 점수를 입력하세요");
      finp.inf.focus();
      return false;
   }
}
</script>