package es.unican.ss.Practica1.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings({ "serial" })
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TodoRiesgo")
public class TodoRiesgo extends Seguro implements Serializable{
	
	private static final int PRECIO_BASE_TODO_RIESGO = 600;
	
	
	public TodoRiesgo() {
		super(PRECIO_BASE_TODO_RIESGO);
	}
	
	public TodoRiesgo(String id, LocalDate fechaInicio, Vehiculo vehiculo) {
		super(id, fechaInicio, vehiculo, PRECIO_BASE_TODO_RIESGO);
	}
	
	@Override
	public double calculaPrecio() {
		double precio= getPrecioBase()+getVehiculo().getCv()*Seguro.MULTIPLICADOR_POTENCIA;
		if(getVehiculo().esProfesional()){
			precio+=Seguro.AUMENTO_PROFESIONAL;
		}
		return precio;
	}
}
