package HConcessionaria.dominio.concessionaria;

public class Moto extends Veiculo {
    private boolean possuiPartidaEletrica;

    public Moto(String marca, String modelo, int ano, double preco, TipoVeiculo tipoVeiculo, boolean possuiPartidaEletrica) {
        super(marca, modelo, ano, preco, tipoVeiculo);
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }

    @Override
    public String getDetalhes() {
        return "=======DESCRIÇÃO DO CARRO=========" + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "Preço: " + getPreco() + "Partida eletrica: " + this.possuiPartidaEletrica + "Tipo: " + getTipoVeiculo().descricao;

    }

    public boolean isPossuiPartidaEletrica() {
        return possuiPartidaEletrica;
    }

    public void setPossuiPartidaEletrica(boolean possuiPartidaEletrica) {
        this.possuiPartidaEletrica = possuiPartidaEletrica;
    }
}
