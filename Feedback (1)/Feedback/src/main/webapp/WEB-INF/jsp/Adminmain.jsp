<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Well Come To Anonymous Student Feedback System Result</title>
<style>
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        padding: 12px;
        text-align: left;
        border: 1px solid #ddd;
    }
    th {
        background-color: #f2f2f2;
    }
    h1 {
        text-align: center;
    }
</style>
</head>
<body>
<h1>Well Come To Anonymous Student Feedback System Result</h1>

<table>
    <tr>
        <th>Subject Name</th>
        <th>Rating</th>
    </tr>
    <tr>
        <td>Kananada</td>
        <td>${kannada}%</td>
    </tr>
    <tr>
        <td>English</td>
        <td>${English}%</td>
    </tr>
    <tr>
        <td>Hindhi</td>
        <td>${Hindhi}%</td>
    </tr>
    <tr>
        <td>Social</td>
        <td>${Social}%</td>
    </tr>
    <tr>
        <td>Science</td>
        <td>${Science}%</td>
    </tr>
    <tr>
        <td>Math</td>
        <td>${Math}%</td>
    </tr>
</table>

</body>
</html>
