package BLeaoDaReceita.dominio;

public class PessoaJuridica extends Contribuinte {
    private String cnpj;

    public PessoaJuridica() {
        this.cnpj = cnpj;
    }

    @Override
    public void calcularImposto() {
        double impostoSobRendaBruta = (rendaBruta * 0.10);
        System.out.println("Imposto De Pessoa Juridica é 10%: " + impostoSobRendaBruta);
    }

    @Override
    public String toString() {
        return "-------Pessoa Juridica-------\n" +
                "CNPJ = '" + cnpj + '\'' +
                "\nNome = '" + nome + '\'' +
                "\nRenda Bruta = " + rendaBruta +
                ' ';
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
