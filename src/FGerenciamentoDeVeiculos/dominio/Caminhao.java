package FGerenciamentoDeVeiculos.dominio;

public class Caminhao extends VeiculoBase{
    private double capacidadeCarga;

    public Caminhao(String modelo, String marca, TipoCombustivel tipoCombustivel, double eficiencia, double capacidadeCarga) {
        super(modelo, marca, tipoCombustivel, eficiencia);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public double calcularConsumo() {
        return getEficiencia() * 0.7;
    }
    @Override
    public String toString() {
        return "=======INFORMAÇÕES DO CAMINHÃO========" +
                "\nCapacidade de Carga = " + capacidadeCarga +
                "\nTipo Combustivel = " + tipoCombustivel +
                ' ';
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
