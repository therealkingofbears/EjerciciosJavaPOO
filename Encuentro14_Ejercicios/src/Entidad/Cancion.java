/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package Entidad;

/**
 *
 * @author diego
 */
public class Cancion {
    public int titulo;
    public int autor;

    public Cancion(int titulo, int autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public Cancion() {
        
    }

    public int getTitulo() {
        return titulo;
    }

    public int getAutor() {
        return autor;
    }

    public void setTitulo(int titulo) {
        this.titulo = titulo;
    }

    public void setAutor(int autor) {
        this.autor = autor;
    }
    
    
}
