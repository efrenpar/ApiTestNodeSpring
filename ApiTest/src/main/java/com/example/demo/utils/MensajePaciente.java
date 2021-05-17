package com.example.demo.utils;

import java.util.ArrayList;

import com.example.demo.data.entity.Paciente;
import com.example.demo.data.entity.Paciente_TiposIdentificacion;
import com.example.demo.data.entity.Tipos_comprobantes;

public class MensajePaciente {
	
	private int code;
	private String message;
	private boolean succes;
	private ArrayList<Paciente_TiposIdentificacion> data;
	public MensajePaciente(int code, String message, boolean succes, ArrayList<Paciente_TiposIdentificacion>data) {
		super();
		this.code = code;
		this.message = message;
		this.succes = succes;
		this.data = data;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isSucces() {
		return succes;
	}
	public void setSucces(boolean succes) {
		this.succes = succes;
	}
	public ArrayList<Paciente_TiposIdentificacion> getData() {
		return data;
	}
	public void setData(ArrayList<Paciente_TiposIdentificacion> data) {
		this.data = data;
	}
	
	
	
	
	

}
