package com.uce.edu.repository;

import java.time.LocalDateTime;

import org.springframework.stereotype.Repository;

import com.uce.edu.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{

	@Override
	public void insertar(Propietario p) {
		// TODO Auto-generated method stub
		System.out.println("Se ha insertado el propietario: "+p);
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se ha eliminado el propietario con cedula: "+cedula);
	}

	@Override
	public Propietario buscar(String cedula) {
		// TODO Auto-generated method stub
		if(cedula.equalsIgnoreCase("1725776650")) {
			System.out.println("Se ha encontrado el propietario con cedula: "+cedula);
			Propietario p=new Propietario();
			p.setApellido("Arguello");
			p.setCedula("1725776650");
			p.setFechaNacimiento(LocalDateTime.of(1999, 06, 03, 15, 11));
			return p;
		}
		else if(cedula.equalsIgnoreCase("0201114022")) {
			System.out.println("Se ha encontrado el propietario con cedula: "+cedula);
			Propietario p=new Propietario();
			p.setApellido("Rosero");
			p.setCedula("0201114022");
			p.setFechaNacimiento(LocalDateTime.of(1970, 12, 18, 14, 20));
			return p;
		}
		else {
			System.out.println("No se ha encontrado el propietario con cedula: "+cedula);
			return null;
		}
		
	}

}
