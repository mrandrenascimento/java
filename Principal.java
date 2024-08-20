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
       
  
        Cliente cliente = new Cliente("45188", Sexo.FEMININO, Estando_Civil.CASADO, "150594", "Euclides", "39 8974542", "Euclidees@google.com", 
                new Endereco("Condominio", "45 E", "Condominio", "451212154", "Silveira Mar", Unidade_Federetiva.BAHIA));
        
        Prestacao_Servico prestacaoServico= new Prestacao_Servico("56414", "56415", "451215457", "4454724", "Antonio", "351457451", "Antonio@google.com", 
                new Endereco("Comercio", "45", "Comercio", "412124554", "Santos", Unidade_Federetiva.BAHIA));
        
        System.out.println(prestacaoServico.toString());
        System.out.println(cliente.toString());
        
    }
}
