package HGerenciamentoBiblioteca.dominio.exceptions;

public class UsuarioNaoCadastradoException extends RuntimeException {
    public UsuarioNaoCadastradoException(String message) {
        super(message);
    }
}
