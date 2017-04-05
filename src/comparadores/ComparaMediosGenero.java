package comparadores;

import java.util.Comparator;
import objetosNegocio.Medio;

/**
 *
 * @author asus
 */
public class ComparaMediosGenero implements Comparator<Medio>{

    @Override
    public int compare(Medio m1, Medio m2) {
        return m1.getGenero().getCveGenero().compareTo(m2.getGenero().getCveGenero());
    }
    
}
