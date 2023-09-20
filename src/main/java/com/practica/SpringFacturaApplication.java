package com.practica;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.practica.controller.ClienteController;
import com.practica.controller.DetalleController;
import com.practica.controller.FacturaController;
import com.practica.models.Cliente;
import com.practica.models.DetalleFactura;
import com.practica.models.Factura;

import ch.qos.logback.core.net.server.Client;

@SpringBootApplication
public class SpringFacturaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFacturaApplication.class, args);
	}
	
	@Autowired
    private ClienteController clienteController;

    @Autowired
    private FacturaController facturaController;
    
    @Autowired
    private DetalleController detalleFacturaController;

    @Bean
    public CommandLineRunner testMain() {
        return args -> {
           /* Cliente cliente1 = new Cliente();
            cliente1.setNombre("Kevin");
            cliente1.setCorreo("meylymerma01@gmail.com");
            clienteController.guardarCliente(cliente1);

            System.out.println("Cliente guardado correctamente.");

            Factura factura1 = new Factura();
            factura1.setNumeroFactura("1");
            factura1.setFechaEmision(new Date());

            factura1.setCliente(cliente1);

            Factura facturaGuardada = facturaController.guardarFactura(factura1);

            if (facturaGuardada != null) {
                System.out.println("Factura guardada correctamente.");
            } else {
                System.out.println("Error al guardar la factura.");
            }
            
            DetalleFactura detalleFactura = new DetalleFactura();
            detalleFactura.setFactura(facturaGuardada);
            detalleFactura.setProducto("Producto 3");
            detalleFactura.setCantidad(5);
            detalleFactura.setPrecioUnitario(10.0);

            DetalleFactura detalleGuardado = detalleFacturaController.guardarDetalleFactura(detalleFactura);

            if (detalleGuardado != null) {
                System.out.println("Detalle de factura guardado correctamente.");
            } else {
                System.out.println("Error al guardar el detalle de factura.");
            } */
        	
        	String numeroFacturaBuscado = "1";
            Factura facturaEncontrada = facturaController.buscarPorNumeroFactura(numeroFacturaBuscado);

            if (facturaEncontrada != null) {
                System.out.println("Factura encontrada: " + facturaEncontrada.getNumeroFactura());
            } else {
                System.out.println("Factura no encontrada.");
            }
        	
        };
    }

}
