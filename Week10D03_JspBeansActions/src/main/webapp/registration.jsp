<%--
  Created by IntelliJ IDEA.
  User: trevorbenyack
  Date: 5/19/21
  Time: 14:20
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Registration Page</title>
</head>
<% if (request.getParameter("submit") != null) {%>
    <jsp:forward page="success.jsp">
        <jsp:param name="message" value="Registration successful"/>
    </jsp:forward>
<% } %>
<%
    String passwordValid = "";
    if (request.getParameter("submit") != null) {
        if (request.getParameter("password").equals("")) {
            passwordValid = "Password cannot be null";
        } else {
            response.sendRedirect("details.jsp");
        }
    }
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
            <input type="text" id="firstName" name = "firstName" class="form-control">
        </div>
    </div>
    <!-- Last Name -->
    <div class="row gy-5">
        <div class="col-3">
            <label for="lastName" class="col-form-label">Last Name</label>
        </div>
        <div class="col">
            <input type="text" id="lastName" name="lastName" class="form-control">
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
            <input type="text" id="userName" name="userName" class="form-control">
        </div>
    </div>
    <!-- Gender -->
    <div class="row">
        <div class="col-3">Gender</div>
        <div class="col">
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="male">
                <label class="form-check-label" for="male">
                    Male
                </label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="radio" name="gender" id="female">
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
                <input class="form-check-input" type="checkbox" id="dance" name="hobbies" value="dance">
                <label class="form-check-label" for="dance">Dance</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="music" name="hobbies" value="music">
                <label class="form-check-label" for="music">Music</label>
            </div>
        </div>
        <div class="col">
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="sports" name="hobbies" value="sports">
                <label class="form-check-label" for="sports">Sports</label>
            </div>
            <div class="form-check">
                <input class="form-check-input" type="checkbox" id="painting" name="hobbies" value="painting">
                <label class="form-check-label" for="painting">Painting</label>
            </div>
        </div>
    </div>
    <!-- Designation -->
    <div class="row">
        <div class="col-3">
            Designation
        </div>
        <div class="col">
            <select class="form-select" name="designation" aria-label="Default select example">
                <option selected>--select--</option>
                <option value="1">Manager</option>
                <option value="2">Trainee</option>
                <option value="3">Developer</option>
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