<html>
    <head></head>
    <body>
        Página 1 <%= request.getAttribute("mivalor") %>
        <%
            for ( int i = 0 ; i < 10 ; i++) {
                out.println(" Línea : " + i);
            }
        %>
    </body>
</html>