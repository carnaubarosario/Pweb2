package io.github.andersonfernandes.pwebsamples.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "vendas")
public class Venda {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long produto_id;
	private Integer quantidade_vendida;
	private Date data;
	private Float total;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public Long getProduto_id() {
		return produto_id;
	}
	
	public void setProduto_id(Long produto_id) {
		this.produto_id = produto_id;
	}
	
	public Integer getQuantidade_vendida() {
		return quantidade_vendida;
	}
	
	public void setQuantidade_vendida(Integer quantidade_vendida) {
		this.quantidade_vendida = quantidade_vendida;
	}
	
	public Date getData() {
		return data;
	}
	
	public void setData(Date data) {
		this.data = data;
	}
	
	public Float getTotal() {
		return total;
	}
	
	public void setTotal(Float total) {
		this.total = total;
	}
	
}
