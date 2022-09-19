package Exc03;

import java.util.List;
import java.util.Random;

public class Guerreiro extends Personagem {

    public Guerreiro(List<String> habilidade) {
        Habilidade = habilidade;
    }

    public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> habilidade) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        Habilidade = habilidade;
    }

    List<String> Habilidade;

    public List<String> getHabilidade() {
        return Habilidade;
    }

    public void setHabilidade(List<String> habilidade) {
        Habilidade = habilidade;
    }

    public void lvlUp() {
        super.setVida(getVida() + 1);
        super.setForca(getForca() + 1);

    }

    public int attack() {
        Random random = new Random();
        return (super.getVida() * super.getForca()) + random.nextInt(300);

    }

    public String aprenderHabilidade() {
        return "Habilidade aprendida: Escudo";
    }

    @Override
    public String toString() {
        return "Guerreiro{" +
                "nome= " + this.getNome() + '\'' +
                ", vida=" + this.getVida() +
                ", mana=" + this.getMana() +
                ", xp=" + this.getXp() +
                ", inteligencia=" + this.getInteligencia() +
                ", forca=" + this.getForca() +
                ", level=" + this.getLevel() +
                ", Habilidade=" + Habilidade +
                '}';
    }
}
