package br.com.fabricadeprogramador.persistencia.entidade;

public class Usuario {
	private Integer id;
	private String login;
	private String senha;
	private String nome;
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return nome;
	}
	public Integer getId() {
		return id;
	}
	public String getLogin() {
		return login;
	}
	public String getSenha() {
		return senha;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	

}
