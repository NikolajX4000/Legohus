<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/header.jspf" %>
<div class="container">
    <div class="jumbotron">
        <h1>Welcome to Sem 2</h1>
    </div>
    <table>
        <tr><td>Login</td>
            <td>
                <form name="login" action="FrontController" method="POST">
                    <input type="hidden" name="command" value="login">
                    Email:<br>
                    <input type="text" name="email" value="someone@nowhere.com">
                    <br>
                    Password:<br>
                    <input type="password" name="password" value="sesam">
                    <br>
                    <input type="submit" class="btn btn-default" value="Submit">
                </form>
            </td>
            <td>Or Register</td>
            <td>
                <form name="register" action="FrontController" method="POST">
                    <input type="hidden" name="command" value="register">
                    Email:<br>
                    <input type="text" name="email" value="someone@nowhere.com">
                    <br>
                    Password:<br>
                    <input type="password" name="password1" value="sesam">
                    <br>
                    Retype Password:<br>
                    <input type="password" name="password2" value="sesam">
                    <br>
                    <input type="submit" class="btn btn-default" value="Submit">
                </form>
            </td>
        </tr>
    </table>
    <% String error = (String) request.getAttribute("error");
    if (error != null) {%>
    <H2>Error!!</h2>
    <p><%= error%>
        <% }
        %>
</div>
</body>
</html>