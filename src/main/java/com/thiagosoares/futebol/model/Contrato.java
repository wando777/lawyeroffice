package com.thiagosoares.futebol.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "contratos")
public class Contrato implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Double salario;

	@JsonFormat(pattern="dd/MM/yyyy")
	private Date inicio;

	@JsonFormat(pattern="dd/MM/yyy")
	private Date fim;

	@JsonIgnore
	@OneToOne
	@JoinColumn(name="id_jogador")
	@MapsId
	private Jogador jogador;

	public Contrato(Long id, Double salario, Date inicioContrato, Date fimContrato, Jogador jogador) {
		this.id = id;
		this.salario = salario;
		this.inicio = inicioContrato;
		//this.fimContrato = fimContrato;
		this.jogador = jogador;
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
		Contrato other = (Contrato) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

}
