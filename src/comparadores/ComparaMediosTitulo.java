/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparadores;

import java.util.Comparator;
import objetosNegocio.Medio;

/**
 *
 * @author asus
 */
public class ComparaMediosTitulo implements Comparator<Medio>{

    @Override
    public int compare(Medio m1, Medio m2) {
        return m1.getTitulo().compareTo(m2.getTitulo());
    }
    
}
