/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_1_27_08_2024;

/**
 *
 * @author aluno.den
 */
public abstract class Cargo_De_Confianca extends Funcionario{
    protected Bonificacao bonificacao;

    public Cargo_De_Confianca(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_De_Nascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, data_De_Nascimento);
        this.bonificacao = bonificacao;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }
    
}
