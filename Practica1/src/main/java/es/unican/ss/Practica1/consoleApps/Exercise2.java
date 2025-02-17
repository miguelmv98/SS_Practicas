package es.unican.ss.Practica1.consoleApps;

import com.fasterxml.jackson.databind.ObjectMapper;
import es.unican.ss.Practica1.domain.Aseguradora;
import es.unican.ss.Practica1.domain.Cliente;

import java.io.File;
import java.io.IOException;

public class Exercise2 {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        Aseguradora aseguradora;
        try {
            aseguradora = mapper.readValue(new File("src/main/resources/segurosUC.json"), Aseguradora.class);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        for (Cliente c:aseguradora.getClientes() ) {
            System.out.println("Cliente: " + c.getDni()+ " | " + c.getNombre());
            System.out.println("Precio seguiros: "+c.totalSeguros());
            System.out.println("-----------------------------------------");
        }

        aseguradora.getClientes().add(GeneradorCliente.GenerarCliente());

        try {
            mapper.writeValue(new File("src/main/resources/newSegurosUC.json"),aseguradora);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
