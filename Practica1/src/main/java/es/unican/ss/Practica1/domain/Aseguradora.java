package es.unican.ss.Practica1.domain;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
@SuppressWarnings({ "serial" })
@XmlType(name = "aseguradora")
@XmlRootElement(name = "aseguradora")
public class Aseguradora implements Serializable{
	@XmlElement(name = "cliente")
	private List<Cliente> clientes=new LinkedList<Cliente>();
	
	public Aseguradora(){}
	
	public List<Cliente> getClientes(){
		return clientes;
	}


}