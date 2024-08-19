/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_projeto;

/**
 *
 * @author aluno.den
 */
public class Pessoa_Fisica extends Pessoa{
    protected Sexo sexo;
    protected String cpf;
    protected String rg;
    protected String data_Nascimento;
    protected double salario;

    public Pessoa_Fisica(Sexo sexo, String cpf, String rg, String data_Nascimento, double salario, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.data_Nascimento = data_Nascimento;
        this.salario = salario;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public String getRg() {
        return rg;
    }

    public String getData_Nascimento() {
        return data_Nascimento;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Dados Pessoa Fisica"
                + "sexo=" + sexo + ", cpf=" + cpf + ", rg=" + rg + ", data_Nascimento=" + data_Nascimento + ", salario=" + salario;
    }

   
    
    
}
