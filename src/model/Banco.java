package model;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<ContaPoupanca> conta = new ArrayList<>();
    private List<Integer> idsColecao = new ArrayList<>();

    public int cadastroConta(String titular){
        int id = seuId();
        conta.add(new ContaPoupanca(titular, id));
        return id;
    }

    public void listarContas(){
        conta.stream().forEach(System.out::println);
    }

    public void buscarConta(int id){
        conta.stream().filter(c -> c.getId() == id).forEach(System.out::println);

    }

    public void removerConta(String titular, int id){
        conta.removeIf(c -> c.getTitular().trim().equalsIgnoreCase(titular.trim())
                && c.getId() == id);
    }

    public ContaPoupanca buscarContaId(int id){
        return conta.stream().filter(c -> c.getId() == id).findFirst().orElse(null);

    }

    private int gerarId(){
        return (int) (Math.random() * 90000) + 1000;
    }

    private int seuId(){
        int id = gerarId();
        while(idsColecao.contains(id)){
            id = gerarId();
        }
        return id;
    }
}
