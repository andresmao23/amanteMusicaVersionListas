/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import excepciones.FachadaException;
//import fachadas.FachadaArreglos;
//import interfaces.IFachada;
import java.util.Vector;
import objetosNegocio.Cancion;
import objetosNegocio.Genero;

/**
 *
 * @author asus
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        
        /*Prueba prueba = new Prueba();
        IFachada fachada = new FachadaArreglos();
        Vector lista = null;
        Genero genero;
        Cancion cancion;
        
        
        //Se crean tres generos para canciones
        Genero genero1 = new Genero("GC001", "Baladas", 'C');
        Genero genero2 = new Genero("GC002", "Bossanova", 'C');
        Genero genero3 = new Genero("GC003", "Rock", 'C');
        
        try {
            fachada.agrega(genero1);
            System.out.println("Se agregó el genero 1 al catálogo de géneros");
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage() + " 1");
        }
        
        try {
            fachada.agrega(genero2);
            System.out.println("Se agregó el genero 2 al catálogo de géneros");
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage() + " 2");
        }
        
        try {
            fachada.agrega(genero3);
            System.out.println("Se agregó el genero 3 al catálogo de géneros");
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage() + " 3");
        }
        
        //Se agrega de nuevo el genero 1 al catálogo de géneros - generación de ERROR
        try {
            fachada.agrega(genero1);
            System.out.println("Se agregó el genero 1 al catálogo de géneros");
        } catch (FachadaException fe) {
            fe.printStackTrace();
            System.out.println("Error: " + fe.getMessage() + " 1");
        }
        
        
        //Se crean tres generos para películas
        Genero genero4 = new Genero("GP001", "Drama", 'P');
        Genero genero5 = new Genero("GP002", "Ciencia Ficción", 'P');
        Genero genero6 = new Genero("GP003", "Comedia", 'P');
        
        try {
            fachada.agrega(genero4);
            System.out.println("Se agregó el genero 4 al catálogo de géneros");
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage() + " 4");
        }
        
        try {
            fachada.agrega(genero5);
            System.out.println("Se agregó el genero 5 al catálogo de géneros");
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage() + " 5");
        }
        
        try {
            fachada.agrega(genero6);
            System.out.println("Se agregó el genero 6 al catálogo de géneros");
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage() + " 6");
        }
        
        //Despliega el contenido del catálogo de generos
        System.out.println("********** Lista de géneros **********");
        try {
            System.out.println(fachada.consultaGeneros());
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage());
        }
        
        //Se modifica el género de clave "GC002", a "Samba"
        try {
            genero = fachada.obten(new Genero("GC002"));
            genero.setNombre("Samba");
            fachada.actualiza(genero);
            System.out.println("Se actualizó el género de clave GC002");
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage() + " GC002");
        }
        
        //Se elimina el género de clave "GP003" del catálogo de generos
        try {
            fachada.elimina(new Genero("GP003"));
            System.out.println("Se eliminó el género de clave GP003");
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage() + " GP003");
        }
        
        //Despliega el contenido del catálogo de generos
        System.out.println("********** Lista de géneros **********");
        try {
            System.out.println(fachada.consultaGeneros());
        } catch (FachadaException fe) {
            System.out.println("Error: " + fe.getMessage());
        }*/
    
        
    }
    
}
