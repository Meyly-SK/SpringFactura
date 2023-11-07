package com.proyecto.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.proyecto.models.Clientes;

@Repository
public interface IClientes extends CrudRepository<Clientes, String>{

	public List<Clientes> findAll();
}
