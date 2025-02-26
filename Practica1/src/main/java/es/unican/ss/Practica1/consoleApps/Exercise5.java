package es.unican.ss.Practica1.consoleApps;

import com.fasterxml.jackson.databind.ObjectMapper;
import es.unican.ss.Practica1.domain.Aseguradora;
import es.unican.ss.Practica1.domain.Cliente;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.IOException;

public class Exercise5 {
    public static void main(String[] args) {
        JAXBContext jaxbctx;
        try{
            jaxbctx = JAXBContext.newInstance(Aseguradora.class);

            Unmarshaller unmarshaller = jaxbctx.createUnmarshaller();
            Aseguradora aseguradora =(Aseguradora) unmarshaller.unmarshal(new File("src/main/resources/Aseguradora.xml"));

            for (Cliente c:aseguradora.getClientes() ) {
                System.out.println("Cliente: " + c.getDni()+ " | " + c.getNombre());
                System.out.println("Precio seguiros: "+c.totalSeguros());
                System.out.println("-----------------------------------------");
            }

            Cliente c = GeneradorCliente.GenerarCliente();

            aseguradora.getClientes().add(c);

            Marshaller marshaller = jaxbctx.createMarshaller();
            marshaller.marshal(aseguradora, new File("src/main/resources/newAseguradora.xml"));

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
