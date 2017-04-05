package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import objetosNegocio.Cancion;
import objetosNegocio.Medio;

/**
 *
 * @author asus
 */
public class Canciones extends Medios {
    
    private List<Medio> canciones;

    public Canciones() {
        canciones = medios;
    }
    
    public Cancion obten(Cancion cancion){
        return (Cancion) super.obten(cancion);
    }
    
    public List<Cancion> listaInterprete(String interprete){
        List<Cancion> lista = new ArrayList<Cancion>();
        
        for(Iterator<Medio> iterador = canciones.iterator(); iterador.hasNext();){
            Cancion cancion = (Cancion) iterador.next();
            if(interprete.equals(cancion.getInterprete()))
                lista.add(cancion);
        }
        
        return lista;
    }
    
    public List<Cancion> listaAutor(String autor){
        List<Cancion> lista = new ArrayList<Cancion>();
        
        for(Iterator<Medio> iterador = canciones.iterator(); iterador.hasNext();){
            Cancion cancion = (Cancion) iterador.next();
            if(autor.equals(cancion.getAutor()))
                lista.add(cancion);
        }
        
        return lista;
    }
    
    public List<Cancion> listaAlbum(String album){
        List<Cancion> lista = new ArrayList<Cancion>();
        
        for(Iterator<Medio> iterador = canciones.iterator(); iterador.hasNext();){
            Cancion cancion = (Cancion) iterador.next();
            if(album.equals(cancion.getAlbum()))
                lista.add(cancion);
        }
        
        return lista;
    }
    
}
