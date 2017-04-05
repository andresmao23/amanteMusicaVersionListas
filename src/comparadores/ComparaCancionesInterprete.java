package comparadores;

import java.util.Comparator;
import objetosNegocio.Cancion;

/**
 *
 * @author asus
 */
public class ComparaCancionesInterprete implements Comparator<Cancion>{

    @Override
    public int compare(Cancion c1, Cancion c2) {
        return c1.getInterprete().compareTo(c2.getInterprete());
    }
    
}
