package es.unican.ss.Practica3.estimacionesTUS.bussinesAyto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LineasParadaResponse {

    @JsonProperty("resources")
    private List<LineaParadaStatus> lineasParada;

    public LineaParadaStatus findLineaStatusByLinea(String linea) {
        for (LineaParadaStatus lp: lineasParada) {
            if(lp.getLinea().equalsIgnoreCase(linea)){
                return lp;
            }
        }
        return null;
    }

    public List<LineaParadaStatus> getLineasParada() {
        return lineasParada;
    }

    public void setLineasParada(List<LineaParadaStatus> lineasParada) {
        this.lineasParada = lineasParada;
    }
}
