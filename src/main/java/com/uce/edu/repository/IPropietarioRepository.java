package com.uce.edu.repository;

import com.uce.edu.modelo.Propietario;

public interface IPropietarioRepository {
	
	//c: Create
	public void insertar(Propietario p);

	// D: Delete
	public void eliminar(String cedula);
	public Propietario buscar(String cedula);
}
