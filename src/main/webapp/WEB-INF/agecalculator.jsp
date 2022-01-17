<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/style.css" rel="stylesheet">
        <title>agecalculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
        
        <div>
        <form action="age" method="post">
            <label for="age">Enter your age:</label>
            <input type="number" name="age" id="age" min="0"> <br> <br>
            
            <button type="submit">Age next birthday</button>
        </form>
        
        <p>${message}</p>
        
        <a href="arithmetic">Arithmetic Calculator</a>
        </div>
    </body>
</html>
