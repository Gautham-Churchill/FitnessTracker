<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Minutes</title>
</head>
<body>
	<h1>Add Minutes</h1>
	Language: <a href="?language=en"> English</a> | <a href="?language=es"> Spanish</a> | <a href="?language=tamil"> Tamil</a>
	<form:form commandName="exercise">
		<spring:message code="goal.text"/>
		<form:input path="minutes"/>
		<input type="submit" value="Add exercise">
	</form:form>
</body>
</html>