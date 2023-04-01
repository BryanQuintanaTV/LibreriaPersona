/*
 * "
 * "
 */
package libreriaPersona;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class Fecha {

    private List<Exception> excepciones = new ArrayList<>();
    private int dia, mes, anio;
    private boolean musthave31 = true;

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

        try {
            if (mes == 2 && isBisiesto()) {
                if (dia < 1 || dia > 29) {
                    throw new IllegalArgumentException("En un año bisiesto, febrero tiene 29 días.");
                }
            } else if (mes == 2) {
                if (dia < 1 || dia > 28) {
                    throw new IllegalArgumentException("Febrero tiene 28 días");
                }
            } else if (musthave31) {
                if (dia < 1 || dia > 31) {
                    throw new IllegalArgumentException("El día debe estar entre 1 y 31.");
                }
            } else {
                if (dia < 1 || dia > 30) {
                    throw new IllegalArgumentException("El día debe estar entre 1 y 30.");
                }
            }
        } catch (IllegalArgumentException e) {
            excepciones.add(e);
        }
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        try {
            if (mes < 1 || mes > 12) {
                throw new IllegalArgumentException("El mes debe estar entre 1 y 12.");
            }
        } catch (IllegalArgumentException e) {
            excepciones.add(e);
        }
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        try {
            if (anio < 0) {
                throw new IllegalArgumentException("El año debe ser positivo.");
            }

            int anioActual = Calendar.getInstance().get(Calendar.YEAR);
            if (anio > anioActual) {
                throw new IllegalArgumentException("El año no puede ser mayor al año actual.");
            }
        } catch (IllegalArgumentException e) {
            excepciones.add(e);
        }
        this.anio = anio;
    }

    public boolean isBisiesto() {

        if (anio % 4 == 0) {
            if (anio % 100 == 0) {
                if (anio % 400 == 0) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public void restarSumarDias(int restarSumarDias) {

    }

    public void restarSumarMes(int restarSumarMes) {

    }

    public void restarSumarAnio(int restarSumarAnio) {

    }

    @Override
    public String toString() {

        return dia + " / " + mes + " / " + anio;

    }

    public void mostrarExcepciones() {
        if (excepciones.isEmpty()) {
            
        } else {
            String Excepciones = "";
            for (Exception e : excepciones) {
                Excepciones += e.getMessage()+ " - ";
            }
            JOptionPane.showMessageDialog(null, Excepciones);
        }
    }
}
