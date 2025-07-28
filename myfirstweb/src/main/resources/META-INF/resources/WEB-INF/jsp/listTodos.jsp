<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>
<body>
<div class="container">
	<h1>${name}님의 할일</h1>
	<table class="table">
		<thead>
			<tr>
				<th>내용</th>
				<th>목표일</th>
				<th>완료여부</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>
					<td><a href="delete-todo?id=${todo.id}"
						class="btn btn-warning">삭제하기</a></td>
					<td><a href="update-todo?id=${todo.id}"
						class="btn btn-success">수정하기</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<a href="add-todo" class="btn btn-success">할일 추가하기</a>
</div>