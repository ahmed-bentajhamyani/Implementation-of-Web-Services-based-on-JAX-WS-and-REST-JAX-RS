<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Gestion des Stations</title>
</head>
<body>
	<jsp:include page="Index.jsp" />
	<div align="center">
		<h1>Gestion des Stations</h1>
		<h2>
			<a href="/GestionStationClient/station?action=new">Add New
				Station</a> &nbsp;&nbsp;&nbsp; <a
				href="/GestionStationClient/station">List of
				Stations</a>

		</h2>
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Stations</h2>
			</caption>
			<tr>
				<th>ID</th>
				<th>Nom</th>
				<th>Ville</th>
				<th>Adresse</th>
				<th>Actions</th>
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