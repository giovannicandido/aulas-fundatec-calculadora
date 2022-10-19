package br.gov.fundatec.lp2.calculadora.service;

import br.gov.fundatec.lp2.calculadora.model.Operacao;
import br.gov.fundatec.lp2.calculadora.model.TipoOperacao;

/**
 * Classe da camada de negócio para manipulação do modelo Operacao.
 *
 */
public class OperacaoService {

	private final CalculadoraService calculadoraService;

	// Construtor utilizado para injetar as dependências da classe. Esta classe
	// depende de uma instância de CalculadoraService
	public OperacaoService() {
		this.calculadoraService = new CalculadoraService();
	}

	// Método que recebe dois termos e um tipo de operação e cria e retorna uma
	// Operacao já com resultado calculado. O cálculo do resultado da operação é
	// delegado para CalculadoraService.
	public Operacao criar(double primeiroTermo, double segundoTermo, TipoOperacao tipoOperacao) {

		double resultado = calculadoraService.calcular(primeiroTermo, segundoTermo, tipoOperacao);

		return new Operacao(primeiroTermo, segundoTermo, tipoOperacao, resultado);
	}

}
