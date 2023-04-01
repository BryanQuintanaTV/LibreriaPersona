/*
 * "
 * "
 */
package libreriaPersona;

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Fecha fecha = new Fecha();
        fecha.setAnio(2024);
        fecha.setMes(13);
        fecha.setDia(36);
        System.out.println(fecha.isBisiesto());
        fecha.mostrarExcepciones();
    }
    
}
