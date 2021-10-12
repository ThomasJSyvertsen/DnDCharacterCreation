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
		<div class="row justify-content-center">
			<h1 class="jumbotron">Edit a DnD Character!</h1>
		</div>

		<div class="row">
			<form class="col" action="editDnDCharacterServlet" method="post">
				<div class="form-row">
					<div class="col col-4">
						<div class="form-group">
							<label for="playerId">Enter Character Id: 
							</label> <input type="text" class="form-control" id="playerId" 
								name="playerId" placeholder="1">
						</div>
					</div>
					<div class="col col-4">
						<div class="form-group">
							<label for="playerName">Enter your name:</label> <input
								type="text" class="form-control" id="playerName"
								name="playerName" placeholder="Jane Doe" size="20">
						</div>

						<div class="form-group">
							<label for="characterName">Enter character name:</label> <input
								type="text" class="form-control" id="characterName"
								name="characterName" placeholder="John Doe" size="20">
						</div>
					</div>

					<div class="col col-4">
						<div class="form-group">
							<label for="hitPoints">Enter hit points:</label> <input
								type="text" class="form-control" id="hitPoints" name="hitPoints"
								placeholder="30" size="4">
						</div>

						<div class="form-group">
							<label for="hitDamage">Enter hit damage:</label> <input
								type="text" class="form-control" id="hitDamage" name="hitDamage"
								placeholder="10" size="4">
						</div>
					</div>

					<div class="col col-4">
						<div class="form-group">
							<label for="strength">Enter Strength:</label> <input type="text"
								class="form-control" id="strength" name="strength"
								placeholder="1-20" size="2">
						</div>

						<div class="form-group">
							<label for="intelligence">Enter Intelligence:</label> <input
								type="text" class="form-control" id="intelligence"
								name="intelligence" placeholder="1-20" size="2">
						</div>
					</div>

					<div class="col col-4">
						<div class="form-group col">
							<label for="wisdom">Enter Wisdom:</label> <input type="text"
								class="form-control" id="wisdom" name="wisdom"
								placeholder="1-20" size="2">
						</div>

						<div class="form-group col">
							<label for="dexterity">Enter Dexterity:</label> <input
								type="text" class="form-control" id="dexterity" name="dexterity"
								placeholder="1-20" size="2">
						</div>
					</div>

					<div class="col col-4">
						<div class="form-group">
							<label for="constitution">Enter Constitution:</label> <input
								type="text" class="form-control" id="constitution"
								name="constitution" placeholder="1-20" size="2">
						</div>

						<div class="form-group">
							<label for="charisma">Enter Charisma:</label> <input type="text"
								class="form-control" id="charisma" name="charisma"
								placeholder="1-20" size="2">
						</div>
					</div>
				</div>

				<div class="form-row">
					<div class="col">
						<button type="submit" class="btn btn-primary">Update
							Character</button>
					</div>
				</div>

			</form>
		</div>
	</div>
</body>
</html>