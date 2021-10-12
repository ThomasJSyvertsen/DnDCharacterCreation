<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="CSS/bootstrap-4.0.0-dist/css/bootstrap.min.css" />
<title>DnD Characters</title>
</head>

<body>
	<div class="container">
		<div class="row col-10 justify-content-center">
			<h1 class="jumbotron">What would you like to do?</h1>
		</div>

		<div class="row col-10 justify-content-center">
			<ul class="list-unstyled">
				<li class="mb-2"><a href="createCharacter.jsp"
					class="list-group-item list-group-item-action">Create a
						character</a></li>
				<li class="mb-2"><a href="editCharacter.jsp"
					class="list-group-item list-group-item-action">Edit a character</a></li>
				<li><a href="simulateBattle.jsp"
					class="list-group-item list-group-item-action">Simulate a
						battle</a></li>
				<li class="mb-2"><a href="removeCharacter.jsp"
					class="list-group-item list-group-item-action">Remove a
						character</a></li>
			</ul>
		</div>

	</div>
</body>
</html>