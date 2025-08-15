package com.example.demotrabalho.model;

import jakarta.persistence.*;

@Entity
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String responsavel;
    private String dataEntrega;

    public Tarefa() {}

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }

    public String getDataEntrega() { return dataEntrega; }
    public void setDataEntrega(String dataEntrega) { this.dataEntrega = dataEntrega; }
}
