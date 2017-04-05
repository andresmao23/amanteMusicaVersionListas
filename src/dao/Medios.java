package dao;

import excepciones.DAOException;
import excepciones.PersistenciaException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import objetosNegocio.Medio;

/**
 *
 * @author asus
 */
public class Medios {
    
    protected List<Medio> medios;
    
    public Medios(){
        medios = new ArrayList<Medio>();
    }
    
    public Medio obten(Medio medio){
        int pos = medios.indexOf(medio);
        
        if(pos >= 0) return medios.get(pos);
        
        return null;
    }
    
    public void agrega(Medio medio){
        medios.add(medio);
    }
    
    public void actualiza(Medio medio) throws DAOException {
        int pos = medios.indexOf(medio);
        
        if(pos < 0) throw new DAOException("Medio inexistente");
        
        medios.set(pos, medio);
    }
    
    public void elimina(Medio medio) throws DAOException {
        if(!medios.remove(medio)) throw new DAOException("La canción o película no existe");
    }
    
    public List lista(){
        return medios;
    }
    
    public List listaTitulo(String titulo){
        List<Medio> lista = new ArrayList<Medio>();
        
        for(Iterator<Medio> iterador = medios.iterator(); iterador.hasNext(); ){
            Medio medio = iterador.next();
            
            if(titulo.equals(medio.getTitulo()))
                lista.add(medio);
        }
        return lista;
    }
    
    public List listaGenero(String cveGenero){
        List<Medio> lista = new ArrayList<Medio>();
        
        for(Iterator<Medio> iterador = medios.iterator(); iterador.hasNext(); ){
            Medio medio = iterador.next();
            
            if(cveGenero.equals(medio.getGenero().getCveGenero()))
                lista.add(medio);
        }
        return lista;
    }
    
}
