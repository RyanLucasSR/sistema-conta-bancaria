package model;

import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

import java.util.Objects;

public class Conta {

    private String titular;
    private double saldo;
    private int id;

    public Conta(String titular, int id){
        setTitular(titular);
        setId(id);
    }

    public String getTitular() {
        return titular;
    }

    private void setTitular(String titular) {
        if(titular != null && titular.trim().length() >= 3) {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }else{
            throw new SaldoInsuficienteException();
        }
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            setSaldo(getSaldo() + valor);
        }else {
            throw new ValorInvalidoException();
        }
    }

    public void sacar(double valor) {
        if (valor < 0){
            throw new ValorInvalidoException();
        }
        if(valor > getSaldo()){
            throw new SaldoInsuficienteException();
        }

        setSaldo(getSaldo() - valor);
    }

    public void transferir(double valor, Conta outraConta){
        if(valor >= getSaldo()) {
           throw new SaldoInsuficienteException();
        }else if(valor < 0){
            throw new ValorInvalidoException();
        }

        sacar(valor);
        outraConta.depositar(valor);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Conta that = (Conta) o;
        return Double.compare(saldo, that.saldo) == 0 && id == that.id && Objects.equals(titular, that.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular, saldo, id);
    }
}
