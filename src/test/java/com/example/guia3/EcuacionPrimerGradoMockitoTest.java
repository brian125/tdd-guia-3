package com.example.guia3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
public class EcuacionPrimerGradoMockitoTest {

    @InjectMocks
    private EcuacionPrimerGrado ecuacionPrimerGrado;

    @Mock
    private Parseador parseador;

    @BeforeEach
    public void inicializaMocks() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void solucionaEcuacionConMenos() {
        String ecuacion = "2x - 1 = 0";

        Mockito.when(parseador.obtenerParte1(ecuacion)).thenReturn(2);
        Mockito.when(parseador.obtenerParte2(ecuacion)).thenReturn(-1);
        Mockito.when(parseador.obtenerParte3(ecuacion)).thenReturn(0);

        Double result = ecuacionPrimerGrado.obtenerResultado(ecuacion);

        Double valueExpected = 0.5;

        Assertions.assertEquals(valueExpected, result);
    }

    @Test
    public void solucionaEcuacionConMas() {

        String ecuacion = "2x + 1 = 0";

        Mockito.when(parseador.obtenerParte1(ecuacion)).thenReturn(2);
        Mockito.when(parseador.obtenerParte2(ecuacion)).thenReturn(1);
        Mockito.when(parseador.obtenerParte3(ecuacion)).thenReturn(0);

        Double result = ecuacionPrimerGrado.obtenerResultado(ecuacion);

        Double valueExpected = -0.5;

        Assertions.assertEquals(valueExpected, result);
    }
}

