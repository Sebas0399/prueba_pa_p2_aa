package com.uce.edu.repository;

import com.uce.edu.modelo.Vehiculo;

public interface IVehiculoRepository {
	//CRUD
			//c: Create
			public void insertar(Vehiculo v);

			// R: Read
			public Vehiculo buscar(String placa);

			// U: Update
			public void actualizar(Vehiculo b);

			// D: Delete
			public void eliminar(String placa);
}
