/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_projeto;

/**
 *
 * @author aluno.den
 */
public  class Endereco extends Pessoa{
    
    protected  String logradouro;
    protected  String numero;
    protected  String complemento;
    protected  String cep;
    protected  String cidade;
    protected Unidade_Federativa uf;

    public Endereco(String logradouro, String numero, String complemento, String cep, String cidade, Unidade_Federativa uf, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.cep = cep;
        this.cidade = cidade;
        this.uf = uf;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getNumero() {
        return numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getCep() {
        return cep;
    }

    public String getCidade() {
        return cidade;
    }

    public Unidade_Federativa getUf() {
        return uf;
    }

    @Override
    public String toString() {
        return "Endereco{" + "logradouro=" + logradouro + ", numero=" + numero + ", complemento=" + complemento + ", cep=" + cep + ", cidade=" + cidade + ", uf=" + uf.getTexto() + '}';
    }

   

}