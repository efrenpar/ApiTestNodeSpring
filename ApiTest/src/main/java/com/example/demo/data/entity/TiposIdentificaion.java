package com.example.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="daf_tipos_identificacion")
public class TiposIdentificaion {

	@Id
	@Column(name="CODIGO_TIPO_IDENTIFICACION")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigoTipoIdentificacion;
	
	@Column(name="NOMBRE_TIPO_IDENTIFICACION")
	private String nombreTipoIdentificacion;
	
	@Column(name="ABREVIATURA_IDENTIFICACION")
	private String abreviaturaIdentificacion;

	public long getCodigoTipoIdentificacion() {
		return codigoTipoIdentificacion;
	}

	public void setCodigoTipoIdentificacion(long codigoTipoIdentificacion) {
		this.codigoTipoIdentificacion = codigoTipoIdentificacion;
	}

	public String getNombreTipoIdentificacion() {
		return nombreTipoIdentificacion;
	}

	public void setNombreTipoIdentificacion(String nombreTipoIdentificacion) {
		this.nombreTipoIdentificacion = nombreTipoIdentificacion;
	}

	public String getAbreviaturaIdentificacion() {
		return abreviaturaIdentificacion;
	}

	public void setAbreviaturaIdentificacion(String abreviaturaIdentificacion) {
		this.abreviaturaIdentificacion = abreviaturaIdentificacion;
	}
	
	
	
}
