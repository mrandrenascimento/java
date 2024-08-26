/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.preincipal;

/**
 *
 * @author aluno.den
 */
public class Principal {

    public static void main(String[] args) {
        Cachorro toto = new Cachorro();
        Gato gato = new Gato();
        
        System.out.println("Som: " + toto.emitirSom());
        System.out.println("Som: " + gato.emitirSom());
    }
}
