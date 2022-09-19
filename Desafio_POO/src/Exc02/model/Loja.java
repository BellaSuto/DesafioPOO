package Exc02.model;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private String cnpj;
    private List<Livro> livros = new ArrayList<Livro>();
    private List<VideoGame> videoGames = new ArrayList<VideoGame>();

    public Loja() {
    }

    public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.livros = livros;
        this.videoGames = videoGames;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public List<VideoGame> getVideoGames() {
        return videoGames;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void setVideoGames(List<VideoGame> videoGames) {
        this.videoGames = videoGames;
    }

    public void listaLivros() {
        if (livros.isEmpty() == true) {
            System.out.println("A loja não tem livros no seu estoque");
        } else System.out.println(livros.toString());
    }

    public void listaVideoGames() {
        if (videoGames.isEmpty() == true) {
            System.out.println("A loja não tem video-games no seu estoque");
        } else System.out.println(videoGames.toString());
    }

    public double calculaPatrimonio() {
        double totalLivros = 0;
        double totalGames = 0;

        for (int i = 0; i < livros.size(); i++) {
            totalLivros = livros.get(i).getQtd() * livros.get(i).getPreco() + totalLivros++;
        }
        for (int i = 0; i < videoGames.size(); i++) {
            totalGames = videoGames.get(i).getQtd() * videoGames.get(i).getPreco() + totalGames++;
        }
        double patrimonio = totalLivros + totalGames;

        System.out.println("R$: " + patrimonio);
        return 0;
    }
}
