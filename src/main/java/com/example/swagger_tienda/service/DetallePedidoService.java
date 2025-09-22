package com.example.swagger_tienda.service;

import com.example.swagger_tienda.model.DetallePedido;
import java.util.List;

public interface DetallePedidoService {
    List<DetallePedido> listar();
    DetallePedido obtenerPorId(Long id);
    DetallePedido crear(DetallePedido detalle);
    DetallePedido actualizar(Long id, DetallePedido detalle);
    void eliminar(Long id);
}
