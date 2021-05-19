<%--
  Created by IntelliJ IDEA.
  User: trevorbenyack
  Date: 5/19/21
  Time: 09:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=ISO-8859-1" language="java" pageEncoding="ISO-8859-1" %>
<%--<%@ page errorPage="errorPage.jsp" %>--%>
<%@ page import="java.util.Date" %>
<%@ page buffer="8kb" %>
<!doctype html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org./TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html" charset="=ISO-8859-1">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">
    <title>Greetings</title>
</head>
<%
    String name = request.getParameter("name");
    if (name == null || name.equals("")) {
        throw new Exception("Name is empty");
    }
    Date date = new Date();
%>
<body>
<%@include file="header.jsp"%>
Current Time: <%= date %>
<div id="content" style="background-color: blue; height: 20%">
    <span style="color: green; font-size: 100px;">Welcome <%= name %></span>
</div>

<%@include file="footer.jsp"%></body>
</html>
