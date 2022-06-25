package com.uce.edu.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImpl implements IVehiculoService{
	@Autowired
	private IVehiculoRepository vehiculoRepo;
	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.insertar(v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.actualizar(v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		this.vehiculoRepo.eliminar(placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return this.vehiculoRepo.buscar(placa);
	}

}
