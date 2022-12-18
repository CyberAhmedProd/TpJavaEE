<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Calcule de pgcd</title>
</head>
<body>
<h1>Calcul PGCD OU PPCM</h1>
<form action="ServletControler" method="post">

Calcule De : 
<select name="choix">
<option value="PGCD">PGCD</option>
<option value="PPCM">PPCM</option>
</select>
<br>
nb1
<input type="text" name="va1" value=${v1}>
<p style="color:red;">${ !empty errorVal1 ? errorVal1 : '' }</p>
<br>
nb2
<input type="text" name="va2" value=${v2}>
<p style="color:red;">${ !empty errorVal2 ? errorVal2 : '' }</p>
<br>
<input type="submit" value="Calcul">
</form>
<p>Result ${ !empty Entrees ? Entrees : '' }</p>
</body>
</html>