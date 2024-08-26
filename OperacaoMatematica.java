/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operacaomatematica;

/**
 *
 * @author aluno.den
 */
public class OperacaoMatematica {

    public static void main(String[] args) {
        Calcular calcular = new Calcular();
        
        System.out.println(calcular.soma(5.0, 3.0));
        System.out.println(calcular.subtracao(5.0, 3.0));
        System.out.println(calcular.multiplicacao(5.0, 3.0));
        System.out.println(calcular.divisao(5.0, 3.0));
                
             
    }
}
