<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

<div class="container">
    <form action="/accounts/<%= request.getAttribute("id") %>/deposit" method="Post">
        <div class="form-group">
            <label for="amount">Amount to deposit</label>
            <input type="number" , class="form-control" , name="amount" , id="amount" required min="0">
        </div>

        <div class="form-group">
            <input type="submit" , value="Deposit" , class="btn btn-primary">
        </div>
    </form>
</div>

</body>
</html>