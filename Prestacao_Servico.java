/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public class Prestacao_Servico extends Pessoa_Juridica{
    
    protected String contrato_Inicial;
    protected String Contrato_Fim;

    public Prestacao_Servico(String contrato_Inicial, String Contrato_Fim, String cnpj, String inscricao_Estadual, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricao_Estadual, nome, telefone, email, endereco);
        this.contrato_Inicial = contrato_Inicial;
        this.Contrato_Fim = Contrato_Fim;
    }

    public String getContrato_Inicial() {
        return contrato_Inicial;
    }

    public String getContrato_Fim() {
        return Contrato_Fim;
    }

    @Override
    public String toString() {
        return " \nPrestacao_Servico " + 
               super.toString();
    }
    
    
}
