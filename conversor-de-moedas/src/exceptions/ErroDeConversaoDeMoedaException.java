package exceptions;

public class ErroDeConversaoDeMoedaException extends RuntimeException {
    public ErroDeConversaoDeMoedaException(String mensagem) {
        super(mensagem);
    }
}
