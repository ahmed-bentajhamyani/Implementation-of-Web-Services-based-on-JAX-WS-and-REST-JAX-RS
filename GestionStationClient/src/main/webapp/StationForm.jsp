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

		<c:if test="${station != null}">
			<form action="/GestionStationClient/station?action=update"
				method="post">
		</c:if>
		<c:if test="${station == null}">
			<form action="/GestionStationClient/station?action=add" method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${station != null}">
                        Edit Station
                    </c:if>
					<c:if test="${station == null}">
                        Add New Station
                    </c:if>
				</h2>
			</caption>
			<c:if test="${station != null}">
				<input type="hidden" name="id"
					value="<c:out value='${station.stationId}' />" />
			</c:if>
			<tr>
				<th>Nom:</th>
				<td><input type="text" name="nom" size="45"
					value="<c:out value='${station.nom}' />" /></td>
			</tr>
			<tr>
				<th>Ville:</th>
				<td><input type="text" name="ville" size="45"
					value="<c:out value='${station.ville}' />" /></td>
			</tr>
			<tr>
				<th>Adresse:</th>
				<td><input type="text" name="adresse" size="45"
					value="<c:out value='${station.adresse}' />" /></td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="Save" /></td>
			</tr>
		</table>
		</form>
	</div>
</body>
</html>