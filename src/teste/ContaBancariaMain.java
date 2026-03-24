package teste;

import conta.ContaPoupanca;

public class ContaBancariaMain {

    public static void main(String[] args) {

        ContaPoupanca c1 = new ContaPoupanca("Ryan", 15);

        System.out.println(c1.exibirSaldo());
        c1.depositar(100);
        System.out.println(c1.exibirSaldo());
        c1.sacar(200);
        System.out.println(c1.exibirSaldo());
        c1.sacar(50);
        System.out.println(c1.exibirSaldo());
        c1.renderJuros();
        System.out.println(c1.exibirSaldo());

        ContaPoupanca c2 = new ContaPoupanca("Lucas", 14);

        System.out.println(c2.exibirSaldo());
        c1.transferir(20, c2);
        System.out.println(c2.exibirSaldo());
        System.out.println(c1.exibirSaldo());

        c2.renderJuros();
        System.out.println(c2.exibirSaldo());
    }
}
