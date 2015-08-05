package br.com.fabricadeprogramador.persistencia.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;

/**
 * Objeto de acesso a dados
 * @author davigoes
 *
 */
public class UsuarioDAO {
	
	
	private Connection con;
	
	public UsuarioDAO(){
		//Obtendo uma ceonexao com Banco
		con= ConexaoFactory.getConnection();
	}
	
	public void cadastrar(Usuario usuario){
		String sql = "insert into usuario (nome, login, senha) values (?, ?, ?)";
		
		try (PreparedStatement preparador = con.prepareStatement(sql)){
			//Criando objeto Statement
			preparador.setString(1, usuario.getNome());
			preparador.setString(2, usuario.getLogin());
			preparador.setString(3, usuario.getSenha());
			
			preparador.execute();
			preparador.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	

}
