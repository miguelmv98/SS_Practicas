package es.unican.ss.Practica1.domain;

import java.io.Serializable;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import es.unican.ss.Practica1.jsonUtils.CustomLocalDateDeserializer;
import es.unican.ss.Practica1.jsonUtils.CustomLocalDateSerializer;
import es.unican.ss.Practica1.xmlUtils.LocalDateAdapterXML;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

@SuppressWarnings({ "serial" })
@JsonPropertyOrder({"seguro","importe","fecha","id"})
@JsonIdentityInfo( generator= ObjectIdGenerators.PropertyGenerator.class, property= "id")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class Parte implements Serializable {
	@JsonProperty("id")
	@XmlAttribute(name = "id")
	private Integer idParte;
	@XmlIDREF
	@XmlElement(name = "seguroRef")
	private Seguro seguro;
	@XmlAttribute
	private double importe;
	@JsonSerialize(using= CustomLocalDateSerializer.class)
	@JsonDeserialize(using= CustomLocalDateDeserializer.class)
	@XmlAttribute
	@XmlJavaTypeAdapter(value = LocalDateAdapterXML.class)
	private LocalDate fecha;
	
	public Parte () {
	}

	public Parte(Seguro seguro, double importe, LocalDate fecha, Integer idParte) {
		super();
		this.seguro = seguro;
		this.importe = importe;
		this.fecha = fecha;
		this.idParte = idParte;
	}

	public double getImporte() {
		return importe;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public Integer getIdParte() {
		return idParte;
	}
	
	public Seguro getSeguro() {
		return seguro;
	}

	public void setSeguro(Seguro seguro) {
		this.seguro = seguro;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public void setIdParte(Integer idParte) {
		this.idParte = idParte;
	}

}
