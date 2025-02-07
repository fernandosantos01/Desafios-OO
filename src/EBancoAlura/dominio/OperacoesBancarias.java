package EBancoAlura.dominio;

public interface OperacoesBancarias {
    void saca(double valor);
    void deposita(double valor);
    boolean transferencia(Conta conta, double valor);
}
