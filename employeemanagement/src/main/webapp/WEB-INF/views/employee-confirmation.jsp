<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Details Saved!
	<br>
	<br> emp No: ${emp.empNo}
	<br>emp name: ${emp.empName}
	<br>joining date: ${emp.dateOfJoining }
	<br>salary: ${emp.salary }
	<br>dept: ${emp.dept }
	<br>
	<a href="${pageContext.request.contextPath }/">Back</a>
</body>
</html>