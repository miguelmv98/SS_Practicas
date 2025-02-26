package es.unican.ss.Practica3.estimacionesTUS;

import jakarta.jws.WebService;

@WebService(endpointInterface = "es.unican.ss.Practica3.estimacionesTUS.IEstimacionesTUS",
targetNamespace = "http://www.unican.es/ss/SSEstimacionesTUS")
public class EstimacionesTUS implements IEstimacionesTUS {
    @Override
    public ProximosAutobuses proximosAutobuses(String parada, String linea) throws ParadaNoValidaException, DatosNoDisponiblesException {

        ProximosAutobuses output;

        int idParada = Utils.getParadaId(parada);
        if(idParada == 0){
            throw new ParadaNoValidaException("No se puede encontrar la parada indicada");
        }else{
            output = Utils.getProximosAutobuses(idParada,linea);
            if(output == null){
                throw new DatosNoDisponiblesException("Acutalmente no existen datos para dicha parada y linea");
            }
        }
        return output;
    }
}
