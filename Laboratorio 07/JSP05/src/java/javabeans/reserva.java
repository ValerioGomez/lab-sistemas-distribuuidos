package javabeans;

public class reserva {
    private String email, nombreApe, local, telefono, domicilio, fecha, hora, sector, comentario;
    private int cantPersonas;

    public reserva() {}

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreApe() {
        return nombreApe;
    }
    public void setNombreApe(String nombreApe) {
        this.nombreApe = nombreApe;
    }

    public String getLocal() {
        return local;
    }
    public void setLocal(String local) {
        this.local = local;
    }

    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDomicilio() {
        return domicilio;
    }
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }
    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getSector() {
        return sector;
    }
    public void setSector(String sector) {
        this.sector = sector;
    }

    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }
    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public String getDisponibilidad() {
        int random = (int)(Math.random() * 10) + cantPersonas;
        if(random < 6) {
            return "No hay disponibilidad para el día y hora solicitados. Lo sentimos.";
        } else {
            return "Gracias por confiar en nosotros, su reserva ha sido registrada.";
        }
    }
}
