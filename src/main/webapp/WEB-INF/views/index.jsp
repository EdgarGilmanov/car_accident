<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Accident</title>
</head>
<body>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

<style>
    .table-fixed thead {
        width: 97%;
    }
    .table-fixed tbody {
        height: 230px;
        overflow-y: auto;
        width: 100%;
    }
    .table-fixed thead, .table-fixed tbody, .table-fixed tr, .table-fixed td, .table-fixed th {
        display: block;
    }
    .table-fixed tbody td, .table-fixed thead > tr> th {
        float: left;
        border-bottom-width: 0;
    }
</style>

<form action=${pageContext.request.contextPath}/newAccident method="GET">
<div class="container">
    <div>
        Login as : ${user.username}
    </div>
    <div class="row">
        <div class="panel panel-default">
            <div class="panel-heading">
                <h3>
                    Автонарушители
                </h3>
            </div>
            <table class="table table-fixed">
                <thead>
                <tr>
                    <th class="col-xs-4">Нарушитель</th> <th class="col-xs-4">Описание нарушения</th> <th class="col-xs-4">Адрес</th>
                </tr>
                </thead>
                <tbody>
                <c:forEach items="${accidents}" var="accident" >
                <tr>
                    <td class="col-xs-4">${accident.name}</td><td class="col-xs-4">${accident.text}</td><td class="col-xs-4">${accident.address}</td>
                </tr>
                </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
    <button type="submit" class="btn btn-primary">Зарегистрировать новое нарушение</button>
</div>
</form>
</body>
</html>