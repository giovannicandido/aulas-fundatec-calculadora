package br.gov.fundatec.lp2.calculadora.model;

public class Operacao {

	private double primeiroTermo;
	private double segundoTermo;
	private TipoOperacao tipoOperacao;
	private double resultado;
	
	public Operacao(double primeiroTermo, 
			double segundoTermo, 
			TipoOperacao tipoOperacao, 
			double resultado) {
		this.primeiroTermo = primeiroTermo;
		this.segundoTermo = segundoTermo;
		this.tipoOperacao = tipoOperacao;
		this.resultado = resultado;
	}
	
	public double getPrimeiroTermo() {
		return primeiroTermo;
	}
	
	public double getSegundoTermo() {
		return segundoTermo;
	}
	
	public TipoOperacao getTipoOperacao() {
		return tipoOperacao;
	}
	
	public double getResultado() {
		return resultado;
	}

	@Override
	public String toString() {
		return "Operacao [primeiroTermo=" + primeiroTermo + ", segundoTermo=" + segundoTermo + ", tipoOperacao="
				+ tipoOperacao + ", resultado=" + resultado + "]";
	}
	
	
	
}
