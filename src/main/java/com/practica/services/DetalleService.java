package com.practica.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.models.DetalleFactura;
import com.practica.repositories.IDetalleRepository;

@Service
public class DetalleService {
	
	   @Autowired
	    private IDetalleRepository detalleFacturaRepository;

	    public DetalleFactura crearDetalleFactura(DetalleFactura detalleFactura) {
	        return detalleFacturaRepository.save(detalleFactura);
	    }

	    public DetalleFactura agregarYValidarDetalleFactura(DetalleFactura detalleFactura) {
	        return detalleFacturaRepository.save(detalleFactura);
	    }
}
