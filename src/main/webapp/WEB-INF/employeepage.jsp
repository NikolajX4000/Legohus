<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@page import="functionLayer.Order"%>
<%@page import="functionLayer.User"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%  User user = (User) session.getAttribute("user");
    List<Order> orders = (ArrayList<Order>) session.getAttribute("allOrders");%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Employee home page</title>
    </head>
    <body>

        <h1>Hello <%=user.getEmail()%> </h1>
        You are now logged in as a EMPLOYEE of our wonderful site.
        <table>
            <tr>
                <th>Id</th>
                <th>User id</th>
                <th>Length</th>
                <th>Width</th>
                <th>Height</th>
                <th>Brick list</th>
                <th>Status</th>
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
                        <input type="submit" value="Mark as sent">
                        <%}%>
                    </form>
                </td>
            </tr>
            <%}%>
        </table>
    </body>
</html>