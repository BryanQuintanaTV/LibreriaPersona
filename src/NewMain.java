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
        
        System.out.println("here");
        persona.setCelular("42584");
        persona.setEstadoDeNacimiento("Chihuahua");
        persona.setFechaNacimiento(new Fecha());
        persona.setMaterno("Juarez");
        persona.setNombre("Bryan");
        persona.setPaterno("Quintana");
        String sexo = "H";
        persona.setSexo(sexo.charAt(0));
        System.out.println("here 2");
        persona.setCurp("QUJB030418HC");
        
        System.out.println("La curp es: " +persona.getCurp());
        
        System.out.println(persona.validarPaterno("Quintana")+persona.validarMaternoNombre());
        
    }
    
}
