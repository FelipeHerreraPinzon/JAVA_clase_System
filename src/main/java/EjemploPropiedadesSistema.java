import java.util.Properties;

public class EjemploPropiedadesSistema {
    public static void main(String[] args) {
        // https://docs.oracle.com/javase/tutorial/essential/environment/sysprop.html

        // obtener username
        String username = System.getProperty("user.name");
        System.out.println("username = " + username);

        // obtener ruta home
        String home = System.getProperty("user.home");
        System.out.println("home = " + home);

        // obtener workspace
        String workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        // obtener version java
        String java = System.getProperty("java.version");
        System.out.println("java = " + java);
        
        //
        String lineSeparator = System.getProperty("line.separator");
        System.out.println("lineSeparator + \"nueva linea\" = " + lineSeparator + "nueva linea");

        // importar TODAS las propiedades
        Properties propiedades = System.getProperties();
        propiedades.list(System.out);
    }
}
