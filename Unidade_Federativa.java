/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.principal_projeto;

/**
 *
 * @author aluno.den
 */
public enum Unidade_Federativa {
    BAHIA("Bahia","BA"),
    SAO_PAULO("São Paulo","SP"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ");
    
    private String texto;
    private String sigla;

    private Unidade_Federativa(String texto, String sigla) {
        this.texto = texto;
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }
    
    
    
}
