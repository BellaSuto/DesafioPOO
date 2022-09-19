package Exc01;

public class Veiculo {
    private String marca, modelo, placa, cor;
    private float km;
    private boolean isLigado;
    private int litrosCombustivel, velocidade;
    private double preco;

    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int litrosCombustivel, int velocidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.litrosCombustivel = litrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public Veiculo() {

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getLitrosCombustivel() {
        return litrosCombustivel;
    }

    public void setLitrosCombustivel(int litrosCombustivel) {
        this.litrosCombustivel = litrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int acelerar() {
        int x = 20;
        return velocidade = velocidade + x;
    }

    public int abastecer(int qtdCombustivel) {
        int qtdTotalCombustivel = getLitrosCombustivel() + qtdCombustivel;
        if (qtdTotalCombustivel < 60) {
            System.out.println("Combustivel atual: " + qtdTotalCombustivel);
        } else
            System.out.println("O limite do tanque de combustível é de 60 litros! o tanque ja possui: " + getLitrosCombustivel() + " litros");
        return 0;
    }

    public void frear() {
        if (isLigado == true) {
            int i = 20;
            velocidade = velocidade - i--;
            System.out.println("Velocidade após freiar: " + velocidade);
        } else System.out.println("O veículo está parado!");
    }


    public String pintar(String novaCor) {
        return cor = novaCor;
    }

    public void ligar() {
        if (isLigado() == false) {
            isLigado = true;
            System.out.println("Veículo ligado");
        }
    }

    public void delisgar() {
        if (isLigado == true && velocidade == 0) {
            isLigado = false;
            System.out.println("Veículo desligado");
        } else System.out.println("Não é possível desligar veículo");
    }
}
