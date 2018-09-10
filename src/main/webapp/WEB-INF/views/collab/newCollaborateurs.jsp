<%@page import="dev.sgp.web.NewCollaborateurController"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
<link rel="stylesheet" href="/resources/demos/style.css">


<title>Insert title here</title>
</head>
<body>
	<div class="container">

		<form method="post" action="newCollaborateur">
			<div class="form-group">
				<label for="nom">Nom : </label> <input type="text"
					class="form-control" name="nom" placeholder="Nom" required>
			</div>
			<div class="form-group">
				<label for="prenom">Prénom : </label> <input type="text"
					class="form-control" name="prenom" placeholder="Prénom" required>
			</div>

			<div class="form-group">
				<label for="adresse">Adresse : </label> <input type="text"
					class="form-control" name="adresse" placeholder="adresse" required>
			</div>
			
			<div class="form-group">
				<label for="adresse">date : </label> <input type="date"
					class="form-control" name="dateN"  required>
			</div>
			
			

			<div class="form-group">
				<label for="numeroSecuriteSocial">Numéro de sécurité social
					: </label> <input type="text" class="form-control"
					name="numeroSecuriteSocial" placeholder="numero de securite social"
					required>
			</div>



			<button class="btn" type="submit">Envoyer</button>
		</form>

	</div>


	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

	<!-- Popper JS -->
	<script
		src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"></script>

	<!-- Latest compiled JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"></script>
</body>

</html>