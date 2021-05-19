<%--
  Created by IntelliJ IDEA.
  User: trevorbenyack
  Date: 5/19/21
  Time: 14:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.beans.*" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Employee Login Page</title>
</head>
<jsp:useBean id="userBean" class="com.beans.Employee"></jsp:useBean>
<jsp:setProperty property="*" name="userBean"/>
<body>
<div>
    <%
        String designation = request.getParameter("designation");
        if (designation.equals("1")) {
    %>
        <jsp:include page="managersHeading.jsp">
            <jsp:param name="name" value="<%=userBean.getFirstName()%>"/>
        </jsp:include>
    <%
        } else if (designation.equals("2")) {
    %>
        <jsp:include page="traineesHeading.jsp">
            <jsp:param name="name" value="<%=userBean.getFirstName()%>"/>
        </jsp:include>
    <%
        } else if (designation.equals("3")) {
    %>
        <jsp:include page="developersHeading.jsp">
            <jsp:param name="name" value="<%=userBean.getFirstName()%>"/>
        </jsp:include>
    <%
        }
    %>
</div>

<!-- Bootstrap code for alert icon -->
<svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
    <symbol id="check-circle-fill" fill="currentColor" viewBox="0 0 16 16">
        <path d="M16 8A8 8 0 1 1 0 8a8 8 0 0 1 16 0zm-3.97-3.03a.75.75 0 0 0-1.08.022L7.477 9.417 5.384 7.323a.75.75 0 0 0-1.06 1.06L6.97 11.03a.75.75 0 0 0 1.079-.02l3.992-4.99a.75.75 0 0 0-.01-1.05z"/>
    </symbol>
    <symbol id="info-fill" fill="currentColor" viewBox="0 0 16 16">
        <path d="M8 16A8 8 0 1 0 8 0a8 8 0 0 0 0 16zm.93-9.412-1 4.705c-.07.34.029.533.304.533.194 0 .487-.07.686-.246l-.088.416c-.287.346-.92.598-1.465.598-.703 0-1.002-.422-.808-1.319l.738-3.468c.064-.293.006-.399-.287-.47l-.451-.081.082-.381 2.29-.287zM8 5.5a1 1 0 1 1 0-2 1 1 0 0 1 0 2z"/>
    </symbol>
    <symbol id="exclamation-triangle-fill" fill="currentColor" viewBox="0 0 16 16">
        <path d="M8.982 1.566a1.13 1.13 0 0 0-1.96 0L.165 13.233c-.457.778.091 1.767.98 1.767h13.713c.889 0 1.438-.99.98-1.767L8.982 1.566zM8 5c.535 0 .954.462.9.995l-.35 3.507a.552.552 0 0 1-1.1 0L7.1 5.995A.905.905 0 0 1 8 5zm.002 6a1 1 0 1 1 0 2 1 1 0 0 1 0-2z"/>
    </symbol>
</svg>

<div class="alert alert-success d-flex alert-dismissible fade show mb-3" style="width: 40%; margin-right: auto; margin-left: auto" role="alert">
    <svg class="bi flex-shrink-0 me-2" width="24" height="24" role="img" aria-label="Success:"><use xlink:href="#check-circle-fill"/></svg>
    <div>
        <%= request.getParameter("message")%>
    </div>
    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
</div>
<div style="width: 40%;margin: auto;">
    <h1>Registration Details</h1>
    <div class="d-grid gap-3 p-3 mt-1" style="
    border-style: solid;
    border-color: black;
    border-width: thin;
    border-radius: 10px;
    margin: auto;">
        <!-- First Name -->
        <div class="row gy-5">
            <div class="col-3">
                <label class="col-form-label">First Name</label>
            </div>
            <div class="col">
                <jsp:getProperty property="firstName" name="userBean" />
            </div>
        </div>
        <!-- Last Name -->
        <div class="row gy-5">
            <div class="col-3">
                <label class="col-form-label">Last Name</label>
            </div>
            <div class="col">
                <jsp:getProperty property="lastName" name="userBean" />
            </div>
        </div>
        <!-- Password -->
        <div class="row">
            <div class="col-3">
                <label class="col-form-label">Password</label>
            </div>
            <div class="col">
                <jsp:getProperty property="userName" name="userBean" />
            </div>
        </div>
        <!-- User Name -->
        <div class="row">
            <div class="col-3">
                <label class="col-form-label">User Name</label>
            </div>
            <div class="col">
                <jsp:getProperty property="userName" name="userBean" />
            </div>
        </div>
        <!-- Gender -->
        <div class="row">
            <div class="col-3">Gender</div>
            <div class="col">
                <jsp:getProperty property="gender" name="userBean" />
            </div>
        </div>
        <!-- Hobbies -->
        <div class="row">
            <div class="col-3">
                Hobbies
            </div>
            <div class="col">
                <%
                    String[] hobbies = userBean.getHobbies();
                    for(String hobby : hobbies) {
                        out.println(hobby);
                    }
                %>
            </div>
        </div>
    </div>
</div>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>
</body>
</html>
