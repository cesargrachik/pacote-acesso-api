package com.acesso.api.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "aparelhos")
public class Aparelhos {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_aparelho;
	
	private String descricao_aparelho;
	private String codigo_aparelho;
	public Integer getId_aparelho() {
		return id_aparelho;
	}
	public void setId_aparelho(Integer id_aparelho) {
		this.id_aparelho = id_aparelho;
	}
	public String getDescricao_aparelho() {
		return descricao_aparelho;
	}
	public void setDescricao_aparelho(String descricao_aparelho) {
		this.descricao_aparelho = descricao_aparelho;
	}
	public String getCodigo_aparelho() {
		return codigo_aparelho;
	}
	public void setCodigo_aparelho(String codigo_aparelho) {
		this.codigo_aparelho = codigo_aparelho;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo_aparelho == null) ? 0 : codigo_aparelho.hashCode());
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
		Aparelhos other = (Aparelhos) obj;
		if (codigo_aparelho == null) {
			if (other.codigo_aparelho != null)
				return false;
		} else if (!codigo_aparelho.equals(other.codigo_aparelho))
			return false;
		return true;
	}

	
	
	
}
