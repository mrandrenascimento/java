/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_1_27_08_2024;

/**
 *
 * @author aluno.den
 */
public class Diretor extends Cargo_De_Confianca{
    private double PREMIO = 0.5;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_De_Nascimento) {
        super(bonificacao, nome, cpf, rg, endereco, setor, sexo, salario, data_De_Nascimento);
    }

    public double getPREMIO() {
        return PREMIO;
    }
    
    
}
