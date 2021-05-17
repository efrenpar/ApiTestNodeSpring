package com.example.demo.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Id;

public class Paciente_TiposIdentificacion {

	
	
	
	private String numeroIdentificacion;
	
	
	
	private long pacPacNumero;
	
	
	
	private Long codigoTipoIdentificacion;
	
	
	private String primerNombre;
	
	
	private String segundoNombre;
	
	
	private String primerApellido;
	
	
	private String segundoApellido;
	
	
	private String nombreCompleto;
	
	
	private Date fechaNacimiento;
	
	
	
	private String edad;
	
	
	private String genero;
	
	
	private String mail;
	
	
	private String mailAlterno;
	
	
	private String telefonoMovil;
	
	
	private String telefonoFijo;
	
	private String nombreTipoIdentificacion;
	
	private String abreviaturaIdentificacion;
	
	
	
	

	public Paciente_TiposIdentificacion(Paciente paciente) {
		this.numeroIdentificacion = paciente.getNumeroIdentificacion();
		this.pacPacNumero = paciente.getPacPacNumero();
		this.codigoTipoIdentificacion = paciente.getCodigoTipoIdentificacion();
		this.primerNombre = paciente.getPrimerNombre();
		this.segundoNombre = paciente.getSegundoNombre();
		this.primerApellido = paciente.getPrimerApellido();
		this.segundoApellido = paciente.getSegundoApellido();
		this.nombreCompleto = paciente.getNombreCompleto();
		this.fechaNacimiento = paciente.getFechaNacimiento();
		this.edad = paciente.getEdad();
		this.genero = paciente.getGenero();
		this.mail = paciente.getMail();
		this.mailAlterno = paciente.getMailAlterno();
		this.telefonoMovil = paciente.getTelefonoMovil();
		this.telefonoFijo = paciente.getTelefonoFijo();
	}

	public String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}

	public void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = numeroIdentificacion;
	}

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
