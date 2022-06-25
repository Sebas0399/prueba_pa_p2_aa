package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.modelo.Propietario;
import com.uce.edu.modelo.Vehiculo;
import com.uce.edu.service.IMatriculaGestorService;
import com.uce.edu.service.IPropietarioService;
import com.uce.edu.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2AaApplication implements CommandLineRunner{
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IPropietarioService propietarioService;
	@Autowired
	private IMatriculaGestorService matriculaGestor;
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2AaApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Vehiculo v=new Vehiculo();
		v.setMarca("Mazda");
		v.setPlaca("PVA-314");
		v.setPrecio(new BigDecimal(50000));
		v.setTipo("pesado");
		this.vehiculoService.insertar(v);
		
		v.setPrecio(new BigDecimal(40000));
		v.setMarca("Maya");
		this.vehiculoService.actualizar(v);
		
		Propietario p=new Propietario();
		p.setApellido("Arguello");
		p.setCedula("1725776650");
		p.setFechaNacimiento(LocalDateTime.now());
		p.setNombre("Antony");
		this.propietarioService.crear(p);
		
		this.matriculaGestor.generarMatricula(p.getCedula(), v.getPlaca());
				
		
	}
	
}
