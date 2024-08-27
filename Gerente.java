/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_1_27_08_2024;

/**
 *
 * @author aluno.den
 */
public class Gerente extends Cargo_De_Confianca{

    protected double valor;

    public Gerente(double valor, Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_De_Nascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, data_De_Nascimento);
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Gerente{" + "valor=" + valor + '}';
    }
    
    
    
    
}
