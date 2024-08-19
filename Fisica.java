/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Fisica extends Familia_Pessoa{
    
    protected String cpf;
    protected String rg;
    protected String danda_De_Nascimento;

    public Fisica(String cpf, String rg, String danda_De_Nascimento, String nome, String telefone) {
        super(nome, telefone);
        this.cpf = cpf;
        this.rg = rg;
        this.danda_De_Nascimento = danda_De_Nascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getDanda_De_Nascimento() {
        return danda_De_Nascimento;
    }

    @Override
    public String toString() {
        return "Pessoa Fisica:" + 
                "\nNome: "+super.nome+
                "\nTelefone: "+ super.telefone+
                "\nCPF: " + cpf + 
                "\nRG:" + rg + 
                "\nData de Nascimento: " + danda_De_Nascimento;
    }

    
}
