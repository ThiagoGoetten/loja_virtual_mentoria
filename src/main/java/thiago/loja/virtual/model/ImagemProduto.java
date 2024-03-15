package thiago.loja.virtual.model;

import java.io.Serializable;
import java.util.Objects;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Column;
import jakarta.persistence.ConstraintMode;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "imagem_produto")
@SequenceGenerator(name = "seq_img_produto", sequenceName = "seq_img_produto", allocationSize = 1, initialValue = 1)
public class ImagemProduto implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_img_produto")
	private Long id;
	
	@Column(columnDefinition = "text", length = 2000, nullable = false)
	private String imgProduto;
	@Column(columnDefinition = "text", length = 2000, nullable = false)
	private String miniImgProduto;
	
	@ManyToOne
	@JoinColumn(name = "produto_id", nullable = false, foreignKey =
	@ForeignKey(value = ConstraintMode.CONSTRAINT, name = "produto_fk"))
	private Produto produto;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getImgProduto() {
		return imgProduto;
	}
	public void setImgProduto(String imgProduto) {
		this.imgProduto = imgProduto;
	}
	public String getMiniImgProduto() {
		return miniImgProduto;
	}
	public void setMiniImgProduto(String miniImgProduto) {
		this.miniImgProduto = miniImgProduto;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
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
		ImagemProduto other = (ImagemProduto) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
