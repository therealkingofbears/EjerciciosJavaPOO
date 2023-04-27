/*
Crea una clase en Java donde declares una variable de tipo array de
Strings que contenga los doce meses del año, en minúsculas. A
continuación, declara una variable mesSecreto de tipo String, y hazla
igual a un elemento del array (por ejemplo, mesSecreto = mes[9]. El
programa debe pedir al usuario que adivine el mes secreto. Si el usuario
acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría
ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:
febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Entidades;

/**
 *
 * @author diego
 */
public class Array {
    private String[] array = new String[12];
    private String mesSecreto;
    
    public Array() {
    }

    public Array(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }

    public String[] getArray() {
        return array;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setArray(String[] array) {
        this.array = array;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    
}
