/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade;

/**
 *
 * @author aluno.den
 */
public class Atividade {

    public static void main(String[] args) {
        // Declaração de variaveis
        String nomeUsuario="Marta";
        int senha=123;
        
        //Comparação de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha==456);
        
        //Exibindo resultados
        System.out.println("O nome do usuario esta correto? "+resultadoNome);
        System.out.println("A Senha esta correta? "+resultadoSenha);
        
        
    }
}
