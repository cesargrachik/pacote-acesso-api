package com.acesso.api.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="usuarios_perfil")
public class UsuariosPerfil implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 4151685190462836021L;
	
	@Id
	private Long Codigo_Usuario;
	@Id
	private Long Codigo_Perfil;
	
	public Long getCodigo_Usuario() {
		return Codigo_Usuario;
	}
	
	public void setCodigo_Usuario(Long codigo_Usuario) {
		Codigo_Usuario = codigo_Usuario;
	}
	
	public Long getCodigo_Perfil() {
		return Codigo_Perfil;
	}
	public void setCodigo_Perfil(Long codigo_Perfil) {
		Codigo_Perfil = codigo_Perfil;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Codigo_Perfil == null) ? 0 : Codigo_Perfil.hashCode());
		result = prime * result + ((Codigo_Usuario == null) ? 0 : Codigo_Usuario.hashCode());
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
		UsuariosPerfil other = (UsuariosPerfil) obj;
		if (Codigo_Perfil == null) {
			if (other.Codigo_Perfil != null)
				return false;
		} else if (!Codigo_Perfil.equals(other.Codigo_Perfil))
			return false;
		if (Codigo_Usuario == null) {
			if (other.Codigo_Usuario != null)
				return false;
		} else if (!Codigo_Usuario.equals(other.Codigo_Usuario))
			return false;
		return true;
	}
	
	

}
