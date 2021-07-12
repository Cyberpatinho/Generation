package com.minhaLojadeGames.models.dtos;

import javax.validation.constraints.NotBlank;

public class ClienteDTO {

	private long id;
	@NotBlank(message = "Insira um login")
	private String login;
	@NotBlank(message = "Insira uma senha")
	private String senha;
	private String token;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	
}
