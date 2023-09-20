package com.practica.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practica.models.Cliente;
import com.practica.models.Factura;

@Repository
public interface IFacturaRepository extends CrudRepository<Factura, Integer>{

	  Factura save(Factura factura);
	
	  Factura findByNumeroFactura(String numeroFactura);
	  
	  
}
