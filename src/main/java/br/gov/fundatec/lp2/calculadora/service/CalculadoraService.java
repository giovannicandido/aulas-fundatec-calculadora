package br.gov.fundatec.lp2.calculadora.service;

import br.gov.fundatec.lp2.calculadora.model.TipoOperacao;

public class CalculadoraService {

	public double calcular(double primeiroTermo, double segundoTermo, TipoOperacao tipoOperacao) {
		
		return tipoOperacao.getOperacaoMatematica().calcular(primeiroTermo, segundoTermo);
	}

}
