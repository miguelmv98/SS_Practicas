package es.unican.ss.Practica3.estimacionesTUS.bussinesAyto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ParadasResponse {

    @JsonProperty("resources")
    private List<Parada> paradas;

    public List<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(List<Parada> paradas) {
        this.paradas = paradas;
    }



    public int findParadaId(String parada) {
        for (Parada p: paradas) {
            if(p.getNombre().equalsIgnoreCase(parada)){
                return p.getId();
            }
        }
        return 0;
    }
}
