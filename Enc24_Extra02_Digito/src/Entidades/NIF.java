/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
con su correspondiente letra (NIF). Los atributos serán el número de DNI
(entero largo) y la letra (String o char) que le corresponde.
 */
package Entidades;

/**
 *
 * @author diego
 */
public class NIF {
    private int DNI;
    private String NIF;

    public NIF() {
    }

    public NIF(int DNI, String NIF) {
        this.DNI = DNI;
        this.NIF = NIF;
    }

    public int getDNI() {
        return DNI;
    }

    public String getNIF() {
        return NIF;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }
    
    
    
}
