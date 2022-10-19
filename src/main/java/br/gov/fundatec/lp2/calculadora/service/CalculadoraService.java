package br.gov.fundatec.lp2.calculadora.service;

import br.gov.fundatec.lp2.calculadora.model.TipoOperacao;

/**
 * Classe da camada de negócio para realização de cálculos de operações
 * matemática.
 *
 */
public class CalculadoraService {

	// Método que recebe dois termos e calcula o resultado da operação matemática de
	// acordo com o tipo informado.
	public double calcular(double primeiroTermo, double segundoTermo, TipoOperacao tipoOperacao) {

		// Calcula a soma de dois termos
		if (TipoOperacao.SOMA == tipoOperacao) {
			return primeiroTermo + segundoTermo;
		}

		// Calcula a subtração de dois termos
		if (TipoOperacao.SUBTRACAO == tipoOperacao) {
			return primeiroTermo - segundoTermo;
		}

		// Calcula a multiplicação de dois termos
		if (TipoOperacao.MULTIPLICACAO == tipoOperacao) {
			return primeiroTermo * segundoTermo;
		}

		// Calcula a divisão de dois termos
		if (TipoOperacao.DIVISAO == tipoOperacao) {
			
			// Valida divisão por zero
			if (segundoTermo == 0) {
				throw new IllegalArgumentException("Não existe divisão por zero");
			}
			return primeiroTermo / segundoTermo;
		}

		// Trata operação não suportada pela calculadora
		throw new UnsupportedOperationException("Calculadora não suporta tipo operação: " + tipoOperacao);
	}

}
