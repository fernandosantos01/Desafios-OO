package LeaoDaReceita.dominio;

public class PessoaFisica extends Contribuinte {
    private String cpf;
    @Override
    public void calcularImposto() {
        double impostoSobRendaBruta;
        if (rendaBruta <= 1400) {
            System.out.println("ISENTO!!");
        } else if (rendaBruta > 1400 && rendaBruta <= 2100) {
            impostoSobRendaBruta = (rendaBruta * 0.10);
            System.out.println("Foi aplicado 10% de imposto sobre a renda bruta: " + impostoSobRendaBruta);
        } else if (rendaBruta > 2100 && rendaBruta <= 2800) {
            impostoSobRendaBruta = (rendaBruta * 0.15);
            System.out.println("Foi aplicado 15% de impostosobre a renda bruta: " + impostoSobRendaBruta);
        } else if (rendaBruta > 2800 && rendaBruta <= 3600) {
            impostoSobRendaBruta = (rendaBruta * 0.25);
            System.out.println("Foi aplicado 25% de imposto sobre a renda bruta: " + impostoSobRendaBruta);
        } else if (rendaBruta > 3600) {
            impostoSobRendaBruta = (rendaBruta * 0.30);
            System.out.println("Foi aplicado 30% de imposto sobre a renda bruta: " + impostoSobRendaBruta);
        }
    }
    @Override
    public String toString() {
        return "-------Pessoa Fisica-------\n" +
                "CPF = '" + cpf + '\'' +
                "\nNome = '" + nome + '\'' +
                "\nRenda Bruta = " + rendaBruta +
                ' ';
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
