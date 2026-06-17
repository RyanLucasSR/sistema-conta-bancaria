package teste;

import conta.gerenciamentoDeContas.Contas;
import conta.menu.Menu;

import java.util.Scanner;

public class ContaBancariaMain {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Contas conta = new Contas();
        Menu menu = new Menu();

        int escolha = 0;
        do {
            System.out.println(menu.exibirMenu());
            escolha = entrada.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("Digite seu nome:");
                    String nome = entrada.nextLine();
                    System.out.println("Digite seu ID");
                    int id = entrada.nextInt();
                    conta.adicionarConta(nome, id);
                    break;
                case 2:
                    System.out.println("Digite seu Id");
                    int idConta = entrada.nextInt();
                    conta.pesquisarConta(idConta);
                    break;
                case 3:
                    conta.listarContas();
                    break;
            }

        }while(escolha != 0 && escolha <= 8);
    }
}
