package prueba;

import comparadores.ComparaCancionesAlbum;
import comparadores.ComparaCancionesInterprete;
import comparadores.ComparaMediosClave;
import comparadores.ComparaMediosGenero;
import comparadores.ComparaMediosTitulo;
import excepciones.PersistenciaException;
import interfaces.IPersistencia;
import java.util.Collections;
import java.util.List;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;
import objetosNegocio.Pelicula;
import persistencia.PersistenciaListas;

/**
 *
 * @author asus
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Prueba prueba = new Prueba();

        // Crean la fachada de los objetos que permiten almacenar las
        // canciones y peliculas en arreglos
        IPersistencia fachada = new PersistenciaListas();
        List<Genero> listaGeneros;
        List<Cancion> listaCanciones;
        List<Pelicula> listaPeliculas;

        Genero genero = null;
        Cancion cancion = null;

        // Se agrega el género 1 al catálogo de géneros
        try {
            fachada.agrega(new Genero("GCB0001", "Balada", 'C'));
            System.out.println("Se agrego el género 1 al catálogo de géneros");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 1");
        }
        // Se agrega el género 2 al catálogo de géneros
        try {
            fachada.agrega(new Genero("GCB0002", "Bossanova", 'C'));
            System.out.println("Se agrego el género 2 al catálogo de géneros");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 2");

        }

        // Se agrega el género 3 al catálogo de géneros
        try {
            fachada.agrega(new Genero("GCR0003", "Rock", 'C'));
            System.out.println("Se agrego el género 3 al catálogo de géneros");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 3");
        }
        // Se agrega de nuevo el género 1 al catálogo de géneros
        try {
            fachada.agrega(new Genero("GCB0001", "Balada", 'C'));
            System.out.println("Se agrego el género 1 al catálogo de géneros");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 1");
        }
        // Se agrega el género 4 al catálogo de géneros
        try {
            fachada.agrega(new Genero("GPD0001", "Drama", 'P'));
            System.out.println("Se agrego el género 4 al catálogo de géneros");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 4");
        }
        // Se agrega el género 5 al catálogo de géneros
        try {
            fachada.agrega(new Genero("GPC0002", "Ciencia Ficción", 'P'));
            System.out.println("Se agrego el género 5 al catálogo de géneros");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 5");
        }
        // Se agrega el género 6 al catálogo de géneros
        try {
            fachada.agrega(new Genero("GPC0003", "Comedia", 'P'));
            System.out.println("Se agrego el género 6 al catálogo de géneros");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 6");
        }
        // Despliega el contenido del catalogo de géneros
        System.out.println("Lista de géneros");
        try {
            listaGeneros = fachada.consultaGeneros();
            System.out.println(listaGeneros);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }

        // Se modifica el genero de clave "GCB0002", a "Samba"
        try {
            genero = fachada.obten(new Genero("GCB0002"));
            genero.setNombre("Samba");
            fachada.actualiza(genero);
            System.out.println("Se actualizo el genero de clave GCB0002");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + "GCB0002");
        }
        // Se elimina el género "GPC0003" del catalogo de generos
        try {
            fachada.elimina(new Genero("GPC0003"));
            System.out.println("Se elimino el genero de clave GPC0003");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " GPC0003");
        }
        // Se elimina el género "GPM0004" (inexistente) del catalogo de generos
        try {
            fachada.elimina(new Genero("GPM0004"));
            System.out.println("Se elimino el genero de clave GPM0004");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " GPM0004");
        }
        // Despliega el contenido del catalogo de géneros
        System.out.println("Lista de géneros");
        try {
            listaGeneros = fachada.consultaGeneros();
            System.out.println(listaGeneros);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Despliega el contenido del catalogo de géneros de canciones
        System.out.println("Lista de géneros de canciones");
        try {
            listaGeneros = fachada.consultaGenerosCanciones();
            System.out.println(listaGeneros);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Despliega el contenido del catalogo de género de películas
        System.out.println("Lista de géneros de películas");
        try {
            listaGeneros = fachada.consultaGenerosPeliculas();
            System.out.println(listaGeneros);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }

        // Se obtiene el genero cuya clave es "GCB0001"
        try {
            genero = fachada.obten(new Genero("GCB0001"));
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se agrega la canción 1 al catálogo de canciones
        try {
            fachada.agrega(new Cancion("John Lennon", "The Beatles", "Let it be", "CBB0001", "The long and winding road", genero, 3));
            System.out.println("Se agrego la cancion 1");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 1");
        }
        // Se intenta agregar de nuevo la canción 1 al catálogo de canciones
        try {
            fachada.agrega(new Cancion("John Lennon", "The Beatles", "Let it be", "CBB0001", "The long and winding road", genero, 3));
            System.out.println("Se agrego la cancion 1");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 1");
        }
        // Se obtiene el genero cuya clave es "GCB0002"
        try {
            genero = fachada.obten(new Genero("GCB0002"));
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se agrega la canción 2 al catálogo de canciones
        try {
            fachada.agrega(new Cancion("Los Indios Tabajaras", "Antonio Carlos Jobim", "Bossanova Jazz Vol. 1", "CSD0002", "Garota de Ipanema", genero, 3));
            System.out.println("Se agrega la cancion 2");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 2");
        }
        // Se agrega la canción 3 al catálogo de canciones
        try {
            fachada.agrega(new Cancion("Joao Gilberto", "Joao Gilberto", "Bossanova Jazz Vol. 1", "CSB0003", "Desafinado", genero, 4));
            System.out.println("Se agrega la cancion 3");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 3");
        }

        // Se lista el catálogo de canciones
        System.out.println("Lista de canciones:");
        try {
            listaCanciones = fachada.consultaCanciones();
            System.out.println(listaCanciones);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se actualiza la canción de clave "CBB0001" al genero "GCR0003"
        try {
            // Obtiene el género 3 del cátalogo de géneros de canciones
            genero = fachada.obten(new Genero("GCR0003"));
            if (genero != null) {
                // Obtiene la canción 1 del cátalogo de canciones
                cancion = fachada.obten(new Cancion("CBB0001"));
                if (cancion != null) {
                    // Se actualiza la canción 1
                    cancion.setGenero(genero);
                    fachada.actualiza(cancion);
                    System.out.println(
                            "Se actualizo la canción de clave CBB0001 al genero GCR0003");
                } else {
                    System.out.println("No existe la canción CBB0001");
                }
            } else {
                System.out.println("No existe el género GCR0003");
            }
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se elimina la canción de clave "CSB0003"
        try {
            fachada.elimina(new Cancion("CSB0003"));
            System.out.println("Se elimina la cancion de clave CSB0003");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " CSB0003");
        }
        // Se lista el catálogo de canciones
        System.out.println("Lista de canciones:");
        try {
            listaCanciones = fachada.consultaCanciones();
            System.out.println(listaCanciones);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se lista las canciones con el interprete "The Beatles"
        System.out.println("Lista de canciones de The Beatles:");
        try {
            listaCanciones = fachada.consultaCancionesInterprete("The Beatles");
            System.out.println(listaCanciones);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }

        // Se lista las canciones de samba, "GCB0002"
        System.out.println("Lista de canciones de Samba:");
        try {
            listaCanciones = fachada.consultaCancionesGenero("GCB0002");
            System.out.println(listaCanciones);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se obtiene el genero cuya clave es "GPD0001"
        try {
            genero = fachada.obten(new Genero("GPD0001"));
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se agrega la película 1 al catálogo de películas
        try {
            fachada.agrega(new Pelicula("Humphrey Bogart", "Ingrid Bergman", "Michael Curtiz", "PED0001", "Casa Blanca", genero, 102));
            System.out.println("Se agrego la película 1");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 1");
        }
        // Se obtiene el genero cuya clave es "GPC0002"
        try {
            genero = fachada.obten(new Genero("GPC0002"));
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se agrega la película 2 al catálogo de películas
        try {
            fachada.agrega(new Pelicula("Keir Dullea", "Gary Lockwood", "Stanley Kubrick", "PCF0002", "2001 Space Odyssey", genero, 141));
            System.out.println("Se agrego la película 2");
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage() + " 2");
        }
        // Se lista el catálogo de películas
        System.out.println("Lista de peliculas:");
        try {
            listaPeliculas = fachada.consultaPeliculas();
            System.out.println(listaPeliculas);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }
        // Se lista las películas de Ingrid Bergman
        System.out.println("Lista de peliculas de Ingrid Bergman:");
        try {
            listaPeliculas = fachada.consultaPeliculasActor("Ingrid Bergman");
            System.out.println(listaPeliculas);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }

        //PRUEBA DE LOS COMPARADORES
        try {
            // Obtiene la lista de canciones de la BD
            listaCanciones = fachada.consultaCanciones();
            // Despliega la lista de canciones
            System.out.println("Lista de canciones:");
            System.out.println(listaCanciones);
            // Ordena la lista de canciones por su clave
            Collections.sort(listaCanciones, new ComparaMediosClave());
            // Despliega la lista de canciones ordenada por su clave
            System.out.println("Lista de canciones ordenadas por clave:");
            System.out.println(listaCanciones);
            // Ordena la lista de canciones por su titulo
            Collections.sort(listaCanciones, new ComparaMediosTitulo());
            // Despliega la lista de canciones ordenada por su titulo
            System.out.println("Lista de canciones ordenadas por titulo:");
            System.out.println(listaCanciones);
            // Ordena la lista de canciones por su titulo en orden inverso
            Collections.reverse(listaCanciones);
            // Despliega la lista de canciones ordenada por su titulo en orden
            // inverso
            System.out.println("Lista de canciones ordenadas por titulo en orden inverso:");
            System.out.println(listaCanciones);
            // Ordena la lista de canciones por su genero
            Collections.sort(listaCanciones, new ComparaMediosGenero());
            // Despliega la lista de canciones ordenada por su genero
            System.out.println("Lista de canciones ordenadas por genero:");
            System.out.println(listaCanciones);
            
            // Ordena la lista de canciones por su interprete
            Collections.sort(listaCanciones, new ComparaCancionesInterprete());
            // Despliega la lista de canciones ordenada por su interprete
            System.out.println("Lista de canciones ordenadas por interprete:");
            System.out.println(listaCanciones);
            // Ordena la lista de canciones por su album
            Collections.sort(listaCanciones, new ComparaCancionesAlbum());
            // Despliega la lista de canciones ordenada por su album
            System.out.println("Lista de canciones ordenadas por album:");
            System.out.println(listaCanciones);
        } catch (PersistenciaException fe) {
            // Muestra el mensaje de error amistoso
            System.out.println("Error: " + fe.getMessage());
        }

    }

}
