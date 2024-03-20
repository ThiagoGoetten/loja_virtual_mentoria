package thiago.loja.virtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import thiago.loja.virtual.model.acesso;
import thiago.loja.virtual.service.AcessoService;

@Controller
public class AcessoController {
	
	@Autowired
	private AcessoService acessoService;
	@PostMapping("/salvarAcesso")
	public acesso salvarAcesso(acesso acesso) {
		
		return acessoService.save(acesso);
	}

}
