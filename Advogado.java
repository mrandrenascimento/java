/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_1_27_08_2024;

/**
 *
 * @author aluno.den
 */
public class Advogado extends Funcionario{
    protected String oab;

    public Advogado(String oab, String nome, String cpf, String rg, Endereco endereco, Setor setor, Sexo sexo, double salario, String data_De_Nascimento) {
        super(nome, cpf, rg, endereco, setor, sexo, salario, data_De_Nascimento);
        this.oab = oab;
    }

    public String getOab() {
        return oab;
    }

    @Override
    public String toString() {
        return "Advogado{" + "oab=" + oab + '}';
    }
    
    
    
}
