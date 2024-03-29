package thiago.loja.virtual.enums;

public enum StatusContaPagar {

	COBRANCA ("Pagar"),
	VENCIDA ("Vencida"),
	ABERTA ("Em Aberto"), 
	RENEGOCIADA ("Renegociada"),
	ALUGUEL("Aluguel"),
	SALARIOSFUNC("Salarios Funcionarios"), 
	DESPESASFIXAS("Despesas Fixas"),
	QUITADA("Pago");
	
	private String descricao;
	private StatusContaPagar (String descricao) {
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
