package Exc03;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Personagem.quantdPersonagem = 0;


        Personagem mago, guerreiro1;


        Guerreiro guerreiro = new Guerreiro("Valquiria", 12, 7, 33, 8, 50, 1, new ArrayList<>(Arrays.asList("Ataque com machado")));
        System.out.println(guerreiro);
        System.out.println(guerreiro.aprenderHabilidade());

        mago = new Mago("Mago de Gelo", 15, 27, 30, 15, 30, 1, new ArrayList<>(Arrays.asList("Congelamento")));
        System.out.println(mago);

        guerreiro.ivlUp();
        guerreiro.aprenderHabilidade();
        guerreiro.attack();
        guerreiro1 = new Personagem();

        mago = new Personagem();


        System.out.println("Quantidade de personagens: " + Personagem.quantdPersonagem);


    }
}
