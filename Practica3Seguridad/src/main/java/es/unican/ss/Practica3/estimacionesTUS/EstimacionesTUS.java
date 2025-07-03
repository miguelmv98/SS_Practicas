package es.unican.ss.Practica3.estimacionesTUS;

import es.unican.ss.Practica3.estimacionesTUS.bussines.ProximosAutobuses;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;

@WebService(endpointInterface = "es.unican.ss.Practica3.estimacionesTUS.IEstimacionesTUS",
targetNamespace = "http://www.unican.es/ss/SSEstimacionesTUS")
public class EstimacionesTUS implements IEstimacionesTUS {

    @Override
    public String proximosAutobuses(String parada, String linea) throws ParadaNoValidaException, DatosNoDisponiblesException {



        int idParada = Utils.getParadaId(parada);
        ProximosAutobuses proximos = Utils.getProximosAutobuses(idParada,linea);

        StringBuilder output = new StringBuilder();
        output.append("Primer Autobus: ");
        output.append(proximos.getPrimeroMinutos());
        output.append(" ");
        output.append(proximos.getPrimeroTexto());
        output.append("\n");
        output.append("Segundo Autobus: ");
        output.append(proximos.getSegundoMinutos());
        output.append(" ");
        output.append(proximos.getSegundoTexto());
        return output.toString();
    }
}
