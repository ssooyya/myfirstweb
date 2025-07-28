<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="common/header.jspf"%>
<%@ include file="common/navigation.jspf"%>

<div class="container">
	<h1>할일 세부정보를 입력하세요</h1>
	
	<form:form method="post" modelAttribute="todo">
	
		<fieldset class="mb-3">
			<form:label path="description">내용</form:label>
			<form:input type="text" path="description" required="required" cssClass="form-control"/>
			<form:errors path="description" cssClass="text-warning" />
		</fieldset>
		
		<fieldset class="mb-3">
			<form:label path="targetDate">목표일</form:label>
			<form:input type="date" path="targetDate" required="required" cssClass="form-control"/>
			<form:errors path="targetDate" cssClass="text-warning" />
		</fieldset>

		<form:input type="hidden" path="id" />
		<form:input type="hidden" path="done" />
		<input type="submit" class="btn btn-success" />
		
		<script type="text/javascript">
		$('#targetDate').datepicker({
			format:'yyyy-mm-dd'
		});
		</script>
	</form:form>
</div>
<%@include file="common/footer.jspf"%>