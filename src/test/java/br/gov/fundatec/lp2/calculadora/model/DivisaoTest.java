package br.gov.fundatec.lp2.calculadora.model;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class DivisaoTest {

	private Divisao divisao;

	@BeforeEach
	void setup() {
		divisao = new Divisao();
	}
	
	@ParameterizedTest
	@CsvSource({"4,2,2", "5,2,2.5"})
	void deveCalcularDivisao(double dividendo, double divisor, double resultadoEsperado) {
		double resultado = divisao.calcular(dividendo, divisor);
		assertEquals(resultadoEsperado, resultado);
	}

	@Test
	void deveLancarExcecaoQuandoDivisaoPorZero() {
		int dividendo = 1;
		int divisor = 0;

		assertThrows(IllegalArgumentException.class, 
				() -> divisao.calcular(dividendo, divisor));
	}

}
