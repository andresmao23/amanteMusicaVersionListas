package dao;

import com.sun.javafx.scene.control.skin.VirtualFlow;
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
    
    /*protected Medio []medios;
    protected int numMedios = 0;
    
    public int indice(Medio medio){
        for (int i = 0; i < numMedios; i++) {
            if(medio.equals(medios[i])) return i;
        }
        return -1;
    }
    
    public Medio obten(Medio medio){
        int pos = indice(medio);
        
        if(pos <= 0) return medios[pos];
        
        return null;
    }
    
    public void agrega(Medio medio) throws PersistenciaException {
        if(numMedios >= medios.length)
            throw new PersistenciaException("Arreglo lleno");
        
        medios[numMedios] = medio;
        numMedios++;
    }
    
    public void actualiza(Medio medio) throws PersistenciaException {
        int pos = indice(medio);
        
        if(pos < 0)
            throw new PersistenciaException("Medio inexistente");
        
        medios[pos] = medio;
    }
    
    public void elimina(Medio medio) throws PersistenciaException {
        int pos = indice(medio);
        
        if(pos < 0)
            throw new PersistenciaException("La canción o película no existe");
        
        medios[pos] = null;
        empaca();
    }

    private void empaca() {
        for (int i = 0; i < numMedios; i++) {
            if(medios[i] == null){
                for (int j = i; j < numMedios-1; j++) {
                    medios[j] = medios[j+1];
                }
                numMedios--;
            }
        }
    }
    
    public Vector lista(){
        Vector lista = new Vector();
        for (int i = 0; i < numMedios; i++) {
            lista.add(medios[i]);
        }
        return lista;
    }
    
    public Vector listaTitulo(String titulo){
        Vector lista = new Vector();
        for (int i = 0; i < numMedios; i++) {
            if(titulo.equals(medios[i].getTitulo()))
                lista.add(medios[i]);
        }
        return lista;
    }
    
    public Vector listaGenero(String cveGenero){
        Vector lista = new Vector();
        for (int i = 0; i < numMedios; i++) {
            if(cveGenero.equals(medios[i].getGenero().getCveGenero()))
                lista.add(medios[i]);
        }
        return lista;
    }*/
    
}
