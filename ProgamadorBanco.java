/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progamadorbanco;

/**
 *
 * @author aluno.den
 */
public class ProgamadorBanco {

    public static void main(String[] args) {
        
        ContaBancaria contaBancaria = new ContaBancaria("Banco do Brasil", 325716675, 3521487, "Conta Corrente", 35, 60);
        
        Funcionarios funcionarios = new Funcionarios("1242d46shj212", "Salada", "Avenida do CAB, Salvador", "35716541125", contaBancaria);
        
        System.out.println("Imprimento a Dados Funcionário");
        System.out.println("Nome: "+funcionarios.getNome());
        System.out.println("Banco: "+funcionarios.getContaBanco().getBanco());
        System.out.println("Agência: "+funcionarios.getContaBanco().getAgencia());
        
        System.out.println("Imprimento a Dados Conta");
        System.out.println("Banco: "+contaBancaria.getBanco());
        System.out.println("Agencia: "+contaBancaria.getAgencia());
        System.out.println("Número Conta: "+contaBancaria.getNumeroConta());
        System.out.println("Tipo Conta: "+contaBancaria.getTipoConta());
        System.out.println("Saldo Atual: "+contaBancaria.getSaldoAtual());
        System.out.println("Limite Disponivel: "+contaBancaria.getLimiteDisponivel());
        
                
        
    }
}
