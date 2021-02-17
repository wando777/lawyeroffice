package com.thiagosoares.futebol.model.enums;

import lombok.Getter;

@Getter
public enum TipoUser {

	ADMINISTRADOR(1, "Administrador"), USUARI_MASTER(2, "Usuário Master");

	private int id;
	private String descricao;

	private TipoUser(int id, String descricao) {
		this.id = id;
		this.descricao = descricao;
	}

	public static TipoUser toEnum(Integer id) {

		if (id == null) {
			return null;
		}
		for (TipoUser x : TipoUser.values()) {
			if (id.equals(x.getId())) {
				return x;
			}
		}
		throw new IllegalArgumentException("Id inválido: " + id);
	}
}
