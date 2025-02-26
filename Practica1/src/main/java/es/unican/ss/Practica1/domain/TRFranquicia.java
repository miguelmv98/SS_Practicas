package es.unican.ss.Practica1.domain;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings({ "serial" })
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TRFranquicia")
public class TRFranquicia extends Seguro implements Serializable {
	
	private static final int PRECIO_BASE_TR_FRANQUICIA = 400;
	@XmlAttribute(required=true)
	private double franquicia;
	
	public TRFranquicia() {
		super(PRECIO_BASE_TR_FRANQUICIA);
	}
	
	public TRFranquicia(String id, LocalDate fechaInicio, Vehiculo vehiculo, double franquicia) {
		super(id, fechaInicio, vehiculo, PRECIO_BASE_TR_FRANQUICIA);
		this.franquicia= franquicia;
	}
	
	
	public double getFranquicia() {
		return franquicia;
	}

	public void setFranquicia(double franquicia) {
		this.franquicia = franquicia;
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
