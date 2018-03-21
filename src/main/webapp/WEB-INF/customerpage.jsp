<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Customer home page</title>
    </head>
    <body>
        <h1>Hello <%=request.getParameter("email")%> </h1>
        You are now logged in as a customer of our wonderful site.
        <form action="FrontController" name="shop">
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
            <input type="submit" value="Submit">
        </form>
    </body>
</html>