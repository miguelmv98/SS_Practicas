package es.unican.ss.Practica3.estimacionesTUS;

import jakarta.jws.WebService;

@WebService(endpointInterface = "es.unican.ss.Practica3.estimacionesTUS.IEstimacionesTUS",
targetNamespace = "http://www.unican.es/ss/SSEstimacionesTUS")
public class EstimacionesTUS implements IEstimacionesTUS {
    @Override
    public RespuestaProximosAutobuses proximosAutobuses(String parada, String linea) throws ParadaNoValidaException, DatosNoDisponiblesException {

        int idParada = Utils.getParadaId(parada);
        if(idParada == 0){
            throw new ParadaNoValidaException("No se puede encontrar la parada indicada");
        }else{
            if(idParada == 1){
                throw new DatosNoDisponiblesException("Acutalmente no existen datos para dicha parada y linea");
            }
        }
        return null;
    }
}
