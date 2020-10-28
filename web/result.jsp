<%-- 
    Document   : result
    Created on : Oct 28, 2020, 3:50:32 PM
    Author     : USER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>
            <%
                double output = (Double) request.getAttribute("result");
                out.print(output);
               
                
               
                
            %>
        </h1>
    </body>
</html>
