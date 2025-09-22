package com.example.swagger_tienda.service;

import com.example.swagger_tienda.model.Cliente;
import java.util.List;

public interface ClienteService {
    List<Cliente> listar();
    Cliente obtenerPorId(Long id);
    Cliente crear(Cliente cliente);
    Cliente actualizar(Long id, Cliente cliente);
    void eliminar(Long id);
}
