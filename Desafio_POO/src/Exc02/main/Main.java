package Exc02.main;

import Exc02.model.Livro;
import Exc02.model.Loja;
import Exc02.model.VideoGame;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Loja loja = new Loja();
        Livro l1 = new Livro("Harry Potter", 40.00, 50, "J. K. Rowling", "fantasia", 300);
        Livro l2 = new Livro("Senhor dos Aneis", 60.00, 30, "J. R. R. Tolkien", "fantasia", 500);
        Livro l3 = new Livro("Java POO", 20.00, 50, "GFT", "educativo", 500);


        VideoGame ps4 = new VideoGame("PS4", 1800.00, 100, "Sony", "Slim", false);
        VideoGame ps4Usado = new VideoGame("PS4", 1000.00, 7, "Sony", "Slim", true);
        VideoGame xbox = new VideoGame("XBOX", 1500.00, 500, "Microsoft", "One", false);

        List<Livro> livros = new ArrayList<>();
        livros.add(l1);
        livros.add(l2);
        livros.add(l3);

        List<VideoGame> videoGames = new ArrayList<>();
        videoGames.add(ps4);
        videoGames.add(ps4Usado);
        videoGames.add(xbox);

        Loja americanas = new Loja("Americanas", "12345678", livros, videoGames);

        l2.calcularImposto();
        l3.calcularImposto();

        ps4Usado.calcularImposto();
        ps4.calcularImposto();

        System.out.println("----------------------------------------");
        System.out.println("A loja " + americanas.getNome() + " possui os seguintes livros para venda: ");
        americanas.listaLivros();
        System.out.println("----------------------------------------");
        System.out.println("A loja " + americanas.getNome() + " possui os seguintes video-games para venda: ");
        americanas.listaVideoGames();
        System.out.println("----------------------------------------");
        System.out.print("O patrimonio da loja: " + americanas.getNome() + "é de ");
        americanas.calculaPatrimonio();

    }
}