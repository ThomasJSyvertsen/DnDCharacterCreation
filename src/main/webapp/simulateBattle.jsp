<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>DnD Characters</title>
</head>

<body>
	<h1>Simulate a battle</h1>
	<form action="simulateBattleServlet" method="post">
		<p>Enter attacking character:</p>
		<input type="number" name="attackingCharacter" size="6"> 
		<p>Enter defending character: </p>
		<input type="number" name="defendingCharacter" size="6">
		<input type="submit" value="simulateAttack" />
	</form>
</body>
</html>