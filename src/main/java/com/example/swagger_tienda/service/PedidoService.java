package com.example.swagger_tienda.service;

import com.example.swagger_tienda.model.Pedido;
import java.util.List;

public interface PedidoService {
    List<Pedido> listar();
    Pedido obtenerPorId(Long id);
    Pedido crear(Pedido pedido);
    Pedido actualizar(Long id, Pedido pedido);
    void eliminar(Long id);
}
