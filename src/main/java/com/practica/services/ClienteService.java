package com.practica.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica.models.Cliente;
import com.practica.repositories.IClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private IClienteRepository clienteDao;
	
	public Cliente agregarCliente(Cliente cliente) {
		return clienteDao.save(cliente);
	}
	
	public boolean existeCorreo(String correo) {
		Cliente clienteExistente = clienteDao.findByCorreo(correo);
		return clienteExistente != null;
	}

	public Cliente actualizarCliente(Cliente cliente) {
        Cliente clienteExistente = clienteDao.findById(cliente.getId());

        if (clienteExistente == null) {
            return null;
        }

        clienteExistente.setNombre(cliente.getNombre());
        clienteExistente.setCorreo(cliente.getCorreo());

        return clienteDao.save(clienteExistente);
    }

	 public Cliente buscarClientePorId(int id) {
	        return clienteDao.findById(id);
	    }
}
