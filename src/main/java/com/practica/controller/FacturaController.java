package com.practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.practica.models.Factura;
import com.practica.services.FacturaService;

@Controller
public class FacturaController {
	
	@Autowired
	private FacturaService facturaService;
	
	public Factura guardarFactura(Factura factura) {
		try {
			if(facturaService.existeNumeroFactura(factura.getNumeroFactura())) {
				System.out.println("Numero existente");
				return null;
			}
			if(factura == null) {
				System.out.println("La factura no puede ser nulo");
				return null;
			}

			return facturaService.crearFactura(factura);
		}catch(Exception ex) {
			System.out.println("Error al guardar al cliente - " + ex.getMessage());
			return null;
		}
	}	
	

    public Factura buscarPorNumeroFactura(String numeroFactura) {
        Factura factura = facturaService.buscarPorNumero(numeroFactura);

        if (factura != null) {
            return factura;
        } else {
            System.out.println("Factura no encontrada.");
            return null;
        }
    }
}
