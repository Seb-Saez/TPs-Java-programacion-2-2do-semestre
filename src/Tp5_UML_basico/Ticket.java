package Tp5_UML_basico;

import java.util.Date;

public class Ticket {
    private static int contadorTicket = 10000;
    int ticketID;
    String descripcion;
    String estado;
    Date fechaCreacion;
    Usuario usuarioAsociado;

    public Ticket(String descripcion, Date fechaCreacion, Usuario usuarioAsociado) {
        this.ticketID = contadorTicket++;
        this.descripcion = descripcion;
        this.estado = estado;
        this.fechaCreacion = fechaCreacion;
        this.usuarioAsociado = usuarioAsociado;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Usuario getUsuarioAsociado() {
        return usuarioAsociado;
    }

    public int getTicketID() {
        return ticketID;
    }

}
