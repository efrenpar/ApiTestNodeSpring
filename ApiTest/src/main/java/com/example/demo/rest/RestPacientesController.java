package com.example.demo.rest;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ApiTestApplication.TiposIdentificacionController;
import com.example.demo.data.entity.Paciente;
import com.example.demo.data.entity.Paciente_TiposIdentificacion;
import com.example.demo.data.entity.TiposIdentificaion;
import com.example.demo.data.entity.Tipos_comprobantes;
import com.example.demo.repository.PacienteRepository;
import com.example.demo.repository.TiposIdentificacionRepository;
import com.example.demo.repository.Tipos_comprobantesRepository;
import com.example.demo.utils.Mensaje;
import com.example.demo.utils.MensajePaciente;

@RestController
@RequestMapping("/pacientes/consulta_basica")
public class RestPacientesController {
	
	@Autowired
	private  PacienteRepository pacienteRepository;
	
	@Autowired
	private TiposIdentificacionRepository tiposIdentificacionRepository;
	
	
	
	@GetMapping
	public ResponseEntity<MensajePaciente> getPacientes(@RequestHeader(value="Application")String application,
			@RequestParam(value="codigoTipoIdentificacion",required=false) String codigoIdentificaion,
			@RequestParam(value="tipoFiltro",required=false)String tipoFiltro, 
			@RequestParam(value="valorFiltro",required=false)String valorFiltro){
		
		
		ArrayList<Paciente> paceinetsList = new ArrayList<Paciente>();
		ArrayList<TiposIdentificaion>identificacion = new ArrayList<>();
		MensajePaciente response = new MensajePaciente(200,"hay codigoempresa",true,integrateDocInfromation(paceinetsList));
		
		if(application.equals("UEhBTlRPTVhfV0VC")) {
				if( tipoFiltro==null || valorFiltro==null || codigoIdentificaion==null) {
					this.pacienteRepository.findByPacPacNumeroLessThan(Long.parseLong("17")).forEach(paceinetsList::add);
					this.tiposIdentificacionRepository.findAll().forEach(identificacion::add);
					
					response = new MensajePaciente(200,"Los primeros registros",true,integrateDocInfromation(paceinetsList));
				}
			
				if(codigoIdentificaion!=null) {
					this.pacienteRepository.findByCodigoTipoIdentificacionAndPacPacNumeroLessThan(
							Long.parseLong(codigoIdentificaion), Long.parseLong("58")).forEach(paceinetsList::add);
					
					response = new MensajePaciente(200,"Por codigo de identificacion",true,integrateDocInfromation(paceinetsList));
					paceinetsList.clear();
				}else if(tipoFiltro.equals("numeroIdentificacion")) {
					
					this.pacienteRepository.findBynumeroIdentificacion(valorFiltro).forEach(paceinetsList::add);
					integrateDocInfromation(paceinetsList);
					response = new MensajePaciente(200,"Por numero de Identificacion",true,integrateDocInfromation(paceinetsList));
					paceinetsList.clear();
				}else if(tipoFiltro.equals("numeroIdentificacion_nombrePaciente")) {
					this.pacienteRepository.findBynumeroIdentificacionOrNombreCompletoContaining(valorFiltro,valorFiltro).forEach(paceinetsList::add);
					integrateDocInfromation(paceinetsList);
					response = new MensajePaciente(200,"Por numeroIdentificacion_nombrePaciente",true,integrateDocInfromation(paceinetsList));
					paceinetsList.clear();
				}else if(tipoFiltro.equals("nombrePaciente")) {
					this.pacienteRepository.findBynombreCompletoContaining(valorFiltro).forEach(paceinetsList::add);
					integrateDocInfromation(paceinetsList);
					response = new MensajePaciente(200,"Por nombre de Paciente",true,integrateDocInfromation(paceinetsList));
					paceinetsList.clear();
				}
			
			
		}else {
			response = new MensajePaciente(400,"El valor de Application es incorrecto",false,integrateDocInfromation(paceinetsList));
		}
		
		
		
		return ResponseEntity.status(HttpStatus.OK).body(response);
		
	}
	
	
	public ArrayList<Paciente_TiposIdentificacion> integrateDocInfromation(ArrayList<Paciente> pacientes) {
		
		TiposIdentificaion identificacion = new TiposIdentificaion();
		ArrayList<Paciente_TiposIdentificacion> pacientesTipos = new ArrayList<>();
		
		for (Paciente paciente : pacientes) {
			
			Paciente_TiposIdentificacion paciTipos = new Paciente_TiposIdentificacion(paciente);
			
			identificacion = this.tiposIdentificacionRepository.findById(paciente.getCodigoTipoIdentificacion()).get();
			
			paciTipos.setNombreTipoIdentificacion(identificacion.getNombreTipoIdentificacion());
			paciTipos.setAbreviaturaIdentificacion(identificacion.getAbreviaturaIdentificacion());
			
			pacientesTipos.add(paciTipos);
		}
		
		return pacientesTipos;
		
	}
	

}
