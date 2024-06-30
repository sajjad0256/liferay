<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Article Form</title>
    <link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css" />">
</head>
<body>

<h1>Article Form</h1>

<form action="<c:url value="/articles" />" method="post">
    Title: <input type="text" name="title"><br>
    Content: <textarea name="content"></textarea><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>
