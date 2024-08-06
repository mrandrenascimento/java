/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadejava;

/**
 *
 * @author aluno.den
 */
public class Principalatividade {

    public static void main(String[] args) {
        
        Livros livro1=new Livros("noa","sei la",1205,1254);
        
        System.out.println("Titulo: "+livro1.getTitulo());
        System.out.println("Autor: "+livro1.getAutor());
        System.out.println("Números de Página: "+livro1.getNumeroPaginas());
        System.out.println("Preço: "+livro1.getPreco());
    }
}
