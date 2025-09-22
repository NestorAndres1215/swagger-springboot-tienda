package com.example.swagger_tienda.controller;

import com.example.swagger_tienda.model.DetallePedido;
import com.example.swagger_tienda.service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/detalle-pedidos")
public class DetallePedidoController {

    @Autowired
    private DetallePedidoService service;

    @GetMapping
    public List<DetallePedido> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public DetallePedido obtener(@PathVariable Long id) {
        return service.obtenerPorId(id);
    }

    @PostMapping
    public DetallePedido crear(@RequestBody DetallePedido detalle) {
        return service.crear(detalle);
    }

    @PutMapping("/{id}")
    public DetallePedido actualizar(@PathVariable Long id, @RequestBody DetallePedido detalle) {
        return service.actualizar(id, detalle);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        service.eliminar(id);
    }
}
