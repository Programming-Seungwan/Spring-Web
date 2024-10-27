<html>
<head>
    <title> Login page - JSP</title>
</head>
<body>
    Welcome to Login Page!
    <form method="POST">
        Name : <input type="text" name="name" />
        Password : <input type="password" name="password">
        <input type="submit">
    </form>

    <div>${errorMessage}</div>
</body>
</html>