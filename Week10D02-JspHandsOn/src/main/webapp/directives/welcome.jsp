<%--
  Created by IntelliJ IDEA.
  User: trevorbenyack
  Date: 5/19/21
  Time: 9:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Welcome</title>
</head>
<body>
<%@include file="header.jsp"%>
<form class="d-grid gap-3 p-3 mt-3" style="
    width: 30%;
    border-style: solid;
    border-color: black;
    border-width: thin;
    border-radius: 10px;
    margin: auto;" method="post" action="greetings.jsp">
    <!-- Name -->
    <div class="row">
        <div class="col-4">
            <label for="name" class="col-form-label">Enter Your Name</label>
        </div>
        <div class="col">
            <input type="text" id="name" name="name" class="form-control">
        </div>
    </div>
    <!-- Submit -->
    <div class="row">
        <div class="col-3">
            <input type="submit" name="submit" class="btn btn-primary"></input>
        </div>
    </div>
</form>
<%@include file="footer.jsp"%>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>

</html>

