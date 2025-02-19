package es.unican.ss.volumenArea;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService(targetNamespace = "http://www.unican.es/ss/VolumenArea/")
public class VolumenArea {

    @WebMethod
    public double area(Dimensiones dimensiones) throws DatosNoValidosException {
        return 0.0;
    }
    @WebMethod
    public double volumen(Dimensiones dimensiones) throws DatosNoValidosException{
        return 0.0;
    }
}
