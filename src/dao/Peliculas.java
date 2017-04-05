/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import objetosNegocio.Medio;
import objetosNegocio.Pelicula;

/**
 *
 * @author asus
 */
public class Peliculas extends Medios {
    
    private List<Medio> peliculas;

    public Peliculas() {
        peliculas = medios;
    }
    
    public Pelicula obten(Pelicula pelicula){
        return (Pelicula) super.obten(pelicula);
    }
    
    public List<Pelicula> listaActor(String actor){
        List<Pelicula> lista = new ArrayList<Pelicula>();
        
        for(Iterator<Medio> iterador = peliculas.iterator(); iterador.hasNext();)        {
            Pelicula pelicula = (Pelicula) iterador.next();
            if(actor.equals(pelicula.getActor1()) || actor.equals(pelicula.getActor2()))
                lista.add(pelicula);
        }
        return lista;
    }
    
    public List<Pelicula> listaDirector(String director){
        List<Pelicula> lista = new ArrayList<Pelicula>();
        
        for(Iterator<Medio> iterador = peliculas.iterator(); iterador.hasNext();)        {
            Pelicula pelicula = (Pelicula) iterador.next();
            if(director.equals(pelicula.getDirector()) || director.equals(pelicula.getDirector()))
                lista.add(pelicula);
        }
        return lista;
    }
    
}
