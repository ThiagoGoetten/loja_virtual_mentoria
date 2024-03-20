package thiago.loja.virtual.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import thiago.loja.virtual.model.acesso;
import thiago.loja.virtual.repository.AcessoRepository;

@Service
public class AcessoService {
	
	@Autowired
	private AcessoRepository acessoRepository;
	
	public acesso save(acesso acesso) {
		//Aqui podemos fazer qualquer tipo de validacao
		return acessoRepository.save(acesso);
		
	}
	
	

}
