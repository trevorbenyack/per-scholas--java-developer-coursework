<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!-- Declaration tag for declaring count variable and the method to increment the counter -->
<%!

    int count = 0;
    void incrementCount() {
        count++;
    }
%>
<body>
<h4>
    <!-- Global Declarations -->
    <% int localVariable = 0;
        out.print("This page is viewed " + count + "  times");
        incrementCount();
    %>
</h4>
<!-- localVariable will be refreshed when the page is refreshed -->
<% localVariable++; %>
the localVariable is <%= localVariable %>
</body>
</html>