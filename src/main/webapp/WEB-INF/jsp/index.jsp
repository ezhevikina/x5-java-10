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
    <form action="/account" method="Get">
        <div class="mb-3">
            <label for="id" class="form-label">Enter account number:</label>
            <input type="number" class="form-control" id="id" name="id" placeholder="Account number" required>
        </div>
        <button type="submit" class="btn btn-primary">Next</button>
    </form>
</div>

</body>
</html>