package com.uce.edu.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.modelo.Propietario;
import com.uce.edu.modelo.Vehiculo;
import com.uce.edu.repository.IPropietarioRepository;
import com.uce.edu.repository.IVehiculoRepository;
@Service
public class MatriculaServiceImpl implements IMatriculaService {
	private BigDecimal valorMatricula;
	@Autowired
	private IPropietarioRepository propietarioRepo;

	@Autowired
	private IVehiculoRepository vehiculoRepo;
	@Autowired
	private IVehiculoService vehiculoService;

	@Override
	public void matricular(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario p = this.propietarioRepo.buscar(cedula);
		Vehiculo v = this.vehiculoRepo.buscar(placa);
		if (vehiculoService.valorMatricula(v).compareTo(new BigDecimal(2000)) == 1) {
			this.setValorMatricula(this.vehiculoService.valorMatricula(v).multiply(new BigDecimal(0.07)));
		}
		else {
			this.setValorMatricula(this.vehiculoService.valorMatricula(v));
		}
	}

	public BigDecimal getValorMatricula() {
		return valorMatricula;
	}

	public void setValorMatricula(BigDecimal valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
}
