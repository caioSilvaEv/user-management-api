package com.caio.spring_api.model;


import jakarta.persistence.*;

@Entity
@Table(name = "clientes")
public class Usuarios {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String nome;
    private String email;
    private int idade;
    private String sexo;

    public Usuarios() {
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public  String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo () {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }


}

