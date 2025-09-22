package com.example.swagger_tienda.service;

import com.example.swagger_tienda.model.Categoria;
import java.util.List;

public interface CategoriaService {
    List<Categoria> listar();
    Categoria obtenerPorId(Long id);
    Categoria crear(Categoria categoria);
    Categoria actualizar(Long id, Categoria categoria);
    void eliminar(Long id);
}
