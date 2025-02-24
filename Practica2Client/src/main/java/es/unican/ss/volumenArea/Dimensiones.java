
package es.unican.ss.volumenArea;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para Dimensiones complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Dimensiones"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="alto" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="ancho" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="largo" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dimensiones", propOrder = {
    "alto",
    "ancho",
    "largo"
})
public class Dimensiones {

    protected double alto;
    protected double ancho;
    protected double largo;

    /**
     * Obtiene el valor de la propiedad alto.
     * 
     */
    public double getAlto() {
        return alto;
    }

    /**
     * Define el valor de la propiedad alto.
     * 
     */
    public void setAlto(double value) {
        this.alto = value;
    }

    /**
     * Obtiene el valor de la propiedad ancho.
     * 
     */
    public double getAncho() {
        return ancho;
    }

    /**
     * Define el valor de la propiedad ancho.
     * 
     */
    public void setAncho(double value) {
        this.ancho = value;
    }

    /**
     * Obtiene el valor de la propiedad largo.
     * 
     */
    public double getLargo() {
        return largo;
    }

    /**
     * Define el valor de la propiedad largo.
     * 
     */
    public void setLargo(double value) {
        this.largo = value;
    }

}
