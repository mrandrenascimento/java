/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_projeto;

/**
 *
 * @author aluno.den
 */
public abstract class Pessoa {
    
    protected int id;
    protected String nome;
    protected String telefone;
    protected Endereco endereco;

    public Pessoa(int id, String nome, String telefone, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "Dados Pessoa" +
                super.toString();
                
    }
    
        
}
