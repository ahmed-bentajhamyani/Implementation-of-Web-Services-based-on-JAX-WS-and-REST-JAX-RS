<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Accueil</title>
</head>
<body>
	<div align="center">
		<form action="/GestionStationClient/histocarb?action=compare"
			method="post">
			<table border="1" cellpadding="5">
				<caption>
					<h2>Chercher le prix des deux Carburants:</h2>
				</caption>
				<tr>
					<th>Nom du Station:</th>
					<td><input type="text" name="nom" size="45" /></td>
				</tr>
				<tr>
					<th>La date:</th>
					<td><input type="date" name="date" size="45" /></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="Chercher" /></td>
				</tr>
			</table>
		</form>

		<h2>
			<a href="/GestionStationClient/station">List des Stations</a>
			&nbsp;&nbsp;&nbsp; <a href="/GestionStationClient/carburant">List
				des Carburants</a> &nbsp;&nbsp;&nbsp; <a
				href="/GestionStationClient/histocarb">List des Histogrames des
				Carburants</a>
		</h2>
	</div>
</body>
</html>