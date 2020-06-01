<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">

    <style>
        .form-group label {
            width: 97%;
        }
        .form-group input {
            height: 80px;
            overflow-y: auto;
            width: 100%;
        }
    </style>

    <title>Форма нового нарушения</title>
</head>
<body>

<form:form method="POST" action="${pageContext.request.contextPath}/reg" modelAttribute="accident" >
    <div class="form-group">
        <form:label path="name">Нарушение</form:label>
        <form:input path="name" type="text" class="form-control" placeholder="Превышение скорости"></form:input>
    </div>
    <div class="form-group">
        <form:label path="text">Описание</form:label>
        <form:input path="text" type="text" class="form-control" placeholder="20.05.2020 на трассе..."></form:input>
    </div>
    <div class="form-group">
        <form:label path="address">Адрес</form:label>
        <form:input type="text" class="form-control" path="address"></form:input>
    </div>
    <button type="submit" class="btn btn-primary">Сохранить</button>
</form:form>
</body>
</html>
