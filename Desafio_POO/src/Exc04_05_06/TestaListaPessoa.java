package Exc04_05_06;

import java.util.ArrayList;
import java.util.List;

public class TestaListaPessoa {
    public static void main(String[] args) {

        System.out.println("--[Exercicio 04]--");

        Pessoa p1 = new Pessoa("João", 15);
        Pessoa p2 = new Pessoa("Leandro", 21);
        Pessoa p3 = new Pessoa("Paulo", 17);
        Pessoa p4 = new Pessoa("Jessica", 18);

        List<Pessoa> lista = new ArrayList<Pessoa>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        int maior = 0;
        String maisVelho = null;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdade() > maior) {
                maior = lista.get(i).getIdade();
                maisVelho = lista.get(i).getNome();
            }
        }
        System.out.println("Pessoa mais velha: " + maisVelho);

        // Exercicio 05
        System.out.println("---------------------------");
        System.out.println("--[Exercicio 05]--");
        System.out.println("Antes da exclusão: " + lista.size());

        int menorIdade = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdade() < 18) {
                menorIdade = lista.get(i).getIdade();
                lista.remove(i);
            }
        }
        System.out.println("Depois da exlusão:" + lista.size());

        System.out.println("---------------------------");
        System.out.println("--[Exercicio 06]--");

        int objetoEncontrado = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getNome().equals("Jessica")) {
                System.out.println("Objeto existe");
                System.out.println("Idade: " + lista.get(i).getIdade());
            }
        }
    }
}
