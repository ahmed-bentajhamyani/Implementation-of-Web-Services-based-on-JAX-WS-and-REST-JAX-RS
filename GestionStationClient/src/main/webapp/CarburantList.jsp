<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Gestion des Carburants</title>
</head>
<body>
	<jsp:include page="Index.jsp" />
	<div align="center">
		<h1>Gestion des Carburants</h1>
		<h2>
			<a href="/GestionStationClient/carburant?action=new">Ajouter
				Nouveau Carburant</a> &nbsp;&nbsp;&nbsp; <a
				href="/GestionStationClient/carburant">List des Carburants</a>
		</h2>
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of Carburants</h2>
			</caption>
			<tr>
				<th>Nom</th>
				<th>Description</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="carburant" items="${listCarburant}">
				<tr>
					<td><c:out value="${carburant.nom}" /></td>
					<td><c:out value="${carburant.description}" /></td>
					<td><a
						href="/GestionStationClient/carburant?action=edit&id=<c:out value='${carburant.carburantId}' />">Editer</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="/GestionStationClient/carburant?action=delete&id=<c:out value='${carburant.carburantId}' />">Supprimer</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>