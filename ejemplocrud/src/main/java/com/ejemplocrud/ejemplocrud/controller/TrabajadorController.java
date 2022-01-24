package com.ejemplocrud.ejemplocrud.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.RuntimeBeanNameReference;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplocrud.ejemplocrud.exception.ModelNotFoundException;
import com.ejemplocrud.ejemplocrud.modelo.Trabajador;
import com.ejemplocrud.ejemplocrud.modelo.TrabajadorMapp;
import com.ejemplocrud.ejemplocrud.repository.ITrabajadorRepository;
import com.ejemplocrud.ejemplocrud.service.ITrabajadorServices;

@RestController
@RequestMapping("/trabajador")
public class TrabajadorController {

	@Autowired
	private ITrabajadorServices trabajadorService;
	
	@GetMapping
	public ResponseEntity<List<Trabajador>> findAll(){
		return new ResponseEntity<>(trabajadorService.findAll(), HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Trabajador> update(@RequestBody Trabajador trabajador) {
		return new ResponseEntity<>(trabajadorService.update(trabajador), HttpStatus.CREATED);
	}
	
	@PostMapping
	public ResponseEntity<Trabajador> create(@RequestBody Trabajador trabajador) {
		return new ResponseEntity<>(trabajadorService.create(trabajador), HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Trabajador> findByID(@PathVariable Integer id) {
		return  new ResponseEntity<>(trabajadorService.findById(id), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Object> delete(@PathVariable Integer id) {
		trabajadorService.delete(id);
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
