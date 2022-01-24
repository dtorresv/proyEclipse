package com.ejemplocrud.ejemplocrud.service;

import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.MediaSize.Other;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplocrud.ejemplocrud.exception.ModelNotFoundException;
import com.ejemplocrud.ejemplocrud.modelo.Trabajador;
import com.ejemplocrud.ejemplocrud.repository.ITrabajadorRepository;

@Service
public class TrbajadorServices implements ITrabajadorServices{

	@Autowired
	private ITrabajadorRepository clientRepo;
	
	@Override
	public Trabajador create(Trabajador cliente) {
		// TODO Auto-generated method stub		
		return clientRepo.save(cliente);
	}

	@Override
	public Trabajador update(Trabajador cliente) {
		// TODO Auto-generated method stub
		return clientRepo.save(cliente);
	}	

	@Override
	public Trabajador findById(Integer id) {
		Optional<Trabajador> clienteOptional=clientRepo.findById(id);
		if(clienteOptional.isEmpty())
			throw new ModelNotFoundException("Trabajador no encontrdo");
		return clienteOptional.get();
	}

	@Override
	public List<Trabajador> findAll() {
		if(clientRepo.findAll().isEmpty())
			throw new ModelNotFoundException("No Existe ningun trabajador en Base de Datos");
		return clientRepo.findAll();
	}

	@Override
	public void delete(Integer id) {
		Optional<Trabajador> clienteOptional=clientRepo.findById(id);
		if(clienteOptional.isEmpty())
			throw new ModelNotFoundException("El trabajador que desea eliminar no existe");
		}
	
}
