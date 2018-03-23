<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="functionLayer.User"%>
<%@include file="jspf/header.jspf" %>
<div class="container-fluid text-center">
    <div class="jumbotron">
        <h1>Hello <%=user.getEmail()%> </h1>
        You are now logged in as a customer of our wonderful site.
    </div>
</div>
<div class="container text-center">
    <form action="FrontController" name="shop" method="POST">
        <input type="hidden" name="command" value="shop">
        <div class="form-group">
            <label for="len>"Length>Length</label>
            <input type="number" class="form-control" id="len" name="length" value="8" min="8">
        </div>
        <div class="form-group">
            <label for="wid>"Length>Width</label>
            <input type="number" class="form-control" id="wid" name="width" value="5" min="5">
        </div>
        <div class="form-group">
            <label for="hei>"Length>Height</label>
            <input type="number" class="form-control" id="hei" name="height" value="7" min="7">
        </div>
        <input type="submit" class="btn btn-default" value="Submit">
    </form>
</div>
</body>
</html>