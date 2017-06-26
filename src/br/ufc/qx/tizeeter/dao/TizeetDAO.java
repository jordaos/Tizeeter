package br.ufc.qx.tizeeter.dao;

import java.sql.Connection;
import java.util.Collections;
import java.util.List;

import br.ufc.qx.tizeeter.model.Tizeet;
import br.ufc.qx.tizeeter.model.Usuario;

public class TizeetDAO {

	private Connection conexao;

	public void setConexao(Connection conexao) {
		this.conexao = conexao;
	}

	public Tizeet adiciona(Tizeet tizeet) {
		return null;
	}

	public List<Tizeet> getTodos(Usuario usuario) {
		return Collections.emptyList();
	}
}
