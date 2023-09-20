package com.practica.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.practica.models.Cliente;

@Repository
public interface IClienteRepository extends CrudRepository<Cliente, Integer>{

	
	Cliente save(Cliente cliente);
	
	Cliente findByCorreo(String correo);
	
	Cliente findById(int id);

	
}
