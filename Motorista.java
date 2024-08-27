/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_1_27_08_2024;

/**
 *
 * @author aluno.den
 */
public class Motorista extends Funcionario{
    protected String carteira_De_Habilitacao;

    public Motorista(String carteira_De_Habilitacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_De_Nascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, data_De_Nascimento);
        this.carteira_De_Habilitacao = carteira_De_Habilitacao;
    }

    public String getCarteira_De_Habilitacao() {
        return carteira_De_Habilitacao;
    }
    
    
}
