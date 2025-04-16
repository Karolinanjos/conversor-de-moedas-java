package exceptions;

public class ErroDeConversaoDeMoedaException extends RuntimeException {
    private String mensagem;

    public ErroDeConversaoDeMoedaException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
