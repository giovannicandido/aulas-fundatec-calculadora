package br.gov.fundatec.lp2.calculadora.service;

import br.gov.fundatec.lp2.calculadora.model.Operacao;
import br.gov.fundatec.lp2.calculadora.model.TipoOperacao;

public class OperacaoService {
	
	private final CalculadoraService calculadoraService;
	
	public OperacaoService() {
		this.calculadoraService = new CalculadoraService();
	}

	public Operacao criar(double primeiroTermo, double segundoTermo, TipoOperacao tipoOperacao) {
		
		double resultado = calculadoraService.calcular(primeiroTermo, segundoTermo, tipoOperacao);
		
		return new Operacao(primeiroTermo, 
				segundoTermo, 
				tipoOperacao, 
				resultado);
	}

}
