<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import = "org.manav.javabrains.model.User"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SUCCESS</title>
</head>
<body>

<h3> Success Login!</h3>

<br>

<% 
User user = (User) request.getAttribute("user");
%>
<h5>Welcome <%=user.getUserName() %> !!!</h>
</body>
</html>