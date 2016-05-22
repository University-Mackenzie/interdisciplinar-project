package br.mackenzie.pi.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.mackenzie.pi.dao.TransacaoDAO;
import br.mackenzie.pi.model.Transacao;
import br.mackenzie.pi.service.TransacaoService;

@Service
@Transactional
public class TransacaoServiceImpl implements TransacaoService{

	@Autowired
	private TransacaoDAO transacaoDAO;
	
	@Override
	public List<Transacao> listarTransacoes() {
		return transacaoDAO.listar();
	}

	@Override
	public void CadastrarTransacao(Transacao transacao) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerTransacao(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void alterarTransacao(Transacao transacao) {
		// TODO Auto-generated method stub
		
	}

}
