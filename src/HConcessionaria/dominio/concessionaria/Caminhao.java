package HConcessionaria.dominio.concessionaria;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double preco, TipoVeiculo tipoVeiculo, double capacidadeCarga) {
        super(marca, modelo, ano, preco, tipoVeiculo);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public String getDetalhes() {
        return "=======DESCRIÇÃO DO CARRO=========" + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "Preço: " + getPreco() + "Carga Suportada: " + this.capacidadeCarga + "Tipo: " + getTipoVeiculo().descricao;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    public void setCapacidadeCarga(double capacidadeCarga) {
        this.capacidadeCarga = capacidadeCarga;
    }
}
