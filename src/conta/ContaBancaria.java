package conta;

public class ContaBancaria {

    private String titular;
    private double saldo = 0;
    private int numeroConta;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
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

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        if (numeroConta > 0) {
            this.numeroConta = numeroConta;
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Depositado com sucesso!");
        }else {
            System.out.println("Deposito invalido!");
        }
    }

    public void sacar(double valor){
        if(valor <= getSaldo() && valor > 0){
            setSaldo(getSaldo() - valor);
            System.out.println("Sacado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }

    public String exibirSaldo(){
            return "Titular: " + getTitular() + "\nSaldo: " + getSaldo();
    }

    public void transferir(double valor, ContaBancaria outraConta){
        if(valor <= getSaldo()) {
            setSaldo(getSaldo() - valor);
            outraConta.depositar(valor);
            System.out.println("Transferencia com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
}
