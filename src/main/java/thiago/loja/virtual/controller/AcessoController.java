package thiago.loja.virtual.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import thiago.loja.virtual.model.acesso;
import thiago.loja.virtual.service.AcessoService;

@RestController
@Controller
public class AcessoController {
	
	@Autowired
	private AcessoService acessoService;
	@ResponseBody /*Pode dar um retorno da API*/
	@PostMapping(value = "*/salvarAcesso")/*Mapeia a URL para receber um JSON*/
	
	public ResponseEntity<acesso> salvarAcesso(@RequestBody acesso acesso) {/*Recebe JSON e transforma em Objeto*/
		
		acesso acessoSalvo = acessoService.save(acesso);
				
		
		return new ResponseEntity<acesso>(acessoSalvo, HttpStatus.OK);
	}

}



