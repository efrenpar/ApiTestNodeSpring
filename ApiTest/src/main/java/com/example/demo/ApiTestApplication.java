package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.data.entity.Paciente;

import com.example.demo.data.entity.TiposIdentificaion;
import com.example.demo.data.entity.Tipos_comprobantes;

import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.TiposIdentificacionRepository;
import com.example.demo.repository.Tipos_comprobantesRepository;

@SpringBootApplication
public class ApiTestApplication {

	
	public static void main(String[] args) {
		SpringApplication.run(ApiTestApplication.class, args);
		
	}
	
	@RestController
	@RequestMapping("/pacientes")
	public class PacienteController{
		
		@Autowired
		private PacienteRepository pacienteRepository;
		
		@GetMapping
		public Iterable<Paciente> getPacientes(){
			return this.pacienteRepository.findByPacPacNumeroLessThan(Long.parseLong("58"));
		}
		
	}
	
	@RestController
	@RequestMapping("/tipos_identificacion")
	public class TiposIdentificacionController{
		@Autowired
		private TiposIdentificacionRepository tiposIdentificacionRepository;
		
		@GetMapping
		public Iterable<TiposIdentificaion> getGests(){
			return this.tiposIdentificacionRepository.findAll();
		}
	}
	
	
	

}
