package com.generation.farmacia.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
 // categoria é o lado 1, manda no lado M
	
	@Entity
	@Table (name = "tb_categoria")
	public class Categoria {

		@Id
		@GeneratedValue (strategy =  GenerationType.IDENTITY)
		private long id;
		
		@NotBlank (message = "nome é Obrigatório!")
		private String nome;
		
		private String descricao;
		
		// cascade= cascata (tudo o que eu alterar em categoria irá para produtos) cascadeType
		@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL) // 
		@JsonIgnoreProperties ("categoria")
		private List <Produto>produto;

		public long getId() {
			return id;
		}

		public void setId(long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public List<Produto> getProduto() {
			return produto;
		}

		public void setProduto(List<Produto> produto) {
			this.produto = produto;
		}
		
}
