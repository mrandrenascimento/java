/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.principal_projeto;

/**
 *
 * @author aluno.den
 */
public enum Sexo {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String formatado;

    private Sexo(String formatado) {
        this.formatado = formatado;
    }

    public String getFormatado() {
        return formatado;
    }

    public void setFormatado(String formatado) {
        this.formatado = formatado;
    }
    
    
}
