<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Gestion des Stations</title>
</head>
<body>
	<div align="center">
		<h2>
			<a href="/GestionStationClient/carburant?action=list">List of
				Carburants</a> &nbsp;&nbsp;&nbsp; <a
				href="/GestionStationClient/commande?action=list">List of
				Commandes</a> &nbsp;&nbsp;&nbsp; <a
				href="/GestionStationClient/client?action=list">List of Clients</a>
			&nbsp;&nbsp;&nbsp; <a
				href="/GestionStationClient/lignecmd?action=list">List of Ligne
				Commandes</a>
		</h2>

		<h1>Carburants Management</h1>
		<h2>
			<a href="/GestionStationClient/Carburant?action=new">Add New
				Carburant</a> &nbsp;&nbsp;&nbsp; <a
				href="/GestionStationClient/Carburant?action=list">List of
				Carburants</a>
		</h2>

		<c:if test="${carburant != null}">
			<form action="/GestionStationClient/carburant?action=update"
				method="post">
		</c:if>
		<c:if test="${carburant == null}">
			<form action="/GestionStationClient/carburant?action=add"
				method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${carburant != null}">
                        Edit Carburant
                    </c:if>
					<c:if test="${carburant == null}">
                        Add New Carburant
                    </c:if>
				</h2>
			</caption>
			<c:if test="${carburant != null}">
				<input type="hidden" name="id"
					value="<c:out value='${carburant.carburantId}' />" />
			</c:if>
			<tr>
				<th>Nom:</th>
				<td><input type="text" name="nom" size="45"
					value="<c:out value='${carburant.nom}' />" /></td>
			</tr>
			<tr>
				<th>Description:</th>
				<td><input type="text" name="description" size="45"
					value="<c:out value='${carburant.description}' />" /></td>
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