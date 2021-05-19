<%@page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<nav class="navbar navbar-light mb-3" style="background-color: lightsalmon ">
    <div class="container-fluid">
        <a class="navbar-brand">Trainee's Home Page</a>
        <div style="margin: .5rem">
            Welcome <%=request.getParameter("name")%>
        </div>
    </div>
</nav>