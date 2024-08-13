package com.mycompany.principal3;
public class Principal3 {

    public static void main(String[] args) {
        
        Pessoa pessoa =  new Pessoa(2, "marta", 25, "4516114", "Marta@google.com", Sexo.FEMININO,
        new Endereco("casa", "a15", "casa", "45141", "Salcvador", UnidadeFederativa.BAHIA));
            
        System.out.println("Nome: "+pessoa.getNome());
        System.out.println("Endereço: "+pessoa.getEndereco().getUf().getNome());
   
    }
}
