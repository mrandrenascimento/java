/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public abstract class Pessoa_Juridica extends Pessoa{
    
    protected String cnpj;
    protected String inscricao_Estadual;

    public Pessoa_Juridica(String cnpj, String inscricao_Estadual, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.cnpj = cnpj;
        this.inscricao_Estadual = inscricao_Estadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricao_Estadual() {
        return inscricao_Estadual;
    }
    
    
    
}
