<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset= UTF-8">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

    <%--<link type="text/css" href="css/ui-lightness/jquery-ui-1.8.18.custom.css" rel="stylesheet" />--%>
    <%--<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>--%>
    <%--<script type="text/javascript" src="js/jquery-ui-1.8.18.custom.min.js"></script>--%>
    <title>Add new book</title>
</head>
<body style="display: flex; justify-content: center;">

<form method="POST" action='UserController' name="frmAddUser">
    <div class="form-group">
        <label>ID Book</label>
        <input type="text" name="userid" value="<c:out value="${user.id}" />" class="form-control"
               placeholder="Enter id (integer)">
    </div>
    <div class="form-group">
        <label>Title</label>
        <input type="text" name="firstName" value="<c:out value="${user.title}"/>" class="form-control"
               placeholder="Enter title">
    </div>
    <div class="form-group">
        <label>Author</label>
        <input type="text" name="lastName" value="<c:out value="${user.author}" />" class="form-control"
               placeholder="Enter author">
    </div>
    <button type="submit" class="btn btn-primary btn-block">Submit</button>
</form>
</body>
</html>
