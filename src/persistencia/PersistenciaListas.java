package persistencia;

import dao.Canciones;
import dao.Generos;
import dao.Peliculas;
import excepciones.DAOException;
import excepciones.PersistenciaException;
import interfaces.IPersistencia;
import java.util.List;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;
import objetosNegocio.Pelicula;

/**
 *
 * @author asus
 */
public class PersistenciaListas implements IPersistencia {

    private Generos catalogoGeneros;
    private Canciones catalogoCanciones;
    private Peliculas catalogoPeliculas;

    public PersistenciaListas() {
        catalogoGeneros = new Generos();
        catalogoCanciones = new Canciones();
        catalogoPeliculas = new Peliculas();
    }

    @Override
    public Cancion obten(Cancion cancion) throws PersistenciaException {
        return catalogoCanciones.obten(cancion);
    }

    @Override
    public void agrega(Cancion cancion) throws PersistenciaException {
        Cancion cancionBuscada;

        cancionBuscada = catalogoCanciones.obten(cancion);

        if (cancionBuscada != null) {
            throw new PersistenciaException("Canción repetida");
        }

        catalogoCanciones.agrega(cancion);
    }

    @Override
    public void actualiza(Cancion cancion) throws PersistenciaException {
        try {
            catalogoCanciones.actualiza(cancion);
        } catch (DAOException pae) {
            throw new PersistenciaException("No se puede actualizar la canción",
                    pae);
        }
    }

    @Override
    public void elimina(Cancion cancion) throws PersistenciaException {
        try {
            catalogoCanciones.elimina(cancion);
        } catch (DAOException pae) {
            throw new PersistenciaException("No se puede eliminar la canción",
                    pae);
        }
    }

    @Override
    public Pelicula obten(Pelicula pelicula) throws PersistenciaException {
        return catalogoPeliculas.obten(pelicula);
    }

    @Override
    public void agrega(Pelicula pelicula) throws PersistenciaException {
        Pelicula peliculaBuscada;

        peliculaBuscada = catalogoPeliculas.obten(pelicula);
        if (peliculaBuscada != null) {
            throw new PersistenciaException("Película repetida");
        }

        catalogoPeliculas.agrega(pelicula);
    }

    @Override
    public void actualiza(Pelicula pelicula) throws PersistenciaException {
        try {
            catalogoPeliculas.actualiza(pelicula);
        } catch (DAOException pae) {
            throw new PersistenciaException("No se puede actualizar la película", pae);
        }
    }

    @Override
    public void elimina(Pelicula pelicula) throws PersistenciaException {
        try {
            catalogoPeliculas.elimina(pelicula);
        } catch (DAOException pae) {
            throw new PersistenciaException("No se puede eliminar la película", pae);
        }
    }

    @Override
    public Genero obten(Genero genero) throws PersistenciaException {
        return catalogoGeneros.obten(genero);
    }

    @Override
    public void agrega(Genero genero) throws PersistenciaException {
        Genero generoBuscado;

        generoBuscado = catalogoGeneros.obten(genero);

        if (generoBuscado != null) {
            throw new PersistenciaException("Género repetido");
        }

        catalogoGeneros.agrega(genero);
    }

    @Override
    public void actualiza(Genero genero) throws PersistenciaException {
        try {
            catalogoGeneros.actualiza(genero);
        } catch (DAOException pae) {
            throw new PersistenciaException("No se puede actualizar el género", pae);
        }
    }

    @Override
    public void elimina(Genero genero) throws PersistenciaException {
        try {
            catalogoGeneros.elimina(genero);
        } catch (DAOException pae) {
            throw new PersistenciaException("No se puede eliminar el género", pae);
        }
    }

    @Override
    public List<Cancion> consultaCanciones() throws PersistenciaException {
        return catalogoCanciones.lista();
    }

    @Override
    public List<Cancion> consultaCancionesTitulo(String titulo) throws PersistenciaException {
        return catalogoCanciones.listaTitulo(titulo);
    }

    @Override
    public List<Cancion> consultaCancionesInterprete(String interprete) throws PersistenciaException {
        return catalogoCanciones.listaInterprete(interprete);
    }

    @Override
    public List<Cancion> consultaCancionesAutor(String autor) throws PersistenciaException {
        return catalogoCanciones.listaAutor(autor);
    }

    @Override
    public List<Cancion> consultaCancionesGenero(String cveGenero) throws PersistenciaException {
        return catalogoCanciones.listaGenero(cveGenero);
    }

    @Override
    public List<Cancion> consultaCancionesAlbum(String album) throws PersistenciaException {
        return catalogoCanciones.listaAlbum(album);
    }

    @Override
    public List<Pelicula> consultaPeliculas() throws PersistenciaException {
        return catalogoPeliculas.lista();
    }

    @Override
    public List<Pelicula> consultaPeliculasTitulo(String titulo) throws PersistenciaException {
        return catalogoPeliculas.listaTitulo(titulo);
    }

    @Override
    public List<Pelicula> consultaPeliculasActor(String actor) throws PersistenciaException {
        return catalogoPeliculas.listaActor(actor);
    }

    @Override
    public List<Pelicula> consultaPeliculasDirector(String director) throws PersistenciaException {
        return catalogoPeliculas.listaDirector(director);
    }

    @Override
    public List<Pelicula> consultaPeliculasGenero(String cveGenero) throws PersistenciaException {
        return catalogoPeliculas.listaGenero(cveGenero);
    }

    @Override
    public List<Genero> consultaGeneros() throws PersistenciaException {
        return catalogoGeneros.lista();
    }

    @Override
    public List<Genero> consultaGenerosCanciones() throws PersistenciaException {
        return catalogoGeneros.listaMedio('C');
    }

    @Override
    public List<Genero> consultaGenerosPeliculas() throws PersistenciaException {
        return catalogoGeneros.listaMedio('P');
    }

}
