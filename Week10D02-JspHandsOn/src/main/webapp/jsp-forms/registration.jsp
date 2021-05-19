<%--
  Created by IntelliJ IDEA.
  User: trevorbenyack
  Date: 5/18/21
  Time: 13:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!doctype html>
<html lang="en">
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Registration Form</title>
</head>
<!-- Examples using directives -->
<%@ page import="java.util.Date" %>
<%@ page errorPage="Library/Mobile Documents/com~apple~CloudDocs/Coding/Java/Per Scholas/Week10D02-JspHandsOn/src/main/webapp/directives/errorPage.jsp"%>
<%
    String passwordValid = "";
    if (request.getParameter("submit") != null) {
        if (request.getParameter("password").equals("")) {
            passwordValid = "Password cannot be null";
        } else {
            response.sendRedirect("details.jsp");
        }
    }
//    // Uncomment to direct to errorPage
//    int[] intArray = new int[3];
//    intArray[3] = 5;
%>
<body>
<form class="d-grid gap-3 p-3 mt-3" style="
    width: 30%;
    border-style: solid;
    border-color: black;
    border-width: thin;
    border-radius: 10px;
    margin: auto;"
      method="post">
    <!-- First Name -->
    <div class="row gy-5">
        <div class="col-3">
            <label for="firstName" class="col-form-label">First Name</label>
        </div>
        <div class="col">
            <input type="text" id="firstName" class="form-control">
        </div>
    </div>
    <!-- Last Name -->
    <div class="row gy-5">
        <div class="col-3">
            <label for="lastName" class="col-form-label">Last Name</label>
        </div>
        <div class="col">
            <input type="text" id="lastName" class="form-control">
        </div>
    </div>
    <!-- Password -->
    <div class="row">
        <div class="col-3">
            <label for="password" class="col-form-label">Password</label>
        </div>
        <div class="col">
            <input type="text" id="password" name="password" class="form-control" placeholder="<%= passwordValid %>" >
        </div>
    </div>
    <!-- User Name -->
    <div class="row">
        <div class="col-3">
            <label for="userName" class="col-form-label">User Name</label>
        </div>
        <div class="col">
            <input type="text" id="userName" class="form-control">
        </div>
    </div>
    <!-- Gender -->
    <div class="row">
        <div class="col-3">Gender</div>
        <div class="col">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="male">
                <label class="form-check-label" for="male">
                    Male
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="flexRadioDefault" id="female">
                <label class="form-check-label" for="female">
                    Female
                </label>
            </div>
        </div>
    </div>
    <!-- Hobbies -->
    <div class="row">
        <div class="col-3">
            Hobbies
        </div>
        <div class="col">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="dance" value="dance">
                <label class="form-check-label" for="dance">Dance</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="music" value="music">
                <label class="form-check-label" for="music">Music</label>
            </div>
        </div>
        <div class="col">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="sports" value="sports">
                <label class="form-check-label" for="sports">Sports</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="painting" value="painting">
                <label class="form-check-label" for="painting">Painting</label>
            </div>
        </div>
    </div>
    <!-- Country -->
    <div class="row">
        <div class="col-3">
            Country
        </div>
        <div class="col">
            <select class="form-select" aria-label="Default select example">
                <option selected>--select--</option>
                <option value="usa">USA</option>
                <option value="canada">Canada</option>
                <option value="mexico">Mexico</option>
            </select>
        </div>
    </div>
    <!-- Submit -->
    <div class="row">
        <div class="col-3">
            <button type="submit" name="submit" class="btn btn-primary">Submit</button>
        </div>
    </div>
</form>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>

</html>

