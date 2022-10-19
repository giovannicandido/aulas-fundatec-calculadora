package br.gov.fundatec.lp2.calculadora.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import br.gov.fundatec.lp2.calculadora.model.TipoOperacao;

/**
 * Classe de testes para CalculadoraService. 
 *
 */
class CalculadoraServiceTest {
	
	private CalculadoraService calculadoraService;
	
	// Este método serve para incializar todos as dependências necessárias para a
	// relização dos cenários de testes da classe.
	// A anotação @BeforeEach provida pelo JUnit, faz com que este método seja
	// executado antes de cada teste declarado na classe.
	@BeforeEach
	public void init() {
		calculadoraService = new CalculadoraService();
	}

	@ParameterizedTest
	@CsvSource({
		"2,4,6", 
		"4,25,29"
	})
	@DisplayName("Deve calcular a soma de dois números")
	void deveSomarDoisNumeros(double primeiroNumero, double segundoNumero, double resultadoEsperado) {
		// when
		double resultado = calculadoraService.calcular(primeiroNumero, segundoNumero, TipoOperacao.SOMA);
		
		// then
		assertEquals(resultadoEsperado, resultado);
		
	}
	
	@Test
	@DisplayName("Deve lançar exceção quando ocorrer uma divisão por zero")
	void deveLancarExcecaoQuandoDivisaoPorZero() {
		// given
		double divisor = 10;
		double dividendo = 0;
		
		// when / then
		assertThrows(IllegalArgumentException.class, 
				() -> calculadoraService.calcular(divisor, dividendo, TipoOperacao.DIVISAO));
		
		
	}
	
}
