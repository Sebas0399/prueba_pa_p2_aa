package com.uce.edu.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Vehiculo;
import com.uce.edu.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImpl implements IVehiculoService{
	@Autowired 
	private IVehiculoRepository vehiculoRepo;
	@Override
	public BigDecimal valorMatricula(Vehiculo v) {
		// TODO Auto-generated method stub
		if(v.getTipo().equalsIgnoreCase("liviano")) {
			return(v.getPrecio().multiply(new BigDecimal(0.10)));
		}
		else {
			return(v.getPrecio().multiply(new BigDecimal(0.15)));
		}
	}

	@Override
	public void insertar(String marca, String placa, String tipo, BigDecimal precio) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void actualizar(String marca, String placa, String tipo, BigDecimal precio) {
		// TODO Auto-generated method stub
		Vehiculo v=new Vehiculo();
		v.setMarca(marca);
		v.setPlaca(placa);
		v.setPrecio(precio);
		v.setTipo(tipo);
		this.vehiculoRepo.actualizar(v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		
	}

}
