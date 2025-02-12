package HConcessionaria.dominio.concessionaria;

public abstract class Veiculo implements Vendavel {
    private String marca;
    private String modelo;
    private int ano;
    private double preco;
    TipoVeiculo tipoVeiculo;

    public Veiculo(String marca, String modelo, int ano, double preco, TipoVeiculo tipoVeiculo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.preco = preco;
        this.tipoVeiculo = tipoVeiculo;
    }

    public abstract String getDetalhes();

    @Override
    public String getDescricao() {
        return "=======DESCRIÇÃO DO CARRO=========" + "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAno: " + this.ano + "\nPreço: " + this.preco + "\nTipo: " + getTipoVeiculo().descricao;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public TipoVeiculo getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
}
