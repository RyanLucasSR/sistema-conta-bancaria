package model;

import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(String titular, int id){
        super(titular, id);
    }

    public void renderJuros(double valor){
        if(valor > getSaldo()) {
            throw new SaldoInsuficienteException();
        }
        if(valor < 0) {
            throw new ValorInvalidoException();
        }

        double juros = valor * 0.05;
        depositar(juros);
    }

    @Override
    public String toString() {
        return String.format("=================\n" +
                "Titular: %s\nSaldo: %.2f\nID: %d\n====================\n"
                , getTitular(), getSaldo(), getId());
    }
}
