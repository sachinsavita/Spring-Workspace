<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
<h3>Hello World of Spring</h3>

<br>
<!-- Here I am using public String processForm() -->
Welcome home ${param.myname}
<br>

<!-- Here I am using method ---> <!-- public String letsShoutDude(HttpServletRequest request, Model model) -->
The Message:  ${message}


</body>
</html>