package es.unican.ss.Practica3.estimacionesTUS;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EstimacionesTUSTest {

    private EstimacionesTUS sut;

    @BeforeEach
    public void init(){
        sut = new EstimacionesTUS();
    }

    @Test
    public void test1(){
        ProximosAutobuses response = sut.proximosAutobuses("interfacultativo", "7c2");
    }

}
