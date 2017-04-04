package dao;

import excepciones.PersistenciaException;
import java.util.Vector;
import objetosNegocio.Genero;

/**
 *
 * @author asus
 */
public class Generos {
    
    protected Genero []generos;
    protected int numGeneros = 0;
    
    public Generos(int tamCatalogo){
        generos = new Genero[tamCatalogo];
    }
    
    public int indice(Genero genero){
        for (int i = 0; i < numGeneros; i++) {
            if(genero.equals(generos[i])) return i;
        }
        return -1;
    }
    
    public Genero obten(Genero genero){
        int pos = indice(genero);
        
        if(pos >= 0) return generos[pos];
        
        return null;
    }
    
    public void agrega(Genero genero) throws PersistenciaException{
        if(numGeneros >= generos.length)
            throw new PersistenciaException("Arreglo lleno");
        
        generos[numGeneros] = genero;
        numGeneros++;
    }
    
    public void actualiza(Genero genero) throws PersistenciaException{
        int pos = indice(genero);
        
        if(pos < 0) throw new PersistenciaException("Genero inexistente");
        
        generos[pos] = genero;
    }
    
    public void elimina(Genero genero){
        int pos = indice(genero);
        
        if(pos < 0) throw new PersistenciaException("Genero a eliminar no inexiste");
        
        generos[pos] = null;
        empaca();
    }

    private void empaca() {
        for (int i = 0; i < numGeneros; i++) {
            if(generos[i] == null){
                for (int j = i; j < numGeneros-1; j++) {
                    generos[j] = generos[j+1];
                }
                numGeneros--;
            }
        }
    }
    
    public Vector lista(){
        Vector lista = new Vector();
        
        for (int i = 0; i < numGeneros; i++) {
            lista.add(generos[i]);
        }
        
        return lista;
    }
    
    public Vector listaMedio(char tipoMedio){
        Vector lista = new Vector();
        
        for (int i = 0; i < numGeneros; i++) {
            if(tipoMedio == generos[i].getTipoMedio())
                lista.add(generos[i]);
        }
        
        return lista;
    }
    
}
