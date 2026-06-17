package conta;

import java.util.Objects;

public class ContaBancaria {

    private String titular;
    private double saldo;
    private int id;

    public ContaBancaria(String titular, int numeroConta){
        setTitular(titular);
        setId(numeroConta);
    }

    public String getTitular() {
        return titular;
    }

    private void setTitular(String titular) {
        if(titular.length() >= 3) {
            this.titular = titular;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    private void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        if (id >= 0) {
            this.id = id;
        }
    }

    public void depositar(double valor) {
        if (valor >= 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depositado com sucesso!");
        }else {
            System.out.println("Deposito invalido!");
        }
    }

    public void sacar(double valor) {
        if (valor < 0){
            throw new IllegalArgumentException("Valor invalido!");
        }
        if(valor > getSaldo()){
            throw new IllegalArgumentException("Saldo insuficiente!");
        }

        setSaldo(getSaldo() - valor);
        System.out.println("Saque realizado com sucesso!");
    }

    public void transferir(double valor, ContaBancaria outraConta){
        if(valor <= getSaldo()) {
           throw new IllegalArgumentException("Saldo insuficiente!");
        }

        setSaldo(getSaldo() - valor);
        outraConta.depositar(valor);
        System.out.println("Transferencia com sucesso!");
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        ContaBancaria that = (ContaBancaria) o;
        return Double.compare(saldo, that.saldo) == 0 && id == that.id && Objects.equals(titular, that.titular);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titular, saldo, id);
    }
}
