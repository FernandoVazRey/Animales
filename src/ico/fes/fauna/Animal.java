/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.fauna;

/**
 *
 * @author pc
 */
public class Animal {

    private int numeroPatas;
    private int numeroOrejas;

    public Animal() {
    }

    public Animal(int numeroPatas, int numeroOrejas) {
        this.numeroPatas = numeroPatas;
        this.numeroOrejas = numeroOrejas;
    }

    public int getNumeroPatas() {
        return numeroPatas;
    }

    public void setNumeroPatas(int numeroPatas) {
        this.numeroPatas = numeroPatas;
    }

    public int getNumeroOrejas() {
        return numeroOrejas;
    }

    public void setNumeroOrejas(int numeroOrejas) {
        this.numeroOrejas = numeroOrejas;
    }

    @Override
    public String toString() {
        return "Animal{" + "numeroPatas=" + numeroPatas + ", numeroOrejas=" + numeroOrejas + '}';
    }
  
    
    


  }
