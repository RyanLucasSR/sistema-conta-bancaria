package conta;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(String titular, int numeroConta){
        setTitular(titular);
        setNumeroConta(numeroConta);
    }

    public void renderJuros(){
        double juros = getSaldo() * 0.05;
        depositar(juros);
    }
}
