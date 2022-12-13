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
                        Editer Carburant
                    </c:if>
					<c:if test="${carburant == null}">
                        Ajouter Nouveau Carburant
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