package es.unican.ss.Practica3.estimacionesTUS.bussines;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name="ProximosAutobuses")
public class ProximosAutobuses
{
    @XmlElement(required=true)
    private int primeroMinutos;
    @XmlElement(required=true)
    private int segundoMinutos;
    @XmlElement(required=true)
    private String primeroTexto;
    @XmlElement(required=true)
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
        this.primeroTexto = primeroTexto.strip() + " minutes";
    }

    public String getSegundoTexto() {
        return segundoTexto;
    }

    public void setSegundoTexto(String segundoTexto) {

        this.segundoTexto = segundoTexto.strip() + " minutes";
    }
}
