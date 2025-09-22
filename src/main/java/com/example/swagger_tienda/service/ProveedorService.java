package com.example.swagger_tienda.service;

import com.example.swagger_tienda.model.Proveedor;
import java.util.List;

public interface ProveedorService {
    List<Proveedor> listar();
    Proveedor obtenerPorId(Long id);
    Proveedor crear(Proveedor proveedor);
    Proveedor actualizar(Long id, Proveedor proveedor);
    void eliminar(Long id);
}
