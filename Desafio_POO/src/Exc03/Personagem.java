package Exc03;

public class Personagem {
    private String nome;
    private int vida;
    private int mana;
    private float xp;
    private int inteligencia;
    private int forca;
    private int level;

    public static int quantdPersonagem;

    public Personagem() {
        quantdPersonagem++;
    }

    public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
        this.nome = nome;
        this.vida = vida;
        this.mana = mana;
        this.xp = xp;
        this.inteligencia = inteligencia;
        this.forca = forca;
        this.level = level;
        this.quantdPersonagem = quantdPersonagem++;
    }

    public int getQuantdPersonagem() {
        for (int i = 0; i < quantdPersonagem; i++) {
            return quantdPersonagem++;
        }
        return 0;
    }

    public void setQuantdPersonagem(int quantdPersonagem) {
        this.quantdPersonagem = quantdPersonagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public float getXp() {
        return xp;
    }

    public void setXp(float xp) {
        this.xp = xp;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void ivlUp() {

    }

    @Override
    public String toString() {
        return "Personagem{" +
                "nome='" + nome + '\'' +
                ", vida=" + vida +
                ", mana=" + mana +
                ", xp=" + xp +
                ", inteligencia=" + inteligencia +
                ", forca=" + forca +
                ", level=" + level +
                '}';
    }
}
