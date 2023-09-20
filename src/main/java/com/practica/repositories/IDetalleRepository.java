package com.practica.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practica.models.DetalleFactura;
import com.practica.models.Factura;

@Repository
public interface IDetalleRepository extends CrudRepository<DetalleFactura, Integer>{

	List<DetalleFactura> findByFacturaNumeroFactura(String numeroFactura);
}
