package org.example.MODELOS;

import java.time.LocalDate;

public class Arrendatario {
    private Long id;
    private String nombres;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String numeroDocumento;
    private String telefono;
    private String correoElectronico;
    private Integer capacidadPago;

    public Arrendatario() {
    }

    public Arrendatario(Long id, String nombres, String apellido, LocalDate fechaNacimiento, String numeroDocumento, String telefono, String correoElectronico, Integer capacidadPago) {
        this.id = id;
        this.nombres = nombres;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.numeroDocumento = numeroDocumento;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.capacidadPago = capacidadPago;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Integer getCapacidadPago() {
        return capacidadPago;
    }

    public void setCapacidadPago(Integer capacidadPago) {
        this.capacidadPago = capacidadPago;
    }

    @Override
    public String toString() {
        return "Arrendatario{" +
                "id=" + id +
                ", nombres='" + nombres + '\'' +
                ", apellido='" + apellido + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", telefono='" + telefono + '\'' +
                ", correoElectronico='" + correoElectronico + '\'' +
                ", capacidadPago=" + capacidadPago +
                '}';
    }
}
