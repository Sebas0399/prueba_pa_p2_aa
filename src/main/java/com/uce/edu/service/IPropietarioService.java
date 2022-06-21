package com.uce.edu.service;

import java.time.LocalDateTime;

public interface IPropietarioService {

	public void insertar(String nombre, String apellido, String cedula, LocalDateTime fechaNacimiento);

	public void eliminar(String cedula);
}
