package es.unican.ss.Practica3.estimacionesTUS;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType
public class RespuestaProximosAutobuses
{
    private int primeroMinutos;
    private int segundoMinutos;
    private String primeroTexto;
    private String segundoTexto;

    public int getPrimeroMinutos() {
        return primeroMinutos;
    }

    public void setPrimeroMinutos(int primeroMinutos) {
        this.primeroMinutos = primeroMinutos;
    }

    public int getSegundoMinutos() {
        return segundoMinutos;
    }

    public void setSegundoMinutos(int segundoMinutos) {
        this.segundoMinutos = segundoMinutos;
    }

    public String getPrimeroTexto() {
        return primeroTexto;
    }

    public void setPrimeroTexto(String primeroTexto) {
        this.primeroTexto = primeroTexto;
    }

    public String getSegundoTexto() {
        return segundoTexto;
    }

    public void setSegundoTexto(String segundoTexto) {
        this.segundoTexto = segundoTexto;
    }
}
