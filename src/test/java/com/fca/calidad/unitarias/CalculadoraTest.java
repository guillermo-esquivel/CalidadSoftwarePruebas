package com.fca.calidad.unitarias;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.data.Offset.offset;

import org.junit.jupiter.api.Test;

import com.fca.unitarias.Calculadora;

public class CalculadoraTest {

    @Test
    public void sumaDebeRetornarLaSumaDeDosNumeros() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.suma(3.5, 2.5);

        assertThat(resultado).isCloseTo(6.0, offset(0.0001));
    }

    @Test
    public void restaDebeRetornarLaDiferenciaDeDosNumeros() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.resta(7.5, 2.5);

        assertThat(resultado).isCloseTo(5.0, offset(0.0001));
    }

    @Test
    public void multiplicaDebeRetornarElProductoDeDosNumeros() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.multiplica(2.5, 4.0);

        assertThat(resultado).isCloseTo(10.0, offset(0.0001));
    }

    @Test
    public void divideDebeRetornarElCocienteDeDosNumeros() {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divide(10.0, 2.0);

        assertThat(resultado).isCloseTo(5.0, offset(0.0001));
    }
}
