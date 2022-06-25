package com.uce.edu.demo.repository;

import com.uce.edu.demo.modelo.Vehiculo;

public interface IVehiculoRepository {
	public void insertar(Vehiculo v);
	public void actualizar(Vehiculo v);
	public void eliminar(String placa);
	public Vehiculo buscar(String placa);
}
