package com.uce.edu.demo;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.modelo.Propietario;
import com.uce.edu.modelo.Vehiculo;
import com.uce.edu.service.IMatriculaService;
import com.uce.edu.service.IVehiculoService;

@SpringBootApplication
public class PruebaPaP2AaApplication implements CommandLineRunner{
	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IMatriculaService matriculaServie;
	public static void main(String[] args) {
		SpringApplication.run(PruebaPaP2AaApplication.class, args);
		
	}
	@Override
	public void run(String... args) throws Exception {
		Vehiculo v=new Vehiculo();
		v.setMarca("Mazda");
		v.setPlaca("PCA-123");
		v.setPrecio(new BigDecimal(17000));
		v.setTipo("liviano");
		this.vehiculoService.actualizar("Chevrolet", "PCA-123", "liviano", new BigDecimal(15000));
		
		Propietario p=new Propietario();
		p.setApellido("Arguello");
		p.setCedula("1725776650");
		p.setFechaNacimiento(LocalDateTime.of(1999, 06, 03, 15, 11));
		
		
	}
	
}
