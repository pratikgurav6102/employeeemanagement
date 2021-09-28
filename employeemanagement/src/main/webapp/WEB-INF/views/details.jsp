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

Requested Employee Details:
<br>
Emp name: ${employee.empName }
<br>
Emp no: ${employee.empNo }
<br>
Joining Date : ${employee.dateOfJoining }
<br>
Department: ${employee.dept }
<br>
Salary: ${employee.salary }
<br>
<a href="${pageContext.request.contextPath }/">Back</a>
<br>
</body>
</html>