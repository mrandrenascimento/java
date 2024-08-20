/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public  class Cliente extends Pessoa_Fisica{
    String protocolo_Atendimento;

    public Cliente(String protocolo_Atendimento, Sexo sexo, Estando_Civil estado_Civil, String data_Nascimento, String nome, String telefone, String email, Endereco endereco) {
        super(sexo, estado_Civil, data_Nascimento, nome, telefone, email, endereco);
        this.protocolo_Atendimento = protocolo_Atendimento;
    }

    public String getProtocolo_Atendimento() {
        return protocolo_Atendimento;
    }

    public void setProtocolo_Atendimento(String protocolo_Atendimento) {
        this.protocolo_Atendimento = protocolo_Atendimento;
    }

    @Override
    public String toString() {
        return " Cliente " + 
               super.toString();
    
    }
    
    
}
