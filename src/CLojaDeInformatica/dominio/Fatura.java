package CLojaDeInformatica.dominio;

public class Fatura {
    private String numero;
    private String descricao;
    private int quantComprada;
    private double precoPorItem;

    public Fatura(String numero, String descricao, int quantComprada, double precoPorItem) {
        this.numero = numero;
        this.descricao = descricao;
        this.quantComprada = quantComprada;
        this.precoPorItem = precoPorItem;
    }

    public double getTotalFatura() {
        double precoFinal = 0;
        if (this.precoPorItem < 0) {
            precoFinal = 0.0;
        } else if (this.quantComprada < 0) {
            precoFinal = 0;
        } else if (this.quantComprada > 0 && this.precoPorItem > 0) {
            precoFinal = this.precoPorItem * quantComprada;
        }
        return precoFinal;
    }

    @Override
    public String toString() {
        return "Fatura{" +
                "numero='" + numero + '\'' +
                ", descricao='" + descricao + '\'' +
                ", quantComprada=" + quantComprada +
                ", precoPorItem=" + precoPorItem +
                '}';
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }

    public double getPrecoPorItem() {
        return precoPorItem;
    }

    public void setPrecoPorItem(double precoPorItem) {
        this.precoPorItem = precoPorItem;
    }
}
