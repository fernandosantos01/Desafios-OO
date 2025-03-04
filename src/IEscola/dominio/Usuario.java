package IEscola.dominio;

public abstract class Usuario implements Pessoa{
    private String nome;
    private String documento;

    public Usuario(String nome, String documento) {
        this.nome = nome;
        this.documento = documento;
    }

    @Override
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
