package Exc02.model;

import Exc02.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
    private String autor;
    private String tema;
    private int qtdPag;

    public Livro() {
    }

    public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
        super(nome, preco, qtd);
        this.autor = autor;
        this.tema = tema;
        this.qtdPag = qtdPag;
    }

    public String getAutor() {
        return autor;
    }

    public String getTema() {
        return tema;
    }

    public int getQtdPag() {
        return qtdPag;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public void setQtdPag(int qtdPag) {
        this.qtdPag = qtdPag;
    }


    @Override
    public String toString() {
        return "Titulo: " + getNome() + ", preço: " + getPreco() + ", quantidade: " + getQtd() + " em estoque\n";
    }

    @Override
    public double calcularImposto() {
        if (getTema() == "educativo") {
            System.out.println("Livro educativo não tem impostos: " + getNome());
        } else System.out.println("R$ " + getPreco() * 0.1 + " sobre o livro " + getNome());
        return 0;
    }
}
