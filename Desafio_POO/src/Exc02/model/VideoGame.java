package Exc02.model;

import Exc02.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
    private String marca;
    private String modelo;
    private boolean isUsado;

    public VideoGame() {
    }

    public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
        super(nome, preco, qtd);
        this.marca = marca;
        this.modelo = modelo;
        this.isUsado = isUsado;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isUsado() {
        return isUsado;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setUsado(boolean usado) {
        isUsado = usado;
    }

    @Override
    public String toString() {
        return "Video-game: "+ getModelo()+", "+getPreco()+", "+getQtd()+" em estoque\n";
    }

    @Override
    public double calcularImposto() {
        if (isUsado == true) {
            return getPreco() * 0.25;
        } else return getPreco() * 0.45;

    }
}
