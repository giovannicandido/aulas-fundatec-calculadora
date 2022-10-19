package br.gov.fundatec.lp2.calculadora.controller;

import br.gov.fundatec.lp2.calculadora.model.Operacao;
import br.gov.fundatec.lp2.calculadora.model.TipoOperacao;
import br.gov.fundatec.lp2.calculadora.service.OperacaoService;

public class OperacaoController {
	
	private final OperacaoService operacaoService;
	
	public OperacaoController() {
		this.operacaoService = new OperacaoService();
	}
	
	public Operacao criar(double primeiroTermo, double segundoTermo, TipoOperacao tipoOperacao) {
		return operacaoService.criar(primeiroTermo, segundoTermo, tipoOperacao);
	}
	
	public static void main(String[] args) {
		OperacaoController controller = new OperacaoController();
		
		Operacao soma = controller.criar(2, 2, TipoOperacao.SOMA);
		System.out.println(soma);

		Operacao subtracao = controller.criar(2, 1, TipoOperacao.SUBTRACAO);
		System.out.println(subtracao);

		Operacao multiplicacao = controller.criar(2, 2, TipoOperacao.MULTIPLICACAO);
		System.out.println(multiplicacao);

		Operacao divisao = controller.criar(15, 3, TipoOperacao.DIVISAO);
		System.out.println(divisao);
	}

}
