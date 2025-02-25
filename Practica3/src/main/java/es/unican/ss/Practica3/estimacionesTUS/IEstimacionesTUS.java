package es.unican.ss.Practica3.estimacionesTUS;

import jakarta.jws.WebService;

@WebService(targetNamespace = "http://www.unican.es/ss/SSEstimacionesTUS")
public interface IEstimacionesTUS {
     RespuestaProximosAutobuses proximosAutobuses(String parada, String linea) throws ParadaNoValidaException, DatosNoDisponiblesException;
}
