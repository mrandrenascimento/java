/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principalfuncionarios;

/**
 *
 * @author aluno.den
 */
public class PrincipalFuncionarios {

    public static void main(String[] args) {
       Funcionarios funcionario =new Funcionarios(45, "Joana", 3500.0, Setor.RECURSOS_HUMANOS, Sexo.FEMININO, 45);
       
        System.out.println("Matricula: "+funcionario.getId());
        System.out.println("Nome: "+funcionario.getNome());
        System.out.println("Sexo: "+funcionario.getSexo());
        System.out.println("Setor: "+funcionario.getSetor());
           
    }
}
