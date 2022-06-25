package com.uce.edu.demo.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.demo.modelo.Propietario;

@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void crear(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha creado un propietario: "+p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario con cedula: "+cedula);
	}

	@Override
	public Propietario consultar(String cedula) {
		// TODO Auto-generated method stub
		Propietario pro=new Propietario();
		pro.setApellido("Arguello");
		pro.setNombre("Antony");
		pro.setFechaNacimiento(LocalDateTime.now());
		pro.setCedula(cedula);
		return pro;
	}

}
