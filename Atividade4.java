/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade4;

/**
 *
 * @author aluno.den
 */
public class Atividade4 {

    public static void main(String[] args) {
        //instanciando um objeto.
        Clientes cliente = new Clientes("Marta",20);
        
        //cliente.nome = "Marta";
        //cliente.idade=18;
        //cliente.setNome("Marta");
        //cliente.setIdade(20);
        
        System.out.println("Nome : " +cliente.getNome());
        System.out.println("Idade : " +cliente.getIdade());
    }
}
