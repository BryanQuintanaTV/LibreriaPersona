/*
 * "
 * "
 */

/**
 *
 * @author Quintana Juarez Bryan Alexis
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona persona = new Persona();

        persona.setCelular("42584");
        persona.setEstadoDeNacimiento("Chihuahua");
        persona.setFechaNacimiento(new Fecha(18, 4, 2003));
        persona.setMaterno("Juarez");
        persona.setNombre("Bryan");
        persona.setPaterno("Quintana");
        String sexo = "H";
        persona.setSexo(sexo.charAt(0));
        persona.setCurp("QUJB030418HCHNNRB8");
        
        Persona persona2 = new Persona();

        persona2.setCelular("423584");
        persona2.setEstadoDeNacimiento("Chihuahua");
        persona2.setFechaNacimiento(new Fecha(17, 10, 2003));
        persona2.setMaterno("Monge");
        persona2.setNombre("Iran");
        persona2.setPaterno("Chavarria");
        String sexoAme = "M";
        persona2.setSexo(sexoAme.charAt(0));
        persona2.setCurp("CAMI031017MCHHNRA5");


        
        System.out.println("Validar Curp: "+ persona.validarCurp("QUJB030418HCHNRRB8"));
        System.out.println("Validar Curp: "+ persona2.validarCurp("CAMI031017MCHHNRA5"));
        
        
        
        /*
        String s = "Bryan100";
        String newS = s.substring(5, 6);

        System.out.println("NewS is: " + newS);
        boolean isNumeric = (newS != null && newS.matches("[0-9]+"));
        System.out.println("IsNumeric: " + isNumeric);

        String ss = "abcdefg";
        boolean isOnlyLetters = (ss != null && ss.matches("^[a-zA-Z]+$"));
        System.out.println("IsOnlyLetters: " + isOnlyLetters);*/

    }

}
