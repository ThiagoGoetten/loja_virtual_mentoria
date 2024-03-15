package thiago.loja.virtual.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "produto")
@SequenceGenerator(name = "seq_produto", sequenceName = "seq_produto", allocationSize = 1, initialValue = 1)
public class Produto implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_produto")
	private Long id;
	
	@Column(nullable = false)
	private String nome;
	
	@Column(nullable = false)
	private String tipoUnidade;
	
	@Column(columnDefinition = "text", length = 2000, nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private Boolean ativo = Boolean.TRUE;
//Colocar nota item produto associar
	@Column(nullable = false)
	private Double peso;
	@Column(nullable = false)
	private Double largura;
	@Column(nullable = false)
	private Double altura;
	@Column(nullable = false)
	private Double profundidade;
	@Column(nullable = false)
	private BigDecimal valorVenda = BigDecimal.ZERO;
	@Column(nullable = false)
	private Integer qtdEstoque = 0;
	private Integer qtdAlertEstoque = 0;
	private String linkvideoProduto;
	private Boolean alertQtdEstoque = Boolean.FALSE;
	private Integer qtdClic = 0;
	public Long getId() {
		return id;
	}
	
	public void setAtivo(Boolean ativo) {
		this.ativo = ativo;
	}
	
	public Boolean getAtivo() {
		return ativo;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipoUnidade() {
		return tipoUnidade;
	}
	public void setTipoUnidade(String tipoUnidade) {
		this.tipoUnidade = tipoUnidade;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Double getLargura() {
		return largura;
	}
	public void setLargura(Double largura) {
		this.largura = largura;
	}
	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	public Double getProfundidade() {
		return profundidade;
	}
	public void setProfundidade(Double profundidade) {
		this.profundidade = profundidade;
	}
	public BigDecimal getValorVenda() {
		return valorVenda;
	}
	public void setValorVenda(BigDecimal valorVenda) {
		this.valorVenda = valorVenda;
	}
	public Integer getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(Integer qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
	public Integer getQtdAlertEstoque() {
		return qtdAlertEstoque;
	}
	public void setQtdAlertEstoque(Integer qtdAlertEstoque) {
		this.qtdAlertEstoque = qtdAlertEstoque;
	}
	public String getLinkvideoProduto() {
		return linkvideoProduto;
	}
	public void setLinkvideoProduto(String linkvideoProduto) {
		this.linkvideoProduto = linkvideoProduto;
	}
	public Boolean getAlertQtdEstoque() {
		return alertQtdEstoque;
	}
	public void setAlertQtdEstoque(Boolean alertQtdEstoque) {
		this.alertQtdEstoque = alertQtdEstoque;
	}
	public Integer getQtdClic() {
		return qtdClic;
	}
	public void setQtdClic(Integer qtdClic) {
		this.qtdClic = qtdClic;
	}
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
}
