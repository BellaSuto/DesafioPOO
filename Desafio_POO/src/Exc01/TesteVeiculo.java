package Exc01;

public class TesteVeiculo {
    public static void main(String[] args) {

        Veiculo carro = new Veiculo();
        carro.setMarca("Honda");
        carro.setModelo("HB20");
        carro.setPlaca("5546");
        carro.setCor("Vermelho");
        carro.setKm(456);
        carro.setLigado(true);
        carro.setLitrosCombustivel(20);
        carro.setVelocidade(80);

        System.out.println(carro.getMarca() + "-" + carro.getModelo() + "-" + carro.getCor() + " | velocidade: " + carro.getVelocidade());

        System.out.println("Velocidade após acelerar: " + carro.acelerar());
        carro.abastecer(5);
        carro.frear();
        carro.frear();
        carro.pintar("Preto");
        System.out.println("Cor nova: " + carro.getCor());
        carro.delisgar();

        System.out.println("---------------");

        Veiculo moto = new Veiculo();
        moto.setMarca("Honda");
        moto.setModelo("Biz");
        moto.setPlaca("5783");
        moto.setCor("Branca");
        moto.setKm(15.1f);
        moto.setLigado(false);
        moto.setLitrosCombustivel(1);
        moto.setVelocidade(30);
        System.out.println(moto.getMarca() + "-" + moto.getModelo() + "-" + moto.getCor() + " | velocidade: " + moto.getVelocidade());

        System.out.println("Velocidade após acelerar: " + moto.acelerar());
        moto.abastecer(3);
        moto.frear();
        moto.pintar("Amarelo");
        System.out.println("Cor nova: " + moto.getCor());
        moto.ligar();


    }
}
