package com.practica.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.models.Cliente;
import com.practica.models.Factura;
import com.practica.repositories.IFacturaRepository;

@Service
public class FacturaService {

	 	@Autowired
	    private IFacturaRepository facturaRepository;
	 	
	 	public Factura crearFactura(Factura factura) {
	         return facturaRepository.save(factura);
	    }

	    public boolean existeNumeroFactura(String numeroFactura) {
	         Factura facturaExistente = facturaRepository.findByNumeroFactura(numeroFactura);
	         return facturaExistente != null;
	    }
	    
	    public Factura buscarPorNumero(String numeroFactura) {
	        return facturaRepository.findByNumeroFactura(numeroFactura);
	    }

}
