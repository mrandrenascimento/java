/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class  Juridica extends Familia_Pessoa{
    
    protected String cnpj;
    protected String inscricao_Estadual;

    public Juridica(String cnpj, String inscricao_Estadual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricao_Estadual = inscricao_Estadual;
    }

    
    public String getCnpj() {
        return cnpj;
    }

    public String getInscricao_Estadual() {
        return inscricao_Estadual;
    }

    @Override
    public String toString() {
        return "\nDados Pessoa Juridica: " +
                super.toString() + //para não ficar precisando colocar os dados na familia ex: nome, cpf, rg, salario etc, ´so colocar um super toString() conforma atividade
                "\nCNPJ: "+ cnpj+
                "\nInscrição Estadual:"+inscricao_Estadual;
    }

    
}