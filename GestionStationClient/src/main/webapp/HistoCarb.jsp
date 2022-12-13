<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<title>Comparer les deux Carburants</title>
</head>
<body>
	<jsp:include page="Index.jsp" />
	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>Result du Recherche</h2>
			</caption>
			<tr>
				<th>Nom du Carburant</th>
				<th>Prix</th>
			</tr>
			<c:forEach var="histoCarb" items="${listHistoCarb}">
				<tr>
					<td><c:out value="${histoCarb.carburant.nom}" /></td>
					<td><c:out value="${histoCarb.prix}" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>