<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Gestion des Histogrames des Carburants</title>
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

		<c:if test="${histoCarb != null}">
			<form action="/GestionStationClient/histocarb?action=update"
				method="post">
		</c:if>
		<c:if test="${histoCarb == null}">
			<form action="/GestionStationClient/histocarb?action=add"
				method="post">
		</c:if>
		<table border="1" cellpadding="5">
			<caption>
				<h2>
					<c:if test="${histoCarb != null}">
                        Editer Histograme
                    </c:if>
					<c:if test="${histoCarb == null}">
                        Ajouter Nouveau Histograme
                    </c:if>
				</h2>
			</caption>
			<c:if test="${histoCarb != null}">
				<input type="hidden" name="id"
					value="<c:out value='${histoCarb.histoCarbId}' />" />
			</c:if>
			<tr>
				<th>Date:</th>
				<td><input type="date" name="date" size="45"
					value="<c:out value='${histoCarb.date}' />" /></td>
			</tr>
			<tr>
				<th>Prix:</th>
				<td><input type="number" name="prix" size="45"
					value="<c:out value='${histoCarb.prix}' />" /></td>
			</tr>
			<tr>
				<th>Station:</th>
				<td><input type="number" name="station_id" size="45"
					value="<c:out value='${histoCarb.station.stationId}' />" /></td>
			</tr>
			<tr>
				<th>Carburant:</th>
				<td><input type="number" name="carburant_id" size="45"
					value="<c:out value='${histoCarb.carburant.carburantId}' />" /></td>
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