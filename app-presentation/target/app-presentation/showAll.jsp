<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset= UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <title>Show All Books</title>
</head>
<body>
<table style="text-align: center;" class="table">
    <thead class="thead-dark">
    <tr>
        <th scope="col">Book Id</th>
        <th scope="col">Title</th>
        <th scope="col">Author</th>
        <th scope="col">Update</th>
        <th scope="col">Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
    <tr>
        <th scope="row"><c:out value="${user.id}"/></th>
        <td><c:out value="${user.title}"/></td>
        <td><c:out value="${user.author}"/></td>
        <td><a href="UserController?action=edit&userId=<c:out value="${user.id}"/>">Update</a></td>
        <td><a href="UserController?action=delete&userId=<c:out value="${user.id}"/>">Delete</a></td>
    </tr>
    </c:forEach>
    <%--<c:forEach items="${users}" var="user">--%>
        <%--<tr>--%>
            <%--<td><c:out value="${user.id}"/></td>--%>
            <%--<td><c:out value="${user.title}"/></td>--%>
            <%--<td><c:out value="${user.title}"/></td>--%>
            <%--<td><a href="UserController?action=edit&userId=<c:out value="${user.id}"/>">Update</a></td>--%>
            <%--<td><a href="UserController?action=delete&userId=<c:out value="${user.id}"/>">Delete</a></td>--%>
        <%--</tr>--%>
    <%--</c:forEach>--%>
    <%--<c:forEach var="user" items="${departments}">--%>
    <%--<tr>--%>
    <%--<td style="visibility: hidden"><c:out value="${dep.id}"/></td>--%>
    <%--<td><c:out value="${dep.name}"/></td>--%>
    <%--<td><p data-placement="top" data-toggle="tooltip" title="List">--%>
    <%--<a href="employee?departmentId=${dep.id}" target="_blank"><button class="btn btn-primary btn-xs" data-title="List">Employee</span></button></a>--%>
    <%--</p></td>--%>
    <%--<td><p data-placement="top" data-toggle="tooltip" title="Edit"><a href="/showDepartments?departmentId=${dep.id}&departmentName=${dep.name}" target="_blank"><button class="btn btn-primary btn-xs" data-title="Edit"><span class="glyphicon glyphicon-pencil"></span></button></a></p></td>--%>
    <%--<td><p data-placement="top" data-toggle="tooltip" title="Delete"><button class="btn btn-danger btn-xs" data-title="Delete" data-toggle="modal" data-target="#delete" ><span class="glyphicon glyphicon-trash"></span></button></p></td>--%>
    <%--</tr>--%>
    <%--</c:forEach>--%>
    </tbody>
</table>
<p><a href="UserController?action=insert">Add book</a></p>
</body>
</html>
