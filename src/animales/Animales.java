/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animales;

import ico.fes.fauna.Animal;
import ico.fes.fauna.Gato;
import ico.fes.fauna.Perro;

/**
 *
 * @author pc
 */
public class Animales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Animal a = new Animal(4, 2);
        Gato g = new Gato("Esfinge", " Sin pelo", 5);
        Perro p = new Perro("Bulldog Inglés", " Corto", 25);

        System.out.println(g);
        System.out.println(a.getNumeroPatas() + " patas " + a.getNumeroOrejas() + " orejas");
        System.out.println(p);
        System.out.println(a.getNumeroPatas() + " patas " + a.getNumeroOrejas() + " orejas");

    }

}
