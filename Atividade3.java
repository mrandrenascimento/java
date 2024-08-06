/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade3;

/**
 *
 * @author aluno.den
 */
public class Atividade3 {

    public static void main(String[] args) {
        //package atividade3;


/**
 * Hello world!
 *
 */
        
        String nome="Marta";
        String sobrenome="Silveira";

        //Exibindo a quantidade de caracters
        System.out.println("Tamanho do Nome: " + nome.length());
        System.out.println("Tamanho do Sobrenome: " + sobrenome.length());

        //Conectando Nome + Sobrenome
        String nomeCompleto=nome.concat(" ").concat(sobrenome);

        //Exibindo nome completo usando métodos Strings - Maiusculo
        System.out.println("Contatenação Maiuscula: "+nomeCompleto.toUpperCase());
        
        //Exibindo nome completo usando métodos Strings - Minuscula
        System.out.println("Contatenação Minuscula: "+nomeCompleto.toLowerCase());

    }
}

