package com.acesso.api.model;

import javax.persistence.Column;
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
	private Long id_aparelho;
	
	@Column(name="descricao_aparelho")
	private String descricaoAparelho;

	private String codigo_aparelho;
	public Long getId_aparelho() {
		return id_aparelho;
	}
	public void setId_aparelho(Long id_aparelho) {
		this.id_aparelho = id_aparelho;
	}
	
	public String getDescricaoAparelho() {
		return descricaoAparelho;
	}
	public void setDescricaoAparelho(String descricaoAparelho) {
		this.descricaoAparelho = descricaoAparelho;
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
		result = prime * result + ((id_aparelho == null) ? 0 : id_aparelho.hashCode());
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
		if (id_aparelho == null) {
			if (other.id_aparelho != null)
				return false;
		} else if (!id_aparelho.equals(other.id_aparelho))
			return false;
		return true;
	}
	
	
	
	
}
