package com.example.swagger_tienda.service.impl;

import com.example.swagger_tienda.model.Cliente;
import com.example.swagger_tienda.repository.ClienteRepository;
import com.example.swagger_tienda.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository repository;

    @Override
    public List<Cliente> listar() {
        return repository.findAll();
    }

    @Override
    public Cliente obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Cliente crear(Cliente cliente) {
        return repository.save(cliente);
    }

    @Override
    public Cliente actualizar(Long id, Cliente cliente) {
        Cliente existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(cliente.getNombre());
            existente.setEmail(cliente.getEmail());
            return repository.save(existente);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
