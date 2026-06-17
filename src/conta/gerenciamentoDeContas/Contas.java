package conta.gerenciamentoDeContas;

import conta.ContaPoupanca;
import java.util.ArrayList;
import java.util.List;

public class Contas {

    List<ContaPoupanca> conta = new ArrayList<>();

    public void adicionarConta(String nome, int numero) {
        this.conta.add(new ContaPoupanca(nome, numero));
        System.out.println("Conta adicionado com sucesso!");
    }

    public void pesquisarConta(int numeroConta) {
        conta.stream()
                .filter(contaN -> contaN.getId() == numeroConta)
                .forEach(System.out::println);
    }

    public void listarContas(){
        conta.stream()
                .forEach(System.out::println);
    }

    public void removerConta(int numeroConta) {
        conta.removeIf(contaN -> contaN.getId() == numeroConta);
        System.out.println("Conta removido com sucesso!");
    }
}
