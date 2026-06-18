package view;

import controller.Contas;
import exception.ValorInvalidoException;

import java.util.Scanner;

public class ContaBancariaConsole {

    private Contas conta = new Contas();
    private Menu menu = new Menu();

    private Scanner entrada = new Scanner(System.in);

    int escolha = 1;
    boolean continuar = true;

    public void iniciar(){
        do{
            System.out.println(menu.exibirMenu());

            valorDigitado(entrada.nextInt());
            deveContinuar();

            switch (escolha){
                case 1:
                    entrada.nextLine();

                    System.out.println("Informe o seu nome: ");
                    String titular = entrada.nextLine();

                    int id = conta.cadastrarConta(titular);

                    System.out.println("Seu id: "+ id + "\nPressione 1!");
                    entrada.next();

                    break;
                case 2:
                    System.out.println("Informe seu id: ");
                    int idConta = entrada.nextInt();

                    conta.buscarConta(idConta);
                    break;
                case 3:
                    conta.listarContas();
                    break;
                case 4:
                    System.out.println("Informe seu nome: ");
                    titular = entrada.next();

                    System.out.println("Informe a sua id: ");
                    idConta = entrada.nextInt();

                    conta.removerConta(titular, idConta);
                    break;
                case 5:
                    System.out.println("Informe seu id: ");
                    idConta = entrada.nextInt();

                    System.out.println("Informe o deposito: ");
                    double deposito = entrada.nextDouble();

                    conta.depositar(deposito, idConta);
                    break;
                case 6:
                    System.out.println("Informe seu id: ");
                    idConta = entrada.nextInt();

                    System.out.println("Informe quanto deseja sacar: ");
                    double valorSacar = entrada.nextDouble();

                    conta.sacar(valorSacar,  idConta);
                    break;
                case 7:
                    System.out.println("Informe o id de quem fará a transferência: ");
                    int idTransferencia = entrada.nextInt();

                    System.out.println("Informe o quanto deseja transferir: ");
                    double depositoTransferencia = entrada.nextDouble();

                    System.out.println("Informe o id de quem ira receber a transferência: ");
                    int idReceber = entrada.nextInt();

                    conta.transferir(depositoTransferencia, idTransferencia, idReceber);
                    break;
                case 8:
                    System.out.println("Informe o id de quem ira investir: ");
                    int idInvestir = entrada.nextInt();

                    System.out.println("Informe quanto deseja investir: ");
                    double valorInvestir = entrada.nextDouble();

                    conta.renderJuros(valorInvestir, idInvestir);
                    break;
                case 0:
                    System.out.println("Saindo...");

                    break;
                default:
                    System.out.println("Valor invalido!");
            }
        }while(continuar != false);
    }

    private void valorDigitado(int valor){
        try{
            if(valor >= 0 && valor <= 8){
                escolha = valor;
            } else if (valor < 0 || valor > 8) {
                throw new ValorInvalidoException();
            }
        }catch(ValorInvalidoException e){
            System.out.println(e.getMessage());
        }
    }

    private void deveContinuar(){
        if(escolha != 0){
            continuar = true;
        }else {
            continuar = false;
        }
    }
}
