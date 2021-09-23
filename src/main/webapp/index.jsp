<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DnD Characters</title>
</head>

<body>
	<h1>Create a DnD Character!</h1>
	<form action="addDnDCharacterServlet" method="post">
		<p>Enter your name:</p>
		<input type="text" name="playerName" size="20"> 
		<p>Enter character name: </p>
		<input type="text" name="characterName" size="20">
		<p>Enter hit points: </p>
		<input type="text" name="hitPoints" size="4">
		<p>Enter hit damage: </p>
		<input type="text" name="hitDamage" size="4">
		<input type="submit" value="Create Character" />
	</form>
</body>
</html>