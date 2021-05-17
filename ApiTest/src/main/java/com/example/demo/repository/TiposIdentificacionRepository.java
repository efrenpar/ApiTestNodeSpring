package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.data.entity.Paciente;
import com.example.demo.data.entity.TiposIdentificaion;



public interface TiposIdentificacionRepository extends CrudRepository<TiposIdentificaion,Long>{
	
	List<TiposIdentificaion> findByCodigoTipoIdentificacionEquals(Long codigoTipoIdentificacion);
	

}
