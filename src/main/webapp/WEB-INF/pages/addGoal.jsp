<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Goal</title>
</head>
<body>
	<h1>Add Goal</h1>
	<form:form commandName="goal">
		Enter Minutes
		<form:input path="minutes"/>
		<input type="submit" value="Enter Goal Minutes"/>
	</form:form>
</body>
</html>