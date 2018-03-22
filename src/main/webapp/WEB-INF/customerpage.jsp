<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="functionLayer.User"%>
<%@include file="jspf/header.jspf" %>
<div class="container">
    <div class="jumbotron">
        <h1>Hello <%=user.getEmail()%> </h1>
        You are now logged in as a customer of our wonderful site.
    </div>
    <form action="FrontController" name="shop" method="POST">
        <input type="hidden" name="command" value="shop">
        Length:<br>
        <input type="number" name="length" value="8" min="8">
        <br>
        Width:<br>
        <input type="number" name="width" value="6" min="6">
        <br>
        Height:<br>
        <input type="number" name="height" value="7" min="7">
        <br>
        <input type="submit" class="btn btn-default" value="Submit">
    </form>
</div>
</body>
</html>