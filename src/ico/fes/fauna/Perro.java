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
public class Perro extends Animal {

    private String raza;
    private String tipoderabo;
    private int peso;

    public Perro() {
    }

    public Perro(String raza, String tipoderabo, int peso) {
        this.raza = raza;
        this.tipoderabo = tipoderabo;
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTipoderabo() {
        return tipoderabo;
    }

    public void setTipoderabo(String tipoderabo) {
        this.tipoderabo = tipoderabo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Perro{" + "raza=" + raza + ", tipoderabo=" + tipoderabo + ", peso=" + peso + '}';
    }
    
    

}
