package FGerenciamentoDeVeiculos.dominio;

public class Moto extends VeiculoBase {
    private boolean possuiPartidaEletrica;

    public Moto(String modelo, String marca, TipoCombustivel tipoCombustivel, double eficiencia, boolean possuiPartidaEletrica) {
        super(modelo, marca, tipoCombustivel, eficiencia);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    @Override
    public double calcularConsumo() {
        System.out.println("====CONSUMO=====");
        return getEficiencia() * 1.1;
    }

    @Override
    public String toString() {
        return "=======INFORMAÇÕES DA MOTO========" +
                "\nPartida Eletrica = " + possuiPartidaEletrica +
                "\nTipo Combustivel = " + tipoCombustivel +
                ' ';
    }

    public boolean isPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }
}
