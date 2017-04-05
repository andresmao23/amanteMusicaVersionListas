package comparadores;

import java.util.Comparator;
import objetosNegocio.Medio;

/**
 *
 * @author asus
 */
public class ComparaMediosClave implements Comparator<Medio> {

    @Override
    public int compare(Medio m1, Medio m2) {
        return m1.getClave().compareTo(m2.getClave());
    }
    
}
