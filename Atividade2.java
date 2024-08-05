/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividade2;

import java.util.Scanner;

/**
 *
 * @author aluno.den
 */
public class Atividade2 {

    public static void main(String[] args) {
       
       Scanner teclado = new Scanner(System. in);
       
       int primeiroNumero, segundoNumero, menorNumero; 
     
        System.out.println("Digite o Primeiro Número: ");
        primeiroNumero=teclado.nextInt();
        
        System.out.println("Digite o Segundo Númeor: ");
        segundoNumero=teclado.nextInt();
        
        if(primeiroNumero<segundoNumero){
            menorNumero=primeiroNumero;
        }else{
            
            menorNumero=segundoNumero;
            
        } 
        System.out.println("Menor Numero: "+menorNumero);
        
    }
}