<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.5.3/dist/css/bootstrap.min.css"
          integrity="sha384-TX8t27EcRE3e/ihU7zmQxVncDAy5uIKz4rEkgIXeMed4M0jlfIDPvg6uqKI2xXr2" crossorigin="anonymous">
</head>
<body>

<div class="d-grid gap-2 col-6 mx-auto">

    <button class="btn btn-outline-primary" type="button"
            onclick="document.location='/accounts/<%= request.getAttribute("id") %>/balance'">
        Balance
    </button>

    <button class="btn btn-outline-primary" type="button"
            onclick="document.location='/accounts/<%= request.getAttribute("id") %>/deposit'">
        Deposit
    </button>

    <button class="btn btn-outline-primary" type="button"
            onclick="document.location='/accounts/<%= request.getAttribute("id") %>/withdraw'">
        Withdraw
    </button>

    <button class="btn btn-outline-primary" type="button"
            onclick="document.location='/accounts/<%= request.getAttribute("id") %>/transfer'">
        Transfer
    </button>
</div>

</body>
</html>
