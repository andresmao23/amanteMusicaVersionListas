package comparadores;

import java.util.Comparator;
import objetosNegocio.Cancion;

/**
 *
 * @author asus
 */
public class ComparaCancionesAlbum implements Comparator<Cancion>{

    @Override
    public int compare(Cancion c1, Cancion c2) {
        return c1.getAlbum().compareTo(c2.getAlbum());
    }
    
}
