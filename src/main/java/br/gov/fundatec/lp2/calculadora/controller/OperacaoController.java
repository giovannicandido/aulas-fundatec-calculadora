package br.gov.fundatec.lp2.calculadora.controller;

import br.gov.fundatec.lp2.calculadora.model.Operacao;
import br.gov.fundatec.lp2.calculadora.model.TipoOperacao;
import br.gov.fundatec.lp2.calculadora.service.OperacaoService;

/**
 * Classe da camada de controle para manipular o modelo Operacao. Em uma API
 * Rest, esta classe representa a porta de entrada para a API, por onde chegam
 * as requisições para manipular o recurso Operacao.
 *
 */
public class OperacaoController {
	
private final OperacaoService operacaoService;
	
	// Construtor utilizado para injetar as dependências da classe. Esta classe
	// depende de uma instância de OperacaoService
	public OperacaoController() {
		this.operacaoService = new OperacaoService();
	}
	
	// Método que recebe dois termos e um tipo de operação e cria e retorna uma
	// Operacao já com resultado calculado
	public Operacao criar(double primeiroTermo, double segundoTermo, TipoOperacao tipoOperacao) {
		return operacaoService.criar(primeiroTermo, segundoTermo, tipoOperacao);
	}
	
	// Método main provisório. Deve ser substituído por testes unitários.
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
