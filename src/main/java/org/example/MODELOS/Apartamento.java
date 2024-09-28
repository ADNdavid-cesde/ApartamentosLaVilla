package org.example.MODELOS;

import java.time.LocalDate;

public class Apartamento {
    private Long id;
    private String direccion;
    private String barrio;
    private Boolean parquedero;
    private String cantidadBanios;

    private String cantidadHabitaciones;

    private Integer area;
    private String estratoSocioEconomico;
    private Integer valorCanon;
    private Propietario propietario;
    private Arrendatario arrendatario;

    public Apartamento() {
    }

    public Apartamento(Long id, String direccion, String barrio, Boolean parquedero, String cantidadBanios, String cantidadHabitaciones, Integer area, String estratoSocioEconomico, Integer valorCanon, Propietario propietario, Arrendatario arrendatario) {
        this.id = id;
        this.direccion = direccion;
        this.barrio = barrio;
        this.parquedero = parquedero;
        this.cantidadBanios = cantidadBanios;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.area = area;
        this.estratoSocioEconomico = estratoSocioEconomico;
        this.valorCanon = valorCanon;
        this.propietario = propietario;
        this.arrendatario = arrendatario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getBarrio() {
        return barrio;
    }

    public void setBarrio(String barrio) {
        this.barrio = barrio;
    }

    public Boolean getParquedero() {
        return parquedero;
    }

    public void setParquedero(Boolean parquedero) {
        this.parquedero = parquedero;
    }

    public String getCantidadBanios() {
        return cantidadBanios;
    }

    public void setCantidadBanios(String cantidadBanios) {
        this.cantidadBanios = cantidadBanios;
    }

    public String getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(String cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public String getEstratoSocioEconomico() {
        return estratoSocioEconomico;
    }

    public void setEstratoSocioEconomico(String estratoSocioEconomico) {
        this.estratoSocioEconomico = estratoSocioEconomico;
    }

    public Integer getValorCanon() {
        return valorCanon;
    }

    public void setValorCanon(Integer valorCanon) {
        this.valorCanon = valorCanon;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    public Arrendatario getArrendatario() {
        return arrendatario;
    }

    public void setArrendatario(Arrendatario arrendatario) {
        this.arrendatario = arrendatario;
    }

    @Override
    public String toString() {
        return "Apartamento{" +
                "id=" + id +
                ", direccion='" + direccion + '\'' +
                ", barrio='" + barrio + '\'' +
                ", parquedero=" + parquedero +
                ", cantidadBanios='" + cantidadBanios + '\'' +
                ", cantidadHabitaciones='" + cantidadHabitaciones + '\'' +
                ", area=" + area +
                ", estratoSocioEconomico='" + estratoSocioEconomico + '\'' +
                ", valorCanon=" + valorCanon +
                ", propietario=" + propietario +
                ", arrendatario=" + arrendatario +
                '}';
    }
}
