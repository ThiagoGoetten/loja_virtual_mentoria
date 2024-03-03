package thiago.loja.virtual.enums;

import org.hibernate.bytecode.internal.bytebuddy.PrivateAccessorException;

public enum TipoEndereco {
	
	COBRANCA("Cobranca"),
	ENTREGA("Entrega");

	private String descricao;
	
	private TipoEndereco(String descricao) {
		this.descricao = descricao;
		
	}

	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		return this.descricao;
	}
	
}
