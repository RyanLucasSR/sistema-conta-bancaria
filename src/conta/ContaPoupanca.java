package conta;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, int numeroConta){
        super(titular, numeroConta);
    }

    public void renderJuros(){
        double juros = getSaldo() * 0.05;
        depositar(juros);
    }

    @Override
    public String toString() {
        return String.format("Titular: %s\nSaldo: %.2f", getTitular(), getSaldo());
    }
}
