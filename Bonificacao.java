/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.principal_1_27_08_2024;

import java.util.logging.Logger;

/**
 *
 * @author aluno.den
 */
public enum Bonificacao {
    GERENTE,
    DIRETOR;

    private double gerente = 0.35;
    private double diretor = 0.45;

    public double getGerente() {
        return gerente;
    }

    public double getDiretor() {
        return diretor;
    }
    
    
}
