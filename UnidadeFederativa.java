/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.principal3;

/**
 *
 * @author aluno.den
 */
public enum UnidadeFederativa {
    
    BAHIA ("Bahia","BA"),
    SAO_PAULO("São Paulo", "SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private String nome;
    private String sigla;

    private UnidadeFederativa(String nome, String uf) {
        this.nome = nome;
        this.sigla = uf;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return sigla;
    }
    
}
