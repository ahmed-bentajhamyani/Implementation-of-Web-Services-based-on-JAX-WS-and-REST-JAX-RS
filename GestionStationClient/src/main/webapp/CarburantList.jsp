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
			<a href="/GestionStationClient/carburant?action=list">List of Carburants</a>
			&nbsp;&nbsp;&nbsp; <a href="/GestionStationClient/commande?action=list">List of
				Commandes</a> &nbsp;&nbsp;&nbsp; <a href="/GestionStationClient/client?action=list">List
				of Clients</a> &nbsp;&nbsp;&nbsp; <a href="/GestionStationClient/lignecmd?action=list">List
				of Ligne Commandes</a>
		</h2>
		<h1>carburant Management</h1>
		<h2>
			<a href="/GestionStationClient/carburant?action=new">Add New carburant</a> &nbsp;&nbsp;&nbsp;
			<a href="/GestionStationClient/carburant?action=list">List of Carburants</a>

		</h2>
	</center>
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Carburants</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Nom</th>
				<th>Description</th>
			</tr>
			<c:forEach var="carburant" items="${listCarburant}">
				<tr>
					<td><c:out value="${carburant.carburantId}" /></td>
					<td><c:out value="${carburant.nom}" /></td>
					<td><c:out value="${carburant.description}" /></td>
					<td><a
						href="/GestionStationClient/carburant?action=edit&id=<c:out value='${carburant.carburantId}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="/GestionStationClient/carburant?action=delete&id=<c:out value='${carburant.carburantId}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>