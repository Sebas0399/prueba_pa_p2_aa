package com.uce.edu.demo.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.uce.edu.demo.modelo.Matricula;
import com.uce.edu.demo.modelo.Propietario;
import com.uce.edu.demo.modelo.Vehiculo;
import com.uce.edu.demo.repository.IMatriculaRepository;
import com.uce.edu.demo.repository.IPropietarioRepository;
import com.uce.edu.demo.repository.IVehiculoRepository;

@Service
public class MatriculaGestorImpl implements IMatriculaGestorService{
	
	@Autowired
	private IPropietarioRepository propietarioRepo;
	@Autowired
	private IVehiculoRepository vehiculoRepo;
	@Autowired
	private IMatriculaRepository matriculaRepo;
	@Autowired
	@Qualifier("pesado")
	private IMatriculaService pesadoService;
	
	@Autowired
	@Qualifier("liviano")
	private IMatriculaService livianoService;
	@Override
	public void generarMatricula(String cedula, String placa) {
		// TODO Auto-generated method stub
		Propietario pro=this.propietarioRepo.consultar(cedula);
		Vehiculo veh=this.vehiculoRepo.buscar(placa);
		BigDecimal valorMatricula;
		if(veh.getTipo().equalsIgnoreCase("pesado")){
			valorMatricula=this.pesadoService.calcular(veh.getPrecio());
		}
		else {
			valorMatricula=this.livianoService.calcular(veh.getPrecio());
		}
		if(valorMatricula.compareTo(new BigDecimal(2000))>0) {
			BigDecimal valorDescuento=valorMatricula.multiply(new BigDecimal(0.07));
			valorMatricula=valorMatricula.subtract(valorDescuento);
		}
		Matricula matricula=new Matricula();
		matricula.setFechaMatricula(LocalDateTime.now());
		matricula.setPropietario(pro);
		matricula.setValorMatricula(valorMatricula);
		matricula.setVehiculo(veh);
		this.matriculaRepo.crear(matricula);
	}

}
