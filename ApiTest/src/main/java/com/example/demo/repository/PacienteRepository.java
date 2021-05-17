package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.data.entity.Paciente;
import com.example.demo.data.entity.TiposIdentificaion;

public interface PacienteRepository extends CrudRepository<Paciente,Long>{
	
	List<Paciente> findByPacPacNumero(Long pacPacNumero);
	List<Paciente> findByPacPacNumeroLessThan(Long pacPacNumero);
	List<Paciente> findByCodigoTipoIdentificacionAndPacPacNumeroLessThan(Long codigoTipoIdentificacion,Long max);
	List<Paciente> findBynumeroIdentificacion(String valorFiltro);
	List<Paciente> findBynombreCompletoContaining(String valorFiltro);
	List<Paciente> findBynumeroIdentificacionOrNombreCompletoContaining(String valorFiltro,String valorFiltro1);
	
	
	
	
}
