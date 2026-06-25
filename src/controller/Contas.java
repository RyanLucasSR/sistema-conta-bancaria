package controller;

import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;
import model.Banco;
import model.ContaPoupanca;

public class Contas {

    Banco banco = new Banco();
    ContaPoupanca conta;

    public int cadastrarConta(String titular){
        return banco.cadastroConta(titular);
    }

    public void buscarConta(int id){
        System.out.println("Conta encontrada!");
        banco.buscarConta(id);
    }

    public void listarContas(){
        banco.listarContas();
        System.out.println("Fim da lista!");
    }

    public void removerConta(String titular, int id){
        banco.removerConta(titular, id);
        System.out.println("Conta removida!");
    }

    public void depositar(double valor, int id){
        ContaPoupanca conta = banco.buscarContaId(id);
        try{
            if(valor > 0){
                conta.depositar(valor);
                System.out.println("Valor depositado!");

            }
        }catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    public void sacar(double valor, int id){
        ContaPoupanca conta = banco.buscarContaId(id);
        try{
            conta.sacar(valor);
            System.out.println("Valor sacado!");
        }catch (ValorInvalidoException | SaldoInsuficienteException e){
            System.out.println(e.getMessage());
        }
    }

    public void transferir(double valor,int idOrigem, int idDestino){
        ContaPoupanca contaOrigem = banco.buscarContaId(idOrigem);
        ContaPoupanca contaDestino = banco.buscarContaId(idDestino);
        try{
            contaOrigem.transferir(valor, contaDestino);
            System.out.println("Valor transferido!");
        }catch (SaldoInsuficienteException | ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    public void renderJuros(double valor, int id){
        ContaPoupanca conta = banco.buscarContaId(id);
        try{
            conta.renderJuros(valor);
            System.out.println("Rendimento com sucesso!");
        }catch (SaldoInsuficienteException | ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }
}
