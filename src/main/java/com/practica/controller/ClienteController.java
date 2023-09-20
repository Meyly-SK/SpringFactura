package com.practica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.practica.models.Cliente;
import com.practica.repositories.IClienteRepository;
import com.practica.services.ClienteService;

@Controller
public class ClienteController {

	@Autowired
	private IClienteRepository clienteRepository;
	
	@Autowired
	private ClienteService clienteService;
	
	public Cliente guardarCliente(Cliente cliente) {
		try {
			if(clienteService.existeCorreo(cliente.getCorreo())) {
				System.out.println("El correo ya esta en uso");
				return null;
			}
			if(cliente == null) {
				System.out.println("El cliente no puede ser nulo");
				return null;
			}
			if (cliente.getNombre() == null || cliente.getNombre().isEmpty()) {
				System.out.println("El nombre del cliente es obligatorio");
				return null;
			}
			if (cliente.getCorreo() == null || cliente.getCorreo().isEmpty()) {
				System.out.println("El correo del cliente es obligatorio");
				return null;
			}
			return clienteService.agregarCliente(cliente);
		}catch(Exception ex) {
			System.out.println("Error al guardar al cliente - " + ex.getMessage());
			return null;
		}
	}	
	
	 public Cliente actualizarCliente(Cliente cliente) {
	        try {
	            Cliente clienteExistente = clienteService.buscarClientePorId(cliente.getId());

	            if (clienteExistente == null) {
	                System.out.println("El cliente con ID " + cliente.getId() + " no existe.");
	                return null;
	            }
	            clienteExistente.setNombre(cliente.getNombre());
	            clienteExistente.setCorreo(cliente.getCorreo());
	            return clienteService.actualizarCliente(clienteExistente);
	        } catch (Exception ex) {
	            System.out.println("Error al actualizar el cliente - " + ex.getMessage());
	            return null;
	        }
	    }
		}
