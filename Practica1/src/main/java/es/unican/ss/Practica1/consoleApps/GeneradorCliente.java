package es.unican.ss.Practica1.consoleApps;

import es.unican.ss.Practica1.domain.*;

import java.time.LocalDate;

public class GeneradorCliente {

    public static Cliente GenerarCliente() {
        Cliente cliente = new Cliente("123456789A", "Miguel Monje", "miguelmonje@gmail.com");
        Vehiculo v1 = new Vehiculo("ABC1234",95,false);
        Vehiculo v2 = new Vehiculo("XSD4234",105,true);
        Seguro s1 = new Terceros("AAA-135153", LocalDate.now(),v1);
        Seguro s2 = new TodoRiesgo("XSD-423401",LocalDate.now(),v2);
        cliente.anadeSeguro(s1);
        cliente.anadeSeguro(s2);
        cliente.getPartes().add(new Parte(s1,90.0,LocalDate.now(),100));
        return cliente;
    }
}
