package com.viceali.sistema_viceali.service;

import com.viceali.sistema_viceali.model.Producto;
import com.viceali.sistema_viceali.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    // Listar todos los productos
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    // Guardar producto (nuevo o editado)
    public void guardarProducto(Producto producto) {
        productoRepository.save(producto);
    }

    // Buscar producto por ID
    public Producto obtenerPorId(Long id) {
        Optional<Producto> optional = productoRepository.findById(id);
        return optional.orElse(null);
    }

    // Eliminar producto
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }
}