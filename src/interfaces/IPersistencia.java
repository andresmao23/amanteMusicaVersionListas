package interfaces;

import excepciones.PersistenciaException;
import java.util.List;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;
import objetosNegocio.Pelicula;

/**
 *
 * @author asus
 */
public interface IPersistencia {
    
    public Cancion obten(Cancion cancion) throws PersistenciaException;
    
    public void agrega(Cancion cancion) throws PersistenciaException;
    
    public void actualiza(Cancion cancion) throws PersistenciaException;
    
    public void elimina(Cancion cancion) throws PersistenciaException;
    
    public Pelicula obten(Pelicula pelicula) throws PersistenciaException;
    
    public void agrega(Pelicula pelicula) throws PersistenciaException;
    
    public void actualiza(Pelicula pelicula) throws PersistenciaException;
    
    public void elimina(Pelicula pelicula) throws PersistenciaException;
    
    public Genero obten(Genero genero) throws PersistenciaException;
    
    public void agrega(Genero genero) throws PersistenciaException;
    
    public void actualiza(Genero genero) throws PersistenciaException;
    
    public void elimina(Genero genero) throws PersistenciaException;
    
    public List<Cancion> consultaCanciones() throws PersistenciaException;
    
    public List<Cancion> consultaCancionesTitulo(String titulo) throws PersistenciaException;
    
    public List<Cancion> consultaCancionesInterprete(String interprete) throws PersistenciaException;
    
    public List<Cancion> consultaCancionesAutor(String autor) throws PersistenciaException;
    
    public List<Cancion> consultaCancionesGenero(String cveGenero) throws PersistenciaException;
    
    public List<Cancion> consultaCancionesAlbum(String album) throws PersistenciaException;
    
    public List<Pelicula> consultaPeliculas() throws PersistenciaException;
    
    public List<Pelicula> consultaPeliculasTitulo(String titulo) throws PersistenciaException;
    
    public List<Pelicula> consultaPeliculasActor(String actor) throws PersistenciaException;
    
    public List<Pelicula> consultaPeliculasDirector(String director) throws PersistenciaException;
    
    public List<Pelicula> consultaPeliculasGenero(String cveGenero) throws PersistenciaException;
    
    public List<Genero> consultaGeneros() throws PersistenciaException;
    
    public List<Genero> consultaGenerosCanciones() throws PersistenciaException;
    
    public List<Genero> consultaGenerosPeliculas() throws PersistenciaException;
    
}
