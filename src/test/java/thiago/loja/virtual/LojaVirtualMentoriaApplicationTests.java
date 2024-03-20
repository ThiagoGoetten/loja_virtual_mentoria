package thiago.loja.virtual;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import thiago.loja.virtual.controller.AcessoController;
import thiago.loja.virtual.model.acesso;
import thiago.loja.virtual.repository.AcessoRepository;
import thiago.loja.virtual.service.AcessoService;

@SpringBootTest(classes = LojaVirtualMentoriaApplication.class )
public class LojaVirtualMentoriaApplicationTests {
	
	@Autowired
	private AcessoController acessoController;
	
	@Test
	public void testeCadastraAcesso() {
		
		acesso acesso = new acesso();
		
		acesso.setDescricao("ROLE_ADMIN");
		
		acessoController.salvarAcesso(acesso);
		
	}
	
	
	
}
