package br.gov.fundatec.lp2.calculadora.model;

import static java.math.RoundingMode.HALF_UP;

import java.math.BigDecimal;

public class Divisao implements IOperacaoMatematica {
	
	private static final int CASAS_DECIMAIS = 2;

	@Override
	public double calcular(double primeiroTermo, double segundoTermo) {
		if (segundoTermo == 0) {
			throw new IllegalArgumentException("Não existe divisão por zero");
		}
		
		BigDecimal dividendo = BigDecimal.valueOf(primeiroTermo);
		BigDecimal divisor = BigDecimal.valueOf(segundoTermo);
		BigDecimal resultado = dividendo.divide(divisor, CASAS_DECIMAIS, HALF_UP);
		
		return resultado.doubleValue();
	}

}
