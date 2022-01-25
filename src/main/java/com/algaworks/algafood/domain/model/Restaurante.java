package com.algaworks.algafood.domain.model;

import java.math.BigDecimal;
import java.util.Objects;

import javax.persistence.*;

@Entity
@Table(name = "tab_restaurante")
public class Restaurante {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private BigDecimal taxaFrete;

	public Long getId() {
		return id;
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

	public BigDecimal getTaxaFrete() {
		return taxaFrete;
	}

	public void setTaxaFrete(BigDecimal taxaFrete) {
		this.taxaFrete = taxaFrete;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Restaurante that = (Restaurante) o;
		return id.equals(that.id) && Objects.equals(nome, that.nome) && Objects.equals(taxaFrete, that.taxaFrete);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, taxaFrete);
	}
}
