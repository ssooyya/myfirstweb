<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="common/header.jspf"%>
<%@include file="common/navigation.jspf"%>
<body>
<div class="container">
	<div>${name}님 환영합니다!</div>
	<div>
		${name}님의 할일 <a href="list-todos">관리하러 가기</a>
	</div>
</div>
<%@include file="common/footer.jspf"%>