<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red
}
</style>
</head>
<body>
	<form:form action="processForm" modelAttribute="employee">
		Emp no: <form:input path="empNo" />
		<form:errors path="empNo" cssClass="error" />
		<br>
		Emp name: <form:input path="empName" />
		<form:errors path="empName" cssClass="error" />
		<br>
		Emp Date of joining: <form:input path="dateOfJoining" />
		<form:errors path="dateOfJoining" cssClass="error" />
		<br>
		salary: <form:input path="salary" />
		<form:errors path="salary" cssClass="error" />
		<br>
		Department: <form:select path="dept">
			<form:options items="${departments.depts}" />
		</form:select>
		<form:select path="dept" cssClass="error" />
		<br>
		<button type="submit" formaction="${pageContext.request.contextPath }/processForm">Submit</button>
		<button type="submit" formaction="${pageContext.request.contextPath }/searchDetails">Search</button>
		<input type="reset">
	</form:form>
</body>
</html>