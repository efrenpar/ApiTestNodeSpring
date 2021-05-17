package com.example.demo.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mgm_pacientes")
public class Paciente {
	
	@Id
	@Column(name="NUMERO_IDENTIFICACION",nullable = false)
	private String numeroIdentificacion;
	
	
	@Column(name="PAC_PAC_NUMERO",nullable = false)
	private long pacPacNumero;
	
	
	@Column(name="CODIGO_TIPO_IDENTIFICACION")
	private Long codigoTipoIdentificacion;
	
	@Column(name="PRIMER_NOMBRE")
	private String primerNombre;
	
	@Column(name="SEGUNDO_NOMBRE")
	private String segundoNombre;
	
	@Column(name="PRIMER_APELLIDO")
	private String primerApellido;
	
	@Column(name="SEGUNDO_APELLIDO")
	private String segundoApellido;
	
	@Column(name="NOMBRE_COMPLETO")
	private String nombreCompleto;
	
	@Column(name="FECHA_NACIMIENTO")
	private Date fechaNacimiento;
	
	
	@Column(name="EDAD",nullable = false)
	private String edad;
	
	@Column(name="GENERO")
	private String genero;
	
	@Column(name="MAIL")
	private String mail;
	
	@Column(name="MAIL_ALTERNO",nullable = false)
	private String mailAlterno;
	
	@Column(name="TELEFONO_MOVIL",nullable = true)
	private String telefonoMovil;
	
	@Column(name="TELEFONO_FIJO",nullable = true)
	private String telefonoFijo;
	
	

	
	public long getPacPacNumero() {
		return pacPacNumero;
	}

	public void setPacPacNumero(long pacPacNumero) {
		this.pacPacNumero = pacPacNumero;
	}

	

	public Long getCodigoTipoIdentificacion() {
		return codigoTipoIdentificacion;
	}

	public void setCodigoTipoIdentificacion(Long codigoTipoIdentificacion) {
		this.codigoTipoIdentificacion = codigoTipoIdentificacion;
	}

	public String getPrimerNombre() {
		return primerNombre;
	}

	public void setPrimerNombre(String primerNombre) {
		this.primerNombre = primerNombre;
	}

	public String getSegundoNombre() {
		return segundoNombre;
	}

	public void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = segundoNombre;
	}

	public String getPrimerApellido() {
		return primerApellido;
	}

	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}

	public String getSegundoApellido() {
		return segundoApellido;
	}

	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getEdad() {
		return edad;
	}

	public void setEdad(String edad) {
		this.edad = edad;
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getMailAlterno() {
		return mailAlterno;
	}

	public void setMailAlterno(String mailAlterno) {
		this.mailAlterno = mailAlterno;
	}

	public String getTelefonoMovil() {
		return telefonoMovil;
	}

	public void setTelefonoMovil(String telefonoMovil) {
		this.telefonoMovil = telefonoMovil;
	}

	public String getTelefonoFijo() {
		return telefonoFijo;
	}

	public void setTelefonoFijo(String telefonoFijo) {
		this.telefonoFijo = telefonoFijo;
	}

	
	
	
	
	
	
	

}
