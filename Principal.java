/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        
        System.out.println(calculadora.calcular(3.0, 2.0));
        System.out.println(calculadora.calcular(3, 2));
    }
}
