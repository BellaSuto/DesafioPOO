package Exc03;

import java.util.List;
import java.util.Random;

public class Mago extends Personagem {
    private List<String> Magia;

    public Mago(List<String> magia) {
        super();
        Magia = magia;
    }

    public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magia) {
        super(nome, vida, mana, xp, inteligencia, forca, level);
        Magia = magia;
    }

    public List<String> getMagia() {
        return Magia;
    }

    public void setMagia(List<String> magia) {
        Magia = magia;
    }

    public void lvlUp() {
        super.setMana(getMana() + 1);
        super.setInteligencia(getInteligencia() + 1);
    }

    public int attack() {
        Random random = new Random();
        return (super.getInteligencia() * super.getLevel()) + random.nextInt(300);
    }

    public String aprenderMagia() {
        Magia.add("Fogo");
        Magia.add("Congelamento");
        Magia.add("Trovão");

        if ("Fogo".equals(Magia)) {
            System.out.println("Magia-Fogo aprendido");
        } else if ("Congelamento".equals(Magia)) {
            System.out.println("Magia-Congelamento aprendido");
        } else if ("Trovão".equals(Magia)) {
            System.out.println("Magia-Trovão aprendida");
        }
        return "Magia";
    }

    @Override
    public String toString() {
        return "Mago{" +
                "nome= " + this.getNome() + '\'' +
                ", vida=" + this.getVida() +
                ", mana=" + this.getMana() +
                ", xp=" + this.getXp() +
                ", inteligencia=" + this.getInteligencia() +
                ", forca=" + this.getForca() +
                ", level=" + this.getLevel() +
                ",Magia=" + Magia +
                '}';
    }
}
