package es.unican.ss.franquiciasUCCommon.domain;

public class Direccion {
	
	private String calle;
	private String localidad;
	private String codigoPostal;
	
	public Direccion() {}
	
	public Direccion(String calle, String localidad, String codigoPostal) {
		this.calle = calle;
		this.localidad = localidad;
		this.codigoPostal = codigoPostal;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCodigoPostal() {
		return codigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}
	
	

}
