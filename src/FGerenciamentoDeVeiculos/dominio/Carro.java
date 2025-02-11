package FGerenciamentoDeVeiculos.dominio;

public class Carro extends VeiculoBase {
    private int numeroPortas;

    public Carro(String modelo, String marca, TipoCombustivel tipoCombustivel, double eficiencia, int numeroPortas) {
        super(modelo, marca, tipoCombustivel, eficiencia);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public double calcularConsumo() {
        return getEficiencia() * 0.9;
    }
    @Override
    public String toString() {
        return "=======INFORMAÇÕES DO CARRO========" +
                "\nNumero de Portas = " + numeroPortas +
                "\nTipo Combustivel = " + tipoCombustivel +
                ' ';
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
