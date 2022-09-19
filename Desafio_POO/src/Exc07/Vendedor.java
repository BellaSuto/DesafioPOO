package Exc07;

public class Vendedor extends Funcionario{
    public Vendedor(String nome, int idade, double salario) {
        super(nome, idade, salario);
    }
    public double bonificacao(){
        return super.salario + 3000.00;
    }
}
