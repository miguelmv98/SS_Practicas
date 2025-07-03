package es.unican.ss.Practica3.estimacionesTUS;

import es.unican.ss.Practica3.estimacionesTUS.bussines.ProximosAutobuses;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class EstimacionesTUSTest {

    private EstimacionesTUS sut;

    @BeforeEach
    public void init(){
        sut = new EstimacionesTUS();
    }

    //@Test
    public void proximosAutobusesSuccessTest()
    {
        String response = sut.proximosAutobuses("Interfacultativo", "7c2");

        assertNotNull(response);
        }

    @Test
    public void proximosAutobusesIncorrectDataParadaTest(){

        ParadaNoValidaException thrown = assertThrows(ParadaNoValidaException.class,() -> sut.proximosAutobuses("Facultadfilosofia", "7c2"));
        assertEquals(thrown.getMessage(), "Parada no valida");
    }
    @Test
    public void proximosAutobusesIncorrectDataLineaTest(){

        ParadaNoValidaException thrown = assertThrows(ParadaNoValidaException.class,() -> sut.proximosAutobuses("interfacultativo", "7c3"));
        assertEquals(thrown.getMessage(), "Linea no valida");
    }
//    @Test
//    public void proximosAutobusesDataNotAvailableTest(){
//        DatosNoDisponiblesException thrown = assertThrows(DatosNoDisponiblesException.class, () -> sut.proximosAutobuses(null,null));
//        assertEquals(thrown.getMessage(), "Actualmente no se encuentran disponibles los datos solicitados");
//    }

}
