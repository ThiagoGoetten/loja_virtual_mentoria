package thiago.loja.virtual.enums;

public enum StatusContaReceber {

	COBRANCA ("Pagar"),
	VENCIDA ("Vencida"),
	ABERTA ("Em Aberto"), 
	QUITADA("Pago");
	
	private String descricao;
	private StatusContaReceber (String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	@Override
	public String toString() {
		
		return this.getDescricao();
	}
	
}
