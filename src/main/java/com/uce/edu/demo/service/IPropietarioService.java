package com.uce.edu.demo.service;

import com.uce.edu.demo.modelo.Propietario;

public interface IPropietarioService {
	public void crear(Propietario p);
	public void eliminar(String cedula);
}
