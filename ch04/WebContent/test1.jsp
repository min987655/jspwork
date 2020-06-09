<%@page import="java.util.Random"%>
<!-- 다음페이지에 전송할 타입을 알려주는 코드 (문자 인코딩 알려줌) -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	Random r = new Random();
	int num =r.nextInt(5); // 0~4
	String name = "홍길동";
%>
<!DOCTYPE html>
<html>
<head>
<!-- 브라우저에서 읽을 때 적용되는 문자 인코딩 -->
<meta charset="UTF-8">
<title>랜덤 값 알아보기</title>
</head>
<body>
<h1>랜덤 값은 : <%=num %></h1>
<h2>이름은 : <%=name %></h2>
</body>
</html>