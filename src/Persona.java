
import javax.swing.JOptionPane;

/*
 * "
 * "
 */
/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class Persona {

    private String curp;
    private String paterno;
    private String materno;
    private String nombre;
    private String celular;
    private Fecha fechaNacimiento;
    private String estadoDeNacimiento;
    private char sexo;

    public Persona() {
    }

    public Persona(String curp, String paterno, String materno, String nombre, String celular, Fecha fechaNacimiento, String estadoDeNacimiento, char sexo) {
        this.curp = curp;
        this.paterno = paterno;
        this.materno = materno;
        this.nombre = nombre;
        this.celular = celular;
        this.fechaNacimiento = fechaNacimiento;
        this.estadoDeNacimiento = estadoDeNacimiento;
        this.sexo = sexo;
    }

    public String getCurp() {

        return "";
    }

    public void setCurp(String curp) {
        this.curp = curp;
        validarCurp(curp);
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstadoDeNacimiento() {
        return estadoDeNacimiento;
    }

    public void setEstadoDeNacimiento(String estadoDeNacimiento) {
        this.estadoDeNacimiento = estadoDeNacimiento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String validarCurp(String curp) {
        if (validarPaterno(curp) && validarMaternoNombre(curp) && validarFechaNac(curp) && validarSexo(curp) && validarEstado(curp) && validarConstantes(curp) && verificarHomonimia(curp) && verificarDigito(curp)) {
            return "Curp valida";
        } else {
            return "Curp NO valida";
        }
    }

    //Métodos para validar la curp ------------------------------------------------
    //Método para validar las posiciones de la curp 1 y 2
    private boolean validarPaterno(String curp) {

        char apellidoPrimeraLetra = paterno.charAt(0); //Trae la primera letra del apellido paterno
        String curpValidar = curp.substring(0, 2); //trae las posiciones 1 y 2 de la curp a validar

        String cadena = paterno.substring(1); //Trae el apellido paterno a partir de la segunda letra
        String newCadena = "";
        String cadenaFinal = "";
        String paternoFinal = "";

        boolean vocal = false;
        int i = 0;
        //Con el while logramos obtener la primera vocal del apellido paterno
        while (i < cadena.length() & !vocal) {
            if (cadena.charAt(i) == 'h') {
                vocal = false;
                i++;
            } else if ((cadena.charAt(i) == 'a')
                    || (cadena.charAt(i) == 'e')
                    || (cadena.charAt(i) == 'i')
                    || (cadena.charAt(i) == 'o')
                    || (cadena.charAt(i) == 'u')) {

                newCadena = (newCadena + cadena.charAt(i));
                vocal = true;
                i++;
            }

        }
        cadenaFinal = newCadena.toUpperCase();
        paternoFinal = apellidoPrimeraLetra + cadenaFinal;
        //validamos que las dos primeras posiciones coincidan
        if (curpValidar.equals(paternoFinal)) {
            return true;
        }
        return false;
    }

    //Método que verifica la posicion 3 y 4 de la curp
    private boolean validarMaternoNombre(String curp) {

        char apellidoPrimeraLetra = materno.charAt(0);
        char nombrePrimeraLetra = nombre.charAt(0);
        String curpValidar = curp.substring(2, 4); //trae las posiciones 3 y 4 de la curp a validar
        String valor = String.valueOf(apellidoPrimeraLetra) + String.valueOf(nombrePrimeraLetra);

        if (curpValidar.equals(valor)) {
            return true;
        }

        return false;
    }

    //Método para verificar las posiciones de la 5 a la 10
    private boolean validarFechaNac(String curp) {
        String curpValidar = curp.substring(4, 10); //trae las posiciones 5-10 de la curp a validar
        String monthTxt = "";
        String dayTxt = "";
        String validarFinal = "";

        int day = fechaNacimiento.getDia();
        if (day < 10) {
            dayTxt = "0" + day;
        } else {
            dayTxt = String.valueOf(day);
        }
        int month = fechaNacimiento.getMes();
        if (month < 10) {
            monthTxt = "0" + month;
        } else {
            monthTxt = String.valueOf(month);
        }
        String year = String.valueOf(fechaNacimiento.getAnio());
        String yearTxt = year.substring(2);

        validarFinal = "" + yearTxt + monthTxt + dayTxt;
        if (validarFinal.equals(curpValidar)) {
            return true;
        }

        return false;
    }

    //Método para validar la posición 11
    private boolean validarSexo(String curp) {

        String sexoChecar = String.valueOf(sexo);
        String curpValidar = curp.substring(10, 11); //trae las posiciones 11 de la curp a validar

        if (("H".equals(sexoChecar) || "M".equals(sexoChecar)) && ("H".equals(curpValidar) || "M".equals(curpValidar))) {
            return true;
        }
        return false;
    }
    
    //Método para validar la posiciones 12-13
    private boolean validarEstado(String curp) {
        String estado = "";
        String estadoTemp = "";
        String curpValidar = curp.substring(11, 13); //trae las posiciones 12-13 de la curp a validar

        for (int i = 0; i < estadoDeNacimiento.length(); i++) {
            char ch = estadoDeNacimiento.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                
            } else if (ch != ' ') {
                estadoTemp = estadoTemp + ch;
            }
        }
        estadoTemp = (estadoTemp.substring(estadoTemp.length() - 1));

        estado = "" + estadoDeNacimiento.charAt(0) + estadoTemp;
        estado = estado.toUpperCase();
        if (estado.equals(curpValidar)) {
            return true;
        }
        return false;

    }
    //Método para validar las posiciones 14-16
    private boolean validarConstantes(String curp) {

        String name = "";
        String ApellidoMaterno = "";
        String ApellidoPaterno = "";
        
        String curpValidar = curp.substring(13, 16); //trae las posiciones 12-13 de la curp a validar
        
        String nameTemp = "";
        String ApellidoMaternoTemp = "";
        String ApellidoPaternoTemp = "";
        String resulFinal = "";

        for (int i = 0; i < nombre.length(); i++) {
            char ch = nombre.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print("");
            } else if (ch != ' ') {
                nameTemp = nameTemp + ch;
            }
        }
        name = (String.valueOf(nameTemp.charAt(1))).toUpperCase();

        for (int i = 0; i < materno.length(); i++) {
            char ch = materno.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print("");
            } else if (ch != ' ') {
                ApellidoMaternoTemp = ApellidoMaternoTemp + ch;
            }
        }
        ApellidoMaterno = (String.valueOf(ApellidoMaternoTemp.charAt(1))).toUpperCase();

        for (int i = 0; i < paterno.length(); i++) {
            char ch = paterno.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                System.out.print("");
            } else if (ch != ' ') {
                ApellidoPaternoTemp = ApellidoPaternoTemp + ch;
            }
        }
        ApellidoPaterno = (String.valueOf(ApellidoPaternoTemp.charAt(1))).toUpperCase();
        resulFinal = ApellidoPaterno + ApellidoMaterno + name;
        
        if (resulFinal.equals(curpValidar)) {
            return true;
        }
        
        return false;

    }
    //Métod para verificar el diferenciador de homonimia y siglo "Posición 17"
    private boolean verificarHomonimia(String curp){
        
        String curpValidar = curp.substring(16, 17); //trae las posiciones 12-13 de la curp a validar
        int year = fechaNacimiento.getAnio();
        
        if (year <= 1999) {
            if (curpValidar.matches("[0-9]+")) {
                return true;
            }
        }else if (year >= 2000) {
            if (curpValidar.matches("[A-Z]*")) {
                return true;
            }
        }
        return false;
    }
    
    //Método para verificar dígito verificador
    private boolean verificarDigito(String curp){
        
        String curpValidar = curp.substring(17, 18); //trae las posiciones 12-13 de la curp a validar
        
        if (curpValidar.matches("[0-9]+")) {
                return true;
            }
        return false;
    }
//Fin de métodos para validar la curp ------------------------------------------------

}
