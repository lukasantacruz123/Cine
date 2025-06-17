package com.sample.core.service;

public interface VentaService {
    boolean verificarCompra(String email) throws Exception;

    void procesarCompra(String email, int asientoId) throws Exception;
}
