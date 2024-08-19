/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal_projeto;

import java.time.LocalDate;

/**
 *
 * @author aluno.den
 */
public class Pessoa_Juridica extends Pessoa {
    private String cnpj;
    private String inscricao_Estadual;
    private LocalDate dataInicio;
    private LocalDate dataTermino;
    private double valor_Contrato;

    public Pessoa_Juridica(String cnpj, String inscricao_Estadual, LocalDate dataInicio, LocalDate dataTermino, double valor_Contrato, int id, String nome, String telefone, Endereco endereco) {
        super(id, nome, telefone, endereco);
        this.cnpj = cnpj;
        this.inscricao_Estadual = inscricao_Estadual;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.valor_Contrato = valor_Contrato;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getInscricao_Estadual() {
        return inscricao_Estadual;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public double getValor_Contrato() {
        return valor_Contrato;
    }
    
    
}
