package br.gov.fundatec.lp2.calculadora.model;

public enum TipoOperacao {

	SOMA(new Soma()),
	SUBTRACAO(new Subtracao()), 
	MULTIPLICACAO(new Multiplicacao()), 
	DIVISAO(new Divisao());
	
	private final IOperacaoMatematica operacaoMatematica;
	
	private TipoOperacao(IOperacaoMatematica operacaoMatematica) {
		this.operacaoMatematica = operacaoMatematica;
	}
	
	public IOperacaoMatematica getOperacaoMatematica() {
		return operacaoMatematica;
	}
	
}
