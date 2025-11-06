package com.viceali.sistema_viceali.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.viceali.sistema_viceali.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long> {}