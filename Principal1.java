/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.principal1;

/**
 *
 * @author aluno.den
 */
public class Principal1 {

    public static void main(String[] args) {
        Cachorro bred = new Cachorro();
        Gato frajola = new Gato();
        Galo carijo = new Galo();
        Pato donald = new Pato();
        
        System.out.println("\nSom: " + bred.emitirSons());
        System.out.println("Bred Come: " + bred.comer());
        
        System.out.println("\nSom: " + frajola.emitirSons());
        System.out.println("Frajola Come: " + frajola.comer());
        
        System.out.println("\nSom: " + carijo.emitirSons());
        System.out.println("Carijó Come: " + carijo.comer());
        
        System.out.println("\nSom: " + donald.emitirSons());
        System.out.println("Donalt Come: " + donald.comer());
    }
}
