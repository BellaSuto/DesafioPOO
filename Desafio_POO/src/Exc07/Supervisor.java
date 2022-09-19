package Exc07;

public class Supervisor extends Funcionario{
    public Supervisor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }
    public double bonificacao(){
        return super.salario + 5000.00;
    }
}
