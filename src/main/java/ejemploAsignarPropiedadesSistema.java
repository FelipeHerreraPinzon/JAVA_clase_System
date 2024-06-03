import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class ejemploAsignarPropiedadesSistema {
    public static void main(String[] args) {

        try {
            FileInputStream archivo = new FileInputStream("src/main/java/config.properties");
            Properties propiedades = new Properties(System.getProperties());
            propiedades.load(archivo);
            propiedades.setProperty("mi propiedad pérsonalizada", "mi valor guardado");

            System.setProperties(propiedades);
            Properties ps = System.getProperties();

            System.out.println("ps = " + ps.getProperty("mi propiedad pérsonalizada"));
            System.out.println(System.getProperty("config.puerto.servidor"));
            System.out.println(System.getProperty("otra"));
            System.out.println(System.getProperty("config.texto.ambiente"));

            System.getProperties().list(System.out);
            // ps.list(System.out);
        } catch (Exception e) {
            System.out.println("no existe archivo");
        }
    }
}
