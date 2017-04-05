package dao;

import excepciones.DAOException;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import objetosNegocio.Genero;

/**
 *
 * @author asus
 */
public class Generos {
    
    protected List<Genero> generos;

    public Generos() {
        generos = new ArrayList<>();
    }
    
    public Genero obten(Genero genero){
        int pos = generos.indexOf(genero);
        
        if(pos >= 0) return generos.get(pos);
        
        return null;
    }
    
    public void agrega(Genero genero){
        generos.add(genero);
    }
    
    public void actualiza(Genero genero) throws DAOException{
        int pos = generos.indexOf(genero);
        
        if(pos < 0) throw new DAOException("Genero inexistente");
        
        generos.set(pos, genero);
    }
    
    public void elimina(Genero genero) throws DAOException{
        if(generos.remove(genero))
            throw new DAOException("Genero inexistente");
    }
    
    public List<Genero> lista(){
        return generos;
    }
    
    public List<Genero> listaMedio(char tipoMedio){
        List<Genero> lista = new ArrayList<>();
        
        for(Iterator<Genero> iterador = generos.iterator(); iterador.hasNext();){
            Genero genero = iterador.next();
            if(tipoMedio == genero.getTipoMedio())
                lista.add(genero);                        
        }
        return lista;
    }
    
}
