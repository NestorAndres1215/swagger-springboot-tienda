package com.example.swagger_tienda.service.impl;

import com.example.swagger_tienda.model.DetallePedido;
import com.example.swagger_tienda.repository.DetallePedidoRepository;
import com.example.swagger_tienda.service.DetallePedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetallePedidoServiceImpl implements DetallePedidoService {

    @Autowired
    private DetallePedidoRepository repository;

    @Override
    public List<DetallePedido> listar() {
        return repository.findAll();
    }

    @Override
    public DetallePedido obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public DetallePedido crear(DetallePedido detalle) {
        return repository.save(detalle);
    }

    @Override
    public DetallePedido actualizar(Long id, DetallePedido detalle) {
        DetallePedido existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setProducto(detalle.getProducto());
            existente.setCantidad(detalle.getCantidad());
            existente.setPrecio(detalle.getPrecio());
            existente.setPedido(detalle.getPedido());
            return repository.save(existente);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
