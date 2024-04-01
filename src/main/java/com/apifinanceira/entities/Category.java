package com.apifinanceira.entities;

import java.io.Serializable;

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
    
    
}
