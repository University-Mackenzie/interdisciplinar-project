package br.mackenzie.pi.service;

import java.util.List;

import org.springframework.stereotype.Component;

import br.mackenzie.pi.model.Transacao;

public interface TransacaoService {

	/**
	 * Retorna lista de transacoes
	 * @return
	 */
	List<Transacao> listarTransacoes();
	
	/**
	 * Cadastrar nova transacao
	 * @param transacao
	 */
	void CadastrarTransacao(Transacao transacao);
	
	/**
	 * remover transacao por id
	 * @param id
	 */
	void removerTransacao(int id);
	
	/**
	 * alterar transacao
	 * @param transacao
	 */
	void alterarTransacao(Transacao transacao);
	
}
