<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="dev.sgp.entite.Collaborateur"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="<%=request.getContextPath()%>/bootstrap-3.3.7-dist/css/boostrap.css">
<title>SGP-App</title>
</head>
<body>
	<h1>les collaboooss</h1>
	<div class=container>
		<form method="post" action="lister">
		<c:forEach var="entry" items="${requestScope.ListeCollaborateur}">
				<div class="card float-left mr-5" style="width: 18rem;">
					<img class="card-img-top"
						src="/sirh-getion-personnel/asset/raikko.jpg" alt="Card image cap">
					<div class="card-body p-2">
						<h5 class="card-title p-0 m-0">
					
			
							Nom : ${entry.nom}<br />
							<p class="card-text p-0 m-0">
								Prenom : ${entry.prenom}<br /> ${entry.adresse}<p class="card-text p-0 m-0"><br />	
							<p class="card-text p-0 m-0">
			
								${entry.numeroSecuriteSocial}<br />
			
							</c:forEach>
	<%--
			<%
				List<Collaborateur> listCollaborateurs = (List<Collaborateur>) request.getAttribute("ListeCollaborateur");

				for (Collaborateur c : listCollaborateurs) {
			%>
			<div class="card float-left mr-5" style="width: 18rem;">
				<img class="card-img-top"
					src="/sirh-getion-personnel/asset/raikko.jpg" alt="Card image cap">
				<div class="card-body p-2">
					<h5 class="card-title p-0 m-0">
						Nom complet :<%=c.getNom()%>
						<%=c.getPrenom()%></h5>
					<p class="card-text p-0 m-0">
						NSS:<%=c.getNumeroSecuriteSocial()%></p>
					<p class="card-text p-0 m-0">
						Adresse:
						<%=c.getAdresse()%></p>
					<p class="card-text p-0 m-0">
						Date de naissance :
						<%=c.getDateDeNaissance()%></p>
				</div>
			</div>
			<%
				}
			%>
--%>
		</form>
	</div>
	<%-- liste les noms de collaborateurs  --%>

</body>
</html>