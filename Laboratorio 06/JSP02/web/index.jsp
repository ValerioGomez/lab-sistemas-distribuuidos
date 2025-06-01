<%@ page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Mi primer JavaBean</title>
</head>
<body>
    <h1>Usando mi Primer JavaBean</h1>

    <%
        JavaBean.TourBean myTour = new JavaBean.TourBean();
    %>

    Me gusta la isla de <%= myTour.getMake() %> <br/>

    <%
        myTour.setMake("Taquile");
    %>

    Pero también <%= myTour.getMake() %>
</body>
</html>
