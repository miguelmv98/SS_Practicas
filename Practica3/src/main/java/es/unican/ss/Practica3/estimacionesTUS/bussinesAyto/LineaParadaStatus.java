package es.unican.ss.Practica3.estimacionesTUS.bussinesAyto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class LineaParadaStatus {
    @JsonProperty("ayto:paradaId")
    private int idParada;
    @JsonProperty("ayto:etiqLinea")
    private String linea;
    @JsonProperty("ayto:tempo1")
    private int primeroSegundos;
    @JsonProperty("ayto:tiempo2")
    private int segundoSegundos;

    public int getIdParada() {
        return idParada;
    }

    public void setIdParada(int idParada) {
        this.idParada = idParada;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public int getPrimeroSegundos() {
        return primeroSegundos;
    }

    public void setPrimeroSegundos(int primeroSegundos) {
        this.primeroSegundos = primeroSegundos;
    }

    public int getSegundoSegundos() {
        return segundoSegundos;
    }

    public void setSegundoSegundos(int segundoSegundos) {
        this.segundoSegundos = segundoSegundos;
    }
}
