package Exc07;

public class Gerente extends Funcionario {
    public Gerente(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }

    public double bonificacao() {
        return super.salario + 10000.00;
    }
}

