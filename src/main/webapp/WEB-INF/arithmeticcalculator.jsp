<%-- 
    Document   : arithmeticcalculator
    Created on : Jan 15, 2022, 1:56:10 PM
    Author     : HP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet">
        <title>arithmeticcalculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
        
        <div>
        <form action="arithmetic" method="post">
            
        <label for="firstnum">First: </label>
        <input type="number" name="firstnum" id="firstnum"> <br> <br>
        
        <label for="secondnum">Second: </label>
        <input type="number" name="secondnum" id="secondnum"> <br> <br>
        
        <button type="submit" name="operator" value="addition">+</button>
        <button type="submit" name="operator" value="subtraction">-</button>
        <button type="submit" name="operator" value="multiplication">*</button>
        <button type="submit" name="operator" value="division">%</button>
        
        </form>
        
        <p>Result: ${result}</p>
        
        <a href="age">Age Calculator</a>
        </div>
    </body>
</html>
