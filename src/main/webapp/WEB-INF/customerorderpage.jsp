<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="FunctionLayer.Order"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<% List<Order> orders = (ArrayList<Order>) session.getAttribute("orders");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        Welcome to the orderpage, here you can see all your orders.
        <table>
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
    </body>
</html>
