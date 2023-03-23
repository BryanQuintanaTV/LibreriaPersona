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
    private char[] arregloCurp = new char[13];

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
    
    private char[] arregloCurp(){
        
        if (curp.length() == 13) {
            for (int i = 0; i < 13; i++) {
                arregloCurp[i] = curp.charAt(i);
            }
        }
        
        return arregloCurp;
    }

    public String getCurp() {
        
        
        return validarCurp("ujh");
    }

    public void setCurp(String curp) {

        this.curp = curp;
        arregloCurp();
    }

    private String validarCurp(String curp) {

        return "";
        
    }
    
    public String validarPaterno(String paterno){
        
        char apellidoPrimeraLetra = paterno.charAt(0);

        String cadena = paterno.substring(1);
        String newCadena="";
        String paternoFinal = "";
        boolean vocal = false;
        int i = 0;
        while (i < cadena.length() & !vocal) {
            if ((cadena.charAt(i) == 'a')
                    || (cadena.charAt(i) == 'e')
                    || (cadena.charAt(i) == 'i')
                    || (cadena.charAt(i) == 'o')
                    || (cadena.charAt(i) == 'u')) {

                newCadena = (newCadena  + cadena.charAt(i)).toUpperCase();
                vocal = true;
                i++;
            }

        }
        paternoFinal = apellidoPrimeraLetra+newCadena;
        return paternoFinal;
        
    }
    public String validarMaternoNombre(){
        
        char apellidoPrimeraLetra = materno.charAt(0);
        char nombrePrimeraLetra = nombre.charAt(0);
        
        String fin = ""+apellidoPrimeraLetra+nombrePrimeraLetra;
        
        return fin;
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

}
