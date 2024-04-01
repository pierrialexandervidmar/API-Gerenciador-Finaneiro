package com.apifinanceira.entities;

import java.io.Serializable;
import java.util.Objects;

import com.apifinanceira.enums.TypeTransaction;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; 

@Entity
@Table(name = "tb_categories")
public class Category implements Serializable {

    /** Identificador de versão serial para garantir a compatibilidade durante a serialização. */
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String title;
    
	@Enumerated(EnumType.STRING)
    private TypeTransaction tipo;

	
    public Category(Long id, String title, TypeTransaction tipo) {
    	this.title = title;
		setTipo(tipo);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setTipo(TypeTransaction tipo) {
		if(tipo != null) {
			this.tipo = tipo;
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Category other = (Category) obj;
		return Objects.equals(id, other.id);
	}

    
}
