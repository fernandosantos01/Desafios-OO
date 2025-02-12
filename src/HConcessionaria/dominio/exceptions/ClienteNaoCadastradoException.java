package HConcessionaria.dominio.exceptions;

public class ClienteNaoCadastradoException extends RuntimeException {
    public ClienteNaoCadastradoException(String message) {
        super(message);
    }
}
