package com.uce.edu.repository;

import java.math.BigDecimal;

import org.springframework.stereotype.Repository;

import com.uce.edu.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{
	@Override
	public void insertar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado un vehiculo: "+v);
	}

	@Override
	public Vehiculo buscar(String placa) {
		// TODO Auto-generated method stub
		
		if(placa.equalsIgnoreCase("PCA-123")) {
			System.out.println("Se ha encontado el vehiculo de placa: "+placa);
			Vehiculo v=new Vehiculo();
			v.setMarca("Chevrolet");
			v.setPlaca("PCA-123");
			v.setPrecio(new BigDecimal(15000));
			v.setTipo("liviano");
			return v;
		}
		else if(placa.equals("PXZ-465")){
			System.out.println("Se ha encontado el vehiculo de placa: "+placa);
			Vehiculo v=new Vehiculo();
			v.setMarca("Hino");
			v.setPlaca("PXZ-465");
			v.setPrecio(new BigDecimal(70000));
			v.setTipo("pesado");
			return v;
		}
		else {
			System.out.println("No se ha encontrado el vechiculo de placa: "+placa);
			return null;
		}
		
		
	}

	@Override
	public void actualizar(Vehiculo v) {
		// TODO Auto-generated method stub
		System.out.println("Se ha actualizado el vehiculo: "+v);
	}

	@Override
	public void eliminar(String placa) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el vehiculo de placa: "+placa);
	}
	
}
