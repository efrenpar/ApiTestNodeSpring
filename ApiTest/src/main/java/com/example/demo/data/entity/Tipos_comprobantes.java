package com.example.demo.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="daf_tipos_comprobantes")
public class Tipos_comprobantes implements Responsable{
	
	@Id
	@Column(name="CODIGO_TIPO_COMPROBANTE")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long codigoTipoComprobante;
	
	@Column(name="CODIGO_EMPRESA")
	private long codigoEmpresa;

	@JsonIgnore
	@Column(name="CODIGO_TIPO_COMPROBANTE_PADRE")
	private Long codigoTipoComprobantePadre;
	
	@JsonIgnore
	@Column(name="CODIGO_EMPRESA_PADRE")
	private Long codigoEmpresaPadre;
	
	@Column(name="NOMBRE_TIPO_COMPROBANTE")
	private String nombreTipoComprobantePadre;

	@Column(name="CODIGO_SRI")
	private long codigoSRI;
	
	@Column(name="ES_C_X_C")
	private String esCXC;
	
	@Column(name="ES_C_X_P")
	private String esCXP;
	
	@Column(name="ES_ACTIVO")
	private String esActivo;
	
	@Column(name="FECHA_INGRESO")
	private String fechaIngreso;
	
	@Column(name="USUARIO_INGRESO")
	private String usuarioIngreso;
	
	@Column(name="FECHA_MODIFICACION")
	private String fechaModificacion;
	
	@Column(name="USUARIO_MODIFICACION")
	private String usuarioModificacion;
	
	@Column(name="NEMONICO")
	private String nemonico;

	public long getCodigoTipoComprobante() {
		return codigoTipoComprobante;
	}

	public void setCodigoTipoComprobante(long codigoTipoComprobante) {
		this.codigoTipoComprobante = codigoTipoComprobante;
	}

	public long getCodigoEmpresa() {
		return codigoEmpresa;
	}

	public void setCodigoEmpresa(long codigoEmpresa) {
		this.codigoEmpresa = codigoEmpresa;
	}

	public long getCodigoTipoComprobantePadre() {
		return codigoTipoComprobantePadre;
	}

	public void setCodigoTipoComprobantePadre(long codigoTipoComprobantePadre) {
		this.codigoTipoComprobantePadre = codigoTipoComprobantePadre;
	}

	public long getCodigoEmpresaPadre() {
		return codigoEmpresaPadre;
	}

	public void setCodigoEmpresaPadre(long codigoEmpresaPadre) {
		this.codigoEmpresaPadre = codigoEmpresaPadre;
	}

	public String getNombreTipoComprobantePadre() {
		return nombreTipoComprobantePadre;
	}

	public void setNombreTipoComprobantePadre(String nombreTipoComprobantePadre) {
		this.nombreTipoComprobantePadre = nombreTipoComprobantePadre;
	}

	public long getCodigoSRI() {
		return codigoSRI;
	}

	public void setCodigoSRI(long codigoSRI) {
		this.codigoSRI = codigoSRI;
	}

	public String getEsCXC() {
		return esCXC;
	}

	public void setEsCXC(String esCXC) {
		this.esCXC = esCXC;
	}

	public String getEsCXP() {
		return esCXP;
	}

	public void setEsCXP(String esCXP) {
		this.esCXP = esCXP;
	}

	public String getEsActivo() {
		return esActivo;
	}

	public void setEsActivo(String esActivo) {
		this.esActivo = esActivo;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public String getUsuarioIngreso() {
		return usuarioIngreso;
	}

	public void setUsuarioIngreso(String usuarioIngreso) {
		this.usuarioIngreso = usuarioIngreso;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getUsuarioModificacion() {
		return usuarioModificacion;
	}

	public void setUsuarioModificacion(String usuarioModificacion) {
		this.usuarioModificacion = usuarioModificacion;
	}

	public String getNemonico() {
		return nemonico;
	}

	public void setNemonico(String nemonico) {
		this.nemonico = nemonico;
	}
	
	
	
	
	
	

}
