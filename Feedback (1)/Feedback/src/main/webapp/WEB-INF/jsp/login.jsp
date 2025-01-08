<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome to Anonymous Student Feedback System</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f9;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
        text-align: center;
    }

    h1 {
        font-size: 36px;
        color: #333;
        margin-bottom: 40px;
    }

    a {
        text-decoration: none;
        margin: 0 20px;
    }

    button {
        background-color: #4CAF50;
        color: white;
        padding: 15px 32px;
        font-size: 18px;
        border: none;
        border-radius: 5px;
        cursor: pointer;
        transition: background-color 0.3s;
    }

    button:hover {
        background-color: #45a049;
    }

    button:focus {
        outline: none;
    }
</style>
</head>
<body>
<h1>Welcome to Anonymous Student Feedback System</h1>
<a href="admin"><button type="submit">Admin Login</button></a>
<a href="login"><button type="submit">Student Login</button></a>
</body>
</html>
