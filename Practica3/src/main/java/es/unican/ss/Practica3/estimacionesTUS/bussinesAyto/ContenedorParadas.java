package es.unican.ss.Practica3.estimacionesTUS.bussinesAyto;

import java.util.ArrayList;
import java.util.List;

public class ContenedorParadas {
    public List<Parada> getParadas() {
        return paradas;
    }

    public void setParadas(List<Parada> paradas) {
        this.paradas = paradas;
    }

    private List<Parada> paradas;

    public int findParadaId(String parada) {
        for (Parada p: paradas) {
            if(p.getNombre().equalsIgnoreCase(parada)){
                return p.getId();
            }
        }
        return 0;
    }
}
