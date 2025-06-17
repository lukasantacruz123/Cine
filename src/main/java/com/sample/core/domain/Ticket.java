package com.sample.core.domain;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Ticket {

    private int id;
    private BigDecimal montoTotal;
    private String butacas;
    private String combosJSON;
    private String pelicula;
    private LocalDateTime fecha;

    public Ticket() {}

    public Ticket(BigDecimal montoTotal, String butacas, String combosJSON, String pelicula, LocalDateTime fecha) {
        this.montoTotal = montoTotal;
        this.butacas = butacas;
        this.combosJSON = combosJSON;
        this.pelicula = pelicula;
        this.fecha = fecha;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(BigDecimal montoTotal) {
        this.montoTotal = montoTotal;
    }

    public String getButacas() {
        return butacas;
    }

    public void setButacas(String butacas) {
        this.butacas = butacas;
    }

    public String getCombosJSON() {
        return combosJSON;
    }

    public void setCombosJSON(String combosJSON) {
        this.combosJSON = combosJSON;
    }

    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
