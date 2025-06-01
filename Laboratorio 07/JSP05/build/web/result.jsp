<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Quinta Restaurant Arenas del Lago</title>
    <style>
        p { font-size:11px; font-family:arial; font-weight:bold; }
        h5 { font-size:11pt; font-family:verdana; color:#8181F7; }
    </style>
    <jsp:include page="head.html"/>
</head>
<body bgcolor="#F2F2F2">
<%
    // Importar clase JavaBean
    javabeans.reserva res = new javabeans.reserva();

    // Obtener parámetros del formulario
    res.setEmail(request.getParameter("email"));
    res.setNombreApe(request.getParameter("nombreApe"));
    res.setLocal(request.getParameter("local"));
    res.setTelefono(request.getParameter("telefono"));
    res.setDomicilio(request.getParameter("domicilio"));
    res.setFecha(request.getParameter("fecha"));
    res.setHora(request.getParameter("hora"));
    res.setSector(request.getParameter("sector"));
    res.setComentario(request.getParameter("comentario"));

    String cantPersonasStr = request.getParameter("cantPersonas");
    int cantPersonas = 0;
    try {
        cantPersonas = Integer.parseInt(cantPersonasStr);
    } catch (NumberFormatException e) {
        cantPersonas = 0;
    }
    res.setCantPersonas(cantPersonas);
%>

<h5>Resultado de la Reserva</h5>
<p>Email: <%= res.getEmail() %></p>
<p>Nombre y Apellido: <%= res.getNombreApe() %></p>
<p>Local: <%= res.getLocal() %></p>
<p>Teléfono: <%= res.getTelefono() %></p>
<p>Domicilio: <%= res.getDomicilio() %></p>
<p>Fecha: <%= res.getFecha() %></p>
<p>Hora: <%= res.getHora() %></p>
<p>Cantidad de Personas: <%= res.getCantPersonas() %></p>
<p>Sector: <%= res.getSector() %></p>
<p>Comentario: <%= res.getComentario() %></p>

<hr>
<p><strong><%= res.getDisponibilidad() %></strong></p>

</body>
</html>
