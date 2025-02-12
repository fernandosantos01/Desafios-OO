package HConcessionaria.dominio.concessionaria;

public class Carro extends Veiculo {
    private int numeroPortas;

    public Carro(String marca, String modelo, int ano, double preco, TipoVeiculo tipoVeiculo, int numeroPortas) {
        super(marca, modelo, ano, preco, tipoVeiculo);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public String getDetalhes() {
        return "=======DESCRIÇÃO DO CARRO=========" + "\nMarca: " + getMarca() + "\nModelo: " + getModelo() + "\nAno: " + getAno() + "Preço: " + getPreco() + "Numero De Portas: " + this.numeroPortas + "Tipo: " + getTipoVeiculo().descricao;

    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setNumeroPortas(int numeroPortas) {
        this.numeroPortas = numeroPortas;
    }
}
