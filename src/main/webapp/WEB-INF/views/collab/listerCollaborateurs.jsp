<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.List"  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SGP-App</title>
</head>
<body>
		<h1>les collaboooss</h1>7
		<ul> <% List <String> listNoms = (List<String>)request.getAttribute("listNoms");
				for (String nom : listNoms)
				{
				%>
					<li><%= nom%></li>	
				<%
			}
				%>
			
		</ul>
</body>
</html>