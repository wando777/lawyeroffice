package com.thiagosoares.futebol.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "jogadores")
public class Jogador implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	private String email;

	private String cpf;

	@OneToMany(mappedBy = "jogador")
	private List<Endereco> enderecos = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL, mappedBy = "jogador")
	private Contrato contrato;

	@ElementCollection
	@CollectionTable(name = "telefones")
	private Set<String> telefones = new HashSet<>();

	@JsonIgnore
	@ManyToMany(mappedBy = "jogadores")
	private List<Clube> clubes = new ArrayList<>();

	public Jogador(Long id, String nome, String email, String cpf, Contrato contrato) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.contrato = contrato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Jogador other = (Jogador) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
