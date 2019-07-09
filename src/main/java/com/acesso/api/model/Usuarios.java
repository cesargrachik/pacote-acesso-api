package com.acesso.api.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * @author Cesar
 *
 */
@Entity
@Table(name = "usuarios")
public class Usuarios {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	private String nome;
	private String login;
	private String email;
	private String senha;
	private LocalDate data_criacao;
	private Integer tempo_expiracao_senha;
	private String cod_autorizacao;
	private String status_usuario;
	private Integer cod_pessoa;

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getData_criacao() {
		return data_criacao;
	}

	public void setData_criacao(LocalDate data_criacao) {
		this.data_criacao = data_criacao;
	}

	public Integer getTempo_expiracao_senha() {
		return tempo_expiracao_senha;
	}

	public void setTempo_expiracao_senha(Integer tempo_expiracao_senha) {
		this.tempo_expiracao_senha = tempo_expiracao_senha;
	}

	public String getCod_autorizacao() {
		return cod_autorizacao;
	}

	public void setCod_autorizacao(String cod_autorizacao) {
		this.cod_autorizacao = cod_autorizacao;
	}

	public String getStatus_usuario() {
		return status_usuario;
	}

	public void setStatus_usuario(String status_usuario) {
		this.status_usuario = status_usuario;
	}

	public Integer getCod_pessoa() {
		return cod_pessoa;
	}

	public void setCod_pessoa(Integer cod_pessoa) {
		this.cod_pessoa = cod_pessoa;
	}

	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "usuarios_perfil", joinColumns = @JoinColumn(name = "codigo_usuario"),
	inverseJoinColumns = @JoinColumn(name = "codigo_perfil"))
	private List<Perfil> usuariosPerfil;

	public List<Perfil> getUsuariosPerfil() {
		return usuariosPerfil;
	}

	public void setUsuariosPerfil(List<Perfil> usuariosPerfil) {
		this.usuariosPerfil = usuariosPerfil;
	}


	@OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "usuarios_aparelhos", joinColumns = @JoinColumn(name = "codigo_usuario"),
	inverseJoinColumns = @JoinColumn(name =	"codigo_aparelho")) 
	private Set<Aparelhos> usuariosAparelhos;

	public Set<Aparelhos> getUsuariosAparelhos() { return usuariosAparelhos; }

	public void setUsuariosAparelhos(Set<Aparelhos> usuariosAparelhos) {
		this.usuariosAparelhos = usuariosAparelhos; }
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
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
		Usuarios other = (Usuarios) obj;
		if (id_usuario == null) {
			if (other.id_usuario != null)
				return false;
		} else if (!id_usuario.equals(other.id_usuario))
			return false;
		return true;
	}

}
