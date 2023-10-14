package com.example.guia3;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class EcuacionPrimerGradoIntegrationTest {

    EcuacionPrimerGrado ecuacion = new EcuacionPrimerGrado();

    @Test
    public void solucionaEcuacionConMenos() {

        Double result = ecuacion.obtenerResultado("2x - 1 = 0");

        Double valueExpected = 0.5;

        Assertions.assertEquals(valueExpected, result);
    }

    @Test
    public void solucionaEcuacionConMas() {

        Double result = ecuacion.obtenerResultado("2x + 1 = 0");

        Double valueExpected = -0.5;

        Assertions.assertEquals(valueExpected, result);
    }

    @Test
    public void solucionaEcuacionConParte3Mayor0() {

        Double result = ecuacion.obtenerResultado("2x + 1 = 10");

        Double valueExpected = 4.5;

        Assertions.assertEquals(valueExpected, result);
    }


}
