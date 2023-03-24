/*
 * "
 * "
 */

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class Fecha {

    private int dia, mes, anio;

    public Fecha() {
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public boolean isBisiesto() {

        return false;

    }

    public void restarSumarDias(int restarSumarDias) {

    }

    public void restarSumarMes(int restarSumarMes) {

    }

    public void restarSumarAnio(int restarSumarAnio) {

    }

    public String toString() {

        return dia + " / " + mes + " / " + anio;

    }
}
