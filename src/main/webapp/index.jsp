<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcule de pgcd</title>
</head>
<body>
<form action="ServletControler" method="post">
nb1
<input type="text" name="va1">
<br>
nb2
<input type="text" name="va2">
<br>
<input type="submit" value="Calcul">
</form>
<p>Result ${ !empty Entrees ? Entrees : '' }</p>
</body>
</html>