
public class NumNegativoException extends Exception {

    // constrói um objeto NumeroNegativoException com a mensagem passada por parâmetro
    public NumNegativoException(String msg){
        super(msg);
    }

    // contrói um objeto NumeroNegativoException com mensagem e a causa dessa exceção, utilizado para encadear exceptions
    public NumNegativoException(String msg, Throwable cause){
        super(msg, cause);
    }
}
