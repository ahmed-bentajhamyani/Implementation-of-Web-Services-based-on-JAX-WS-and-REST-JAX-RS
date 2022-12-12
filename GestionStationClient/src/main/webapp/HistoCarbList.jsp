<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<title>Gestion des Stations</title>
</head>
<body>
	<jsp:include page="Index.jsp" />
	<div align="center">
		<h1>Gestion des Histogrames des Carburants</h1>
		<h2>
			<a href="/GestionStationClient/histocarb?action=new">Ajouter
				Nouveau Histograme de Carburant</a> &nbsp;&nbsp;&nbsp; <a
				href="/GestionStationClient/histocarb">List des Histogrames des
				Carburants</a>
		</h2>
		<table border="1" cellpadding="5">
			<caption>
				<h2></h2>
			</caption>
			<tr>
				<th>Nom du Station</th>
				<th>Nom du Carburant</th>
				<th>Date</th>
				<th>Prix</th>
				<th>Actions</th>
			</tr>
			<c:forEach var="histoCarb" items="${listHistoCarb}">
				<tr>
					<td><c:out value="${histoCarb.station.nom}" /></td>
					<td><c:out value="${histoCarb.carburant.nom}" /></td>
					<td><fmt:formatDate type="date" value="${histoCarb.date}" pattern="yyyy-MM-dd" /></td>
					<td><c:out value="${histoCarb.prix}" /></td>
					<td><a
						href="/GestionStationClient/histocarb?action=edit&id=<c:out value='${histocarb.histocarbId}' />">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; <a
						href="/GestionStationClient/histocarb?action=delete&id=<c:out value='${histocarb.histocarbId}' />">Delete</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>