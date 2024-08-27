/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_1_27_08_2024;

/**
 *
 * @author aluno.den
 */
public class Salario implements Salario_Final{

    @Override
    public double salario() {
        //Para gerente
        
        double salario_Final=0;
        salario_Final=super.salario*super.bonificacao.GERENTE.getValor();
        salario_Final+=super.salario;
        return salario_Final;
    }
        
    }
    

