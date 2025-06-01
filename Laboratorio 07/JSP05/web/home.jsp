<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>RESTAURANTE EL JUANE</title>
    <style>
        p { font-size:11px; font-family:arial; font-weight:normal; }
        h5 { font-size:11pt; font-family:verdana; color:#8181F7; }
        td { font-size:11px; font-family:arial; font-weight:normal; }
    </style>
    <jsp:include page="head.html"/>
</head>
<body bgcolor="#F2F2F2">
<form name="frmInicio" action="register.jsp" method="POST">
    <h5>Eventos</h5>
    <p>Puede hacer su reserva eligiendo el mes y el día que desea del año en curso</p>
    <table border="0">
        <tr>
            <td>Mes</td>
            <td>
                <select name="cboMeses">
                    <option>Enero</option>
                    <option>Febrero</option>
                    <option>Marzo</option>
                    <option>Abril</option>
                    <option>Mayo</option>
                    <option>Junio</option>
                    <option>Julio</option>
                    <option>Agosto</option>
                    <option>Setiembre</option>
                    <option>Octubre</option>
                    <option>Noviembre</option>
                    <option>Diciembre</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>Día</td>
            <td><input type="text" name="txtDia" size="11"/></td>
        </tr>
        <tr>
            <td colspan="2" align="right">
                <input type="submit" value="Hacer Reserva" name="btnHacerReserva"
                       style="font-family:verdana; font-size:10px;"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
