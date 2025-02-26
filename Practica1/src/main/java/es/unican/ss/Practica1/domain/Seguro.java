package es.unican.ss.Practica1.domain;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import es.unican.ss.Practica1.jsonUtils.CustomLocalDateDeserializer;
import es.unican.ss.Practica1.jsonUtils.CustomLocalDateSerializer;
import es.unican.ss.Practica1.xmlUtils.LocalDateAdapterXML;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.io.Serializable;
import java.time.LocalDate;

@SuppressWarnings({ "serial" })
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include= JsonTypeInfo.As.PROPERTY, property= "type")
@JsonSubTypes({
		@JsonSubTypes.Type(value= Terceros.class, name= "terceros"),
		@JsonSubTypes.Type(value= TodoRiesgo.class, name= "todoRiesgo"),
		@JsonSubTypes.Type(value= TRFranquicia.class, name= "franquicia")})
@JsonIdentityInfo( generator= ObjectIdGenerators.PropertyGenerator.class, property= "id")
// XML annotations
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="Seguro")
@XmlSeeAlso({Terceros.class, TodoRiesgo.class, TRFranquicia.class})
public abstract class Seguro implements Serializable {
	
	public static final double AUMENTO_PROFESIONAL = 100.0;
	public static final double MULTIPLICADOR_POTENCIA = 1.5;
	@XmlAttribute( required = true)
	@XmlID
	private String id;
	@JsonSerialize(using= CustomLocalDateSerializer.class)
	@JsonDeserialize(using= CustomLocalDateDeserializer.class)
	@JsonProperty("fecha")
	@XmlAttribute(name ="fecha", required = true)
	@XmlJavaTypeAdapter(value = LocalDateAdapterXML.class)
	private LocalDate fechaInicio;
	@XmlElement()
	private Vehiculo vehiculo;
	@JsonIgnore
	private double precioBase;
	
	public Seguro(){
	}
	
	public Seguro(String id, LocalDate fechaInicio, Vehiculo vehiculo, double precioBase) {
		this.id = id;
		this.fechaInicio = fechaInicio;
		this.vehiculo = vehiculo;
		this.precioBase = precioBase;
	}

	public Seguro (double precioBase) {
		this.precioBase = precioBase;
	}
	
	public String getId() {
		return id;
	}

	public LocalDate getFechaInicio() {
		return fechaInicio;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public double getPrecioBase() {
		return precioBase;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public void setFechaInicio(LocalDate fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}

	public abstract double calculaPrecio();
	
}
