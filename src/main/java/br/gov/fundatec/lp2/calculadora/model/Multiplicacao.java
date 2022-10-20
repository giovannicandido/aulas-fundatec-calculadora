package br.gov.fundatec.lp2.calculadora.model;

public class Multiplicacao implements IOperacaoMatematica {

	@Override
	public double calcular(double primeiroTermo, double segundoTermo) {
		return primeiroTermo * segundoTermo;
	}

}
