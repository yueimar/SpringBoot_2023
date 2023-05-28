<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Mostrar Registros</title>
</head>
<body>
    <h1>Registros:</h1>
    <table>
        <tr>
            <th>ID</th>
            <th>Nombre</th>
            <th>Email</th>
        </tr>
        <% for (Registro registro : (List<Registro>)request.getAttribute("registros")) { %>
        <tr>
            <td><%= registro.getId() %></td>
            <td><%= registro.getNombre() %></td>
            <td><%= registro.getEmail() %></td>
        </tr>
        <% } %>
    </table>
</body>
</html>
