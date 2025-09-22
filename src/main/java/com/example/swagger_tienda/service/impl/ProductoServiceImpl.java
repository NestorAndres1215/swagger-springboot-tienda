package com.example.swagger_tienda.service.impl;

import com.example.swagger_tienda.model.Producto;
import com.example.swagger_tienda.repository.ProductoRepository;
import com.example.swagger_tienda.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoRepository repository;

    @Override
    public List<Producto> listar() {
        return repository.findAll();
    }

    @Override
    public Producto obtenerPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con id " + id));
    }

    @Override
    public Producto crear(Producto producto) {
        return repository.save(producto);
    }

    @Override
    public Producto actualizar(Long id, Producto producto) {
        // Trae la entidad desde la BD
        Producto existente = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Producto no encontrado con id " + id));

        // Actualiza solo los campos
        existente.setNombre(producto.getNombre());
        existente.setPrecio(producto.getPrecio());
        existente.setStock(producto.getStock());

        // Guarda la entidad "attached"
        return repository.save(existente);
    }

    @Override
    public void eliminar(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Producto no encontrado con id " + id);
        }
        repository.deleteById(id);
    }
}
