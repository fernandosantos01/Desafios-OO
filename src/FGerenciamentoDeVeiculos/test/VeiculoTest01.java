package FGerenciamentoDeVeiculos.test;

import FGerenciamentoDeVeiculos.dominio.*;

import java.util.ArrayList;
import java.util.List;

public class VeiculoTest01 {
    public static void main(String[] args) {
        Moto moto = new Moto("X-FACTOR", "YAMAHA", TipoCombustivel.ELETRICO, 35.0, true);
        Carro carro = new Carro("Onix", "Chevrolet", TipoCombustivel.GASOLINA, 12.0, 4);
        Caminhao caminhao = new Caminhao("56-tx", "Volvo", TipoCombustivel.DIESEL, 5.0, 10000.0);

        List<Veiculo>veiculos = new ArrayList<>();
        veiculos.add(moto);
        veiculos.add(caminhao);
        veiculos.add(carro);

        for(Veiculo veiculo: veiculos){
            veiculo.acelerar();
            veiculo.acelerar();
            veiculo.frear();
            System.out.println(veiculo);
            System.out.println(veiculo.calcularConsumo()+"Km/l");
        }
    }
}
