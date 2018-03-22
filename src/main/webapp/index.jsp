<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@include file="WEB-INF/jspf/header.jspf" %>
<div class="container-fluid text-center">
    <div class="jumbotron">
        <h1>Welcome to Sem 2</h1>
    </div>
    <table align="center">
        <tr><td>Login</td>
            <td>
                <form name="login" action="FrontController" method="POST">
                    <input type="hidden" name="command" value="login">
                    <div class="form-group">
                        <label for="email">Email:</label>
                        <input type="email" class="form-control" name="email" id="email" placeholder="Enter email" value="jens@somewhere.com">
                    </div>
                    <div class="form-group">
                        <label for="pwd">Password:</label>
                        <input type="password" class="form-control" name="password" id="pwd" placeholder="Enter password" value="jensen">
                    </div>
                    <input type="submit" class="btn btn-default" value="Submit">
                </form>
            </td>
            <td>Or Register</td>
            <td>
                <form name="register" action="FrontController" method="POST">
                    <input type="hidden" name="command" value="register">
                    <div class="form-group">
                        <label for="email">Email</label>
                        <input type="text" class="form-control" name="email" id="email" placeholder="email">
                    </div>
                    <div class="form-group">
                        <label for="pwd1">Password</label>
                        <input type="password" class="form-control" id="pwd1" name="password1" placeholder="password">
                    </div>
                    <div class="form-group">
                        <label for="pwd2">Retype Password</label>
                        <input type="password" class="form-control" id="pwd2" name="password2" placeholder="password">
                    </div>
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