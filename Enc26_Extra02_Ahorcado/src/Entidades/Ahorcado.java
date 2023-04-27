/*
Crear una clase Ahorcado (como el juego), la cual deberá contener como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la cantidad jugadas máximas que
puede realizar el usuario.
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Ahorcado {
    private String palabra;
    private String[] vector;
    private int let;
    private int jugMax;

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int let, int jugMax) {
        this.palabra = palabra;
        this.vector = new String[palabra.length()];
        this.let = let;
        this.jugMax = jugMax;
    }

    public String getPalabra() {
        return palabra;
    }

    public String[] getVector() {
        return vector;
    }

    public int getLet() {
        return let;
    }

    public int getJugMax() {
        return jugMax;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setVector(String[] vector) {
        this.vector = vector;
    }

    public void setLet(int let) {
        this.let = let;
    }

    public void setJugMax(int jugMax) {
        this.jugMax = jugMax;
    }

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", vector=" + vector + ", let=" + let + ", jugMax=" + jugMax + '}';
    }
    
    
}
