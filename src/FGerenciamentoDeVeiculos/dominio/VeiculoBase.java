package FGerenciamentoDeVeiculos.dominio;

public abstract class VeiculoBase implements Veiculo {
    private String modelo;
    private String marca;
    TipoCombustivel tipoCombustivel;
    private double eficiencia;
    private double quilometrosPorHora;
    private final double VELOCIDADE_MAXIMA = 280;

    public VeiculoBase(String modelo, String marca, TipoCombustivel tipoCombustivel, double eficiencia) {
        this.modelo = modelo;
        this.marca = marca;
        this.tipoCombustivel = tipoCombustivel;
        this.eficiencia = eficiencia;
        this.quilometrosPorHora = 0;
    }

    @Override
    public void frear() {
        if (this.quilometrosPorHora == 0) {
            System.out.println("O carro está parado");
        } else {
            System.out.println("O carro está freando!!");
            this.quilometrosPorHora -= 10;
            System.out.println("VELOCIDADE ATUAL: " + this.quilometrosPorHora);
        }
    }

    @Override
    public void acelerar() {
        if (this.quilometrosPorHora < this.VELOCIDADE_MAXIMA) {
            System.out.println("Acelerando o carro!!");
            this.quilometrosPorHora += 10;
        }else {
            System.out.println("VELOCIDADE MAXIMA ATINGIDA");
        }
    }

    @Override
    public String toString() {
        return "=======INFORMAÇÕES-BASE-DO-VEICULO======== " +
                "\nModelo = " + modelo + '\'' +
                "\nMarca = " + marca + '\'' +
                "\nTipo Combustivel = " + tipoCombustivel +
                "\nEficiencia = " + eficiencia +
                ' ';
    }

    public double getQuilometrosPorHora() {
        return quilometrosPorHora;
    }

    public double getVELOCIDADE_MAXIMA() {
        return VELOCIDADE_MAXIMA;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoCombustivel getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(TipoCombustivel tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    public void setEficiencia(double eficiencia) {
        this.eficiencia = eficiencia;
    }
}
