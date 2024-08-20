/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.principal;

/**
 *
 * @author aluno.den
 */
public abstract class Pessoa_Fisica extends Pessoa{
    
    protected Sexo sexo;
    protected Estando_Civil estado_Civil;
    protected String data_Nascimento;

    public Pessoa_Fisica(Sexo sexo, Estando_Civil estado_Civil, String data_Nascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.sexo = sexo;
        this.estado_Civil = estado_Civil;
        this.data_Nascimento = data_Nascimento;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public Estando_Civil getEstado_Civil() {
        return estado_Civil;
    }

    public String getData_Nascimento() {
        return data_Nascimento;
    }
    
    
}
