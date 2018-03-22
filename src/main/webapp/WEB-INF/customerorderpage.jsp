<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="functionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jspf/header.jspf" %>
<% List<Order> orders = (ArrayList<Order>) session.getAttribute("orders");%>
<div class="container">
    <div class="jumbotron">
        <h1>Hello <%=user.getEmail()%></h1>
        Welcome to the orderpage, here you can see all your orders.
    </div>
    <table class="table table-striped">
        <tr>
            <th>Id</th>
            <th>Length</th>
            <th>Width</th>
            <th>Height</th>
            <th>Brick list</th>
            <th>Status</th>
        </tr>
        <%for (Order o : orders) {%>
        <tr>
            <td><%out.print(o.getId());%></td>
            <td><%out.print(o.getLength());%></td>
            <td><%out.print(o.getWidth());%></td>
            <td><%out.print(o.getHeight());%></td>
            <td><%out.print(o.getHouse());%></td>
            <td><%out.print(o.getStatus());%></td>
        </tr>
        <%}%>
    </table>
    <form action="FrontController" method="POST">
        <input type="hidden" name="command" value="keepShopping">
        <input type="submit" class="btn btn-default" value="Keep shoping">
    </form>
</div>
</body>
</html>

