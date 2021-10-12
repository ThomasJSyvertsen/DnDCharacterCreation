<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="container">
		<div class="row justify-content-center">
			<h1 class="jumbotron">Edit a DnD Character!</h1>
		</div>

		<div class="row">
			<form class="col" action="RemoveCharacterServlet" method="post">
				<div class="form-row">
					<div class="col col-4">
						<div class="form-group">
							<label for="playerId">Enter Character Id: </label> <input
								type="text" class="form-control" id="playerId" name="playerId"
								placeholder="1">
						</div>
					</div>
				</div>

				<div class="form-row">
					<div class="col">
						<button type="submit" class="btn btn-primary">Remove
							Character</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>