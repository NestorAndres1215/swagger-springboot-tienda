package com.example.swagger_tienda.service.impl;

import com.example.swagger_tienda.model.Pedido;
import com.example.swagger_tienda.repository.PedidoRepository;
import com.example.swagger_tienda.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoRepository repository;

    @Override
    public List<Pedido> listar() {
        return repository.findAll();
    }

    @Override
    public Pedido obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Pedido crear(Pedido pedido) {
        return repository.save(pedido);
    }

    @Override
    public Pedido actualizar(Long id, Pedido pedido) {
        Pedido existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setCliente(pedido.getCliente());
            existente.setFecha(pedido.getFecha());
            return repository.save(existente);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
