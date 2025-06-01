<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Quinta Restaurant Arenas del Lago</title>
    <style>
        p { font-size:11px; font-family:arial; font-weight:normal; }
        h5 { font-size:11pt; font-family:verdana; color:#8181F7; }
        td { font-size:11px; font-family:arial; font-weight:normal; }
    </style>
    <jsp:include page="head.html"/>
</head>
<body bgcolor="#F2F2F2">
<form name="frmRegistrarReserva" action="result.jsp" method="POST">
    <h5>Reservas</h5>
    <table border="0">
        <tr>
            <td>Email(*)</td>
            <td><input type="text" name="email" size="30" /></td>
        </tr>
        <tr>
            <td>Local(*)</td>
            <td>
                <select name="local">
                    <option>Local Centro (Av. La Cultura 1985)</option>
                    <option>Local Sur (Av. El Sol 2021)</option>
                    <option>Local Norte (Av. Sesquicentenario 1979)</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Nombre y Apellido (*)</td>
            <td><input type="text" name="nombreApe" size="30" /></td>
        </tr>
        <tr>
            <td>Teléfono de confirmación (*)</td>
            <td><input type="text" name="telefono" size="30" /></td>
        </tr>
        <tr>
            <td>Domicilio(*)</td>
            <td><input type="text" name="domicilio" size="30"/></td>
        </tr>
        <tr>
            <td>Fecha de la Reserva</td>
            <td>
                <%= request.getParameter("txtDia") %> de <%= request.getParameter("cboMeses") %>
                <input type="hidden" name="fecha" value="<%= request.getParameter("txtDia") %> de <%= request.getParameter("cboMeses") %>" />
            </td>
        </tr>
        <tr>
            <td>Hora (*)</td>
            <td>
                <select name="hora">
                    <option>9:00hs</option>
                    <option>10:00hs</option>
                    <option>11:00hs</option>
                    <option>12:00hs</option>
                    <option>13:00hs</option>
                    <option>14:00hs</option>
                    <option>15:00hs</option>
                    <option>16:00hs</option>
                    <option>17:00hs</option>
                    <option>18:00hs</option>
                    <option>19:00hs</option>
                    <option>20:00hs</option>
                    <option>21:00hs</option>
                    <option>22:00hs</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Cantidad de Personas (*)</td>
            <td><input type="text" name="cantPersonas" size="30"/></td>
        </tr>
        <tr>
            <td>Sector</td>
            <td>
                <select name="sector">
                    <option>Fumador</option>
                    <option>No Fumador</option>
                    <option>Pelotero</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Comentario</td>
            <td><textarea name="comentario" rows="8" cols="30"></textarea></td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="Reservar" name="btnReservar" style="font-family:verdana; font-size:10px;"/>
            </td>
        </tr>
    </table>
    <p>(*) Los campos son obligatorios</p>
</form>
</body>
</html>
