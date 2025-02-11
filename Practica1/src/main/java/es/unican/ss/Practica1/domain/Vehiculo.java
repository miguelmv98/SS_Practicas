package es.unican.ss.Practica1.domain;

import java.io.Serializable;

@SuppressWarnings({ "serial" })
public class Vehiculo implements Serializable{
		
	private String matricula;
	private int cv;
	private boolean esProfesional;
	
	public Vehiculo(String mat, int cv, boolean esPro){
		this.matricula=mat;
		this.cv=cv;
		this.esProfesional=esPro;
	}
	
	public Vehiculo(){	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public boolean esProfesional() {
		return esProfesional;
	}

	public void setEsProfesional(boolean esProfesional) {
		this.esProfesional = esProfesional;
	}

	public String getMatricula() {
		return matricula;
	}
		
	public boolean isEsProfesional() {
		return esProfesional;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
}
