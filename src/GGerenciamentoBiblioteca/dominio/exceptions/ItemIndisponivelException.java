package GGerenciamentoBiblioteca.dominio.exceptions;

public class ItemIndisponivelException extends RuntimeException {
    public ItemIndisponivelException(String mensage) {
        super(mensage);
    }
}
