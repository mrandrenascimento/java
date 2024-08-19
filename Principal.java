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
        
        Fisica pessoa_Fisica= new Fisica("02312", "325", "15192154", "Lourds", "4512545");
        Juridica Pessoa_Juridica =new Juridica("121212", "1212124", "Joana", "784113");
        
        System.out.println(pessoa_Fisica.toString());
        System.out.println(Pessoa_Juridica.toString());
            
    }
}
