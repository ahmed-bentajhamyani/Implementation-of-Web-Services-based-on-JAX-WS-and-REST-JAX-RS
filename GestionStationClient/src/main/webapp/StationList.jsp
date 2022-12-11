<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Gestion des Stations</title>
</head>
<body>
	<center>
		<h2>
			<a href="/GestionStationClient/station?action=list">List of Stations</a>
			&nbsp;&nbsp;&nbsp; <a href="/GestionStationClient/commande?action=list">List of
				Commandes</a> &nbsp;&nbsp;&nbsp; <a href="/GestionStationClient/client?action=list">List
				of Clients</a> &nbsp;&nbsp;&nbsp; <a href="/GestionStationClient/lignecmd?action=list">List
				of Ligne Commandes</a>
		</h2>
		<h1>Station Management</h1>
		<h2>
			<a href="/GestionStationClient/station?action=new">Add New Station</a> &nbsp;&nbsp;&nbsp;
			<a href="/GestionStationClient/station?action=list">List of Stations</a>

		</h2>
	</center>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Stations</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Nom</th>
				<th>Ville</th>
                <th>Adresse</th>
			</tr>
			<c:forEach var="station" items="${listStation}">
				<tr>
					<td><c:out value="${station.stationId}" /></td>
					<td><c:out value="${station.nom}" /></td>
					<td><c:out value="${station.ville}" /></td>
                    <td><c:out value="${station.adresse}" /></td>
					<td><a
						href="/GestionStationClient/station?action=edit&id=<c:out value='${station.stationId}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="/GestionStationClient/station?action=delete&id=<c:out value='${station.stationId}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>