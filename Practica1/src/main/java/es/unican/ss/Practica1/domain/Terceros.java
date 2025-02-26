package es.unican.ss.Practica1.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings({ "serial" })
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Terceros")
public class Terceros extends Seguro implements Serializable{
	
	private static final int PRECIO_BASE_TERCEROS = 200;
	
	public Terceros() {
		super(PRECIO_BASE_TERCEROS);
	}
	
	public Terceros(String id, LocalDate fechaInicio, Vehiculo vehiculo) {
		super(id, fechaInicio, vehiculo, PRECIO_BASE_TERCEROS);
	}

	@Override
	public double calculaPrecio() {
		return getPrecioBase()+getVehiculo().getCv()*Seguro.MULTIPLICADOR_POTENCIA;
	}
}