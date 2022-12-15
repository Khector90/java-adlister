<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String userName = request.getParameter("username");
    String passWord = request.getParameter("password");

    if (request.getMethod().equalsIgnoreCase("Post"))
    if (userName.equals("admin") && passWord.equals("password")) {
        response.sendRedirect("/profile.jsp");

    }
    else {
        response.sendRedirect("/login.jsp");

    }

    %>




<html>
<head>
    <title><%= "login" %></title>
</head>
<body>
    <h1>Login</h1>
        <form action="profile.jsp" method="post">
            <label for="username">Username</label>
            <input id="username" name="username" type="text">
            <br>
            <label for="password" >password</label>
            <input id="password" name="password" type="password">
            <br>
            <input type="submit">
        </form>
</body>
</html>
