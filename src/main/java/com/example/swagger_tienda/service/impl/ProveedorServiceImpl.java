package com.example.swagger_tienda.service.impl;

import com.example.swagger_tienda.model.Proveedor;
import com.example.swagger_tienda.repository.ProveedorRepository;
import com.example.swagger_tienda.service.ProveedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProveedorServiceImpl implements ProveedorService {

    @Autowired
    private ProveedorRepository repository;

    @Override
    public List<Proveedor> listar() {
        return repository.findAll();
    }

    @Override
    public Proveedor obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Proveedor crear(Proveedor proveedor) {
        return repository.save(proveedor);
    }

    @Override
    public Proveedor actualizar(Long id, Proveedor proveedor) {
        Proveedor existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(proveedor.getNombre());
            existente.setTelefono(proveedor.getTelefono());
            return repository.save(existente);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
