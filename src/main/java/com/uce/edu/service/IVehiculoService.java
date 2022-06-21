package com.uce.edu.service;

import java.math.BigDecimal;

import com.uce.edu.modelo.Vehiculo;
public interface IVehiculoService {

public void insertar(String marca, String placa, String tipo, BigDecimal precio);

public Vehiculo buscar(String placa);

	public void actualizar(String marca, String placa, String tipo, BigDecimal precio);

public void eliminar(String placa);
	public BigDecimal valorMatricula(Vehiculo v);
}
