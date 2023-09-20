package com.practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.practica.models.DetalleFactura;
import com.practica.services.DetalleService;

@Controller
public class DetalleController {

	@Autowired
    private DetalleService detalleFacturaService;

    public DetalleFactura guardarDetalleFactura(DetalleFactura detalleFactura) {
        try {
            if (detalleFactura == null) {
                System.out.println("El detalle de factura no puede ser nulo");
                return null;
            }

            return detalleFacturaService.agregarYValidarDetalleFactura(detalleFactura);
        } catch (Exception ex) {
            System.out.println("Error al guardar el detalle de factura - " + ex.getMessage());
            return null;
        }
    }
}
