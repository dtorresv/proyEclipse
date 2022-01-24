package com.ejemplocrud.ejemplocrud.service;

import java.util.List;

import com.ejemplocrud.ejemplocrud.modelo.Trabajador;
import com.ejemplocrud.ejemplocrud.modelo.TrabajadorMapp;

public interface ITrabajadorServices {

	Trabajador create(Trabajador trabajador);
	
	Trabajador update(Trabajador cliente);
	
	Trabajador findById(Integer id);
	
	List<Trabajador> findAll();
	
	void delete(Integer id);
}
