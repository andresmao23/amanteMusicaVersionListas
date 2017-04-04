package excepciones;

/**
 *
 * @author asus
 */
public class DAOException extends RuntimeException{

    public DAOException() {
    }

    public DAOException(String msj) {
        super(msj);
    }

    public DAOException(String msj, Throwable causa) {
        super(msj, causa);
    }

    public DAOException(Throwable causa) {
        super(causa);
    }
    
}
