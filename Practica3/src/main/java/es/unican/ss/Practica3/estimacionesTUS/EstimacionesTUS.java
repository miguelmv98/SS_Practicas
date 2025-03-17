package es.unican.ss.Practica3.estimacionesTUS;

import es.unican.ss.Practica3.estimacionesTUS.bussines.ProximosAutobuses;
import jakarta.jws.WebService;

@WebService(endpointInterface = "es.unican.ss.Practica3.estimacionesTUS.IEstimacionesTUS",
targetNamespace = "http://www.unican.es/ss/SSEstimacionesTUS")
public class EstimacionesTUS implements IEstimacionesTUS {
    @Override
    public ProximosAutobuses proximosAutobuses(String parada, String linea) throws ParadaNoValidaException, DatosNoDisponiblesException {

        ProximosAutobuses output;

        int idParada = Utils.getParadaId(parada);
        output = Utils.getProximosAutobuses(idParada,linea);
        return output;
    }
}
