<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="functionLayer.Order"%>
<%@page import="functionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="jspf/header.jspf" %>
<%List<Order> orders = (ArrayList<Order>) session.getAttribute("allOrders");%>
<div class="container-fluid text-center">
    <div class="jumbotron">
        <h1>Hello <%=user.getEmail()%> </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.
    </div>
    <table class="table table-striped" align="center">
        <tr>
            <th>Id</th>
            <th>User id</th>
            <th>Length</th>
            <th>Width</th>
            <th>Height</th>
            <th>Brick list</th>
            <th colspan="2">Status</th>
        </tr>
        <%for (Order o : orders) {%>
        <tr>
            <td><%out.print(o.getId());%></td>
            <td><%out.print(o.getUserId());%></td>
            <td><%out.print(o.getLength());%></td>
            <td><%out.print(o.getWidth());%></td>
            <td><%out.print(o.getHeight());%></td>
            <td><%out.print(o.getHouse());%></td>
            <td><%out.print(o.getStatus());%></td>
            <td>
                <form action="FrontController" method="POST">
                    <input type="hidden" name="command" value="updateStatus">
                    <input type="hidden" name="orderId" value="<%out.print(o.getId());%>">
                    <%if (o.getStatus().equals("Not sent")) {%>
                    <input type="submit" class="btn btn-default" value="Mark as sent">
                    <%}%>
                </form>
            </td>
        </tr>
        <%}%>
    </table>
</div>
</body>
</html>