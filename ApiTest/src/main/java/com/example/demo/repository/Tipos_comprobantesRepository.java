package com.example.demo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.data.entity.Tipos_comprobantes;

public interface Tipos_comprobantesRepository extends CrudRepository<Tipos_comprobantes,Long>{
	List<Tipos_comprobantes> findByCodigoEmpresa(Long codigoEmpresa);
	List<Tipos_comprobantes> findByCodigoEmpresaAndNombreTipoComprobantePadre(Long codigoEmpresa, String nombreTipoComprobantePadre);

}
