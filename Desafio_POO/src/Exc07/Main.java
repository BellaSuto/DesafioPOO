package Exc07;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Alan", 48,6000.00);
        Supervisor sp = new Supervisor("Ada", 34,4000.00);
        Vendedor vd = new Vendedor("Bill", 53, 1970.00);

        System.out.println(gerente+"-Bonificação: "+gerente.bonificacao());
        System.out.println(sp+"-Bonificação: "+sp.bonificacao());
        System.out.println(vd+"-Bonificação: "+vd.bonificacao());

    }
}
