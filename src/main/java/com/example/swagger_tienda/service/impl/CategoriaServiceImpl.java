package com.example.swagger_tienda.service.impl;

import com.example.swagger_tienda.model.Categoria;
import com.example.swagger_tienda.repository.CategoriaRepository;
import com.example.swagger_tienda.service.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository repository;

    @Override
    public List<Categoria> listar() {
        return repository.findAll();
    }

    @Override
    public Categoria obtenerPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Categoria crear(Categoria categoria) {
        return repository.save(categoria);
    }

    @Override
    public Categoria actualizar(Long id, Categoria categoria) {
        Categoria existente = repository.findById(id).orElse(null);
        if (existente != null) {
            existente.setNombre(categoria.getNombre());
            return repository.save(existente);
        }
        return null;
    }

    @Override
    public void eliminar(Long id) {
        repository.deleteById(id);
    }
}
