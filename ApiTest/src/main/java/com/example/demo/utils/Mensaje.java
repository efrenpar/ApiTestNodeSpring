package com.example.demo.utils;

import java.util.ArrayList;

import com.example.demo.data.entity.Responsable;
import com.example.demo.data.entity.Tipos_comprobantes;
import com.example.demo.repository.Tipos_comprobantesRepository;

public class Mensaje {
	
	private int code;
	private String message;
	private boolean succes;
	private ArrayList<Tipos_comprobantes> data;
	
	public Mensaje(int code, String message, boolean succes, ArrayList<Tipos_comprobantes>data) {
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


	public ArrayList<Tipos_comprobantes> getData() {
		return data;
	}


	public void setData(ArrayList<Tipos_comprobantes> data) {
		this.data = data;
	}


	

	
	
	

}
