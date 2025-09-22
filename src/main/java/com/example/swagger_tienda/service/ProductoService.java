package com.example.swagger_tienda.service;

import com.example.swagger_tienda.model.Producto;

import java.util.List;

public interface ProductoService {
    List<Producto> listar();
    Producto obtenerPorId(Long id);
    Producto crear(Producto producto);
    Producto actualizar(Long id, Producto producto);
    void eliminar(Long id);
}
