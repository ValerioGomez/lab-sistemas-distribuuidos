<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! 
    double montoPrestamo, tasaInteres;
    int cantAnios;
    
    // Método para calcular el interés
    double calculoInteres(double montoPrestamo, double tasaInteres, int cantAnios) {
        return montoPrestamo * tasaInteres * cantAnios / 100;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Cálculo de Interés</title>
</head>
<body>
    <h1>Cálculo de Interés</h1>
<%
    montoPrestamo = 1000;
    tasaInteres = 9;
    cantAnios = 2;
%>

    Monto del Préstamo: <%= montoPrestamo %> <br><br>
    Tasa de Interés: <%= tasaInteres %>% <br><br>
    Cantidad de Años: <%= cantAnios %> <br><br>
    Interés Total: <%= calculoInteres(montoPrestamo, tasaInteres, cantAnios) %> <br><br>

<%
    // Incrementamos los años en 1 y mostramos nuevo cálculo
    cantAnios++;
%>
    Veamos un año más: <br>
    Cantidad de Años: <%= cantAnios %> <br>
    Interés Total: <%= calculoInteres(montoPrestamo, tasaInteres, cantAnios) %> <br><br>

<%
    // Multiplicamos los años por 5 y mostramos nuevo cálculo
    cantAnios *= 5;
%>
    Veamos cinco años más: <br>
    Cantidad de Años: <%= cantAnios %> <br>
    Interés Total: <%= calculoInteres(montoPrestamo, tasaInteres, cantAnios) %> <br>

</body>
</html>
