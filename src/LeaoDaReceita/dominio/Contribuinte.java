package LeaoDaReceita.dominio;

public abstract class Contribuinte {
    protected String nome;
    protected float rendaBruta;

    public Contribuinte() {
        this.nome = nome;
        this.rendaBruta = rendaBruta;
    }

    public abstract void calcularImposto();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getRendaBruta() {
        return rendaBruta;
    }

    public void setRendaBruta(float rendaBruta) {
        if (rendaBruta < 0) {
            System.out.println("VALOR INVALIDO!!!");
        } else {
            this.rendaBruta = rendaBruta;
        }
    }
}
