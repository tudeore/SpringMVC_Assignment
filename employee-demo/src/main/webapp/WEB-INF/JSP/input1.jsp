<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sprng" uri="http://www.springframework.org/tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
	.error{
		color: red	
	}
</style>
</head>
<body>
<spring:form action="save" method="post" modelAttribute="employee">
	
	Employee Id:<spring:input path="empId"/><spring:errors path="empId" cssClass="error"/><br/><br>
	Full Name:<spring:input path="empName"/><spring:errors path="empName" cssClass="error"/><br/><br>
	Salary:<spring:input path="salary"/><spring:errors path="salary" cssClass="error"/><br/><br>
	<input type="submit" value="Submit"/>
</spring:form>
</body>
</html>