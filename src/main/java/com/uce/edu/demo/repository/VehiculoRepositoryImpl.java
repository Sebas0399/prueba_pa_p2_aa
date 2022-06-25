package com.uce.edu.demo.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{

	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el vehiculo: "+v);
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo: "+v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo: "+placa);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha buscado el vehiculo: "+placa);
		Vehiculo v=new Vehiculo();
		v.setMarca("Toyota");
		v.setPlaca(placa);
		v.setTipo("Pesado");
		v.setPrecio(new BigDecimal(16000));
		return v;
	}

}
