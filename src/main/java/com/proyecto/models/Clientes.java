package com.proyecto.models;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "clientes")
public class Clientes implements Serializable{
	
	@Id
	@Column(name = "RUC_DNI")
	String RUC;
	
	@Column(name = "NOMBRE_RAZON")
	int nombreRazon;
	
	@Column(name= "NOMBRE")
	String nombre;
	
	@Column(name= "APELLIDO_PATERNO")
	String apellidoPaterno;
	
	@Column(name= "APELLIDO_MATERNO")
	String apellidoMaterno;
	
	@Column(name = "RAZON_SOCIAL")
	String razonSocial;
	
	@Column(name = "DIRECCION")
	String direccion;
	
	@Column(name = "TELEFONO")
	String telefono;
	
	@Column(name = "CREDITO")
	String credito;

}
