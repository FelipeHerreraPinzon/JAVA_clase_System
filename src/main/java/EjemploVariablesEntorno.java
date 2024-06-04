import java.util.Map;

public class EjemploVariablesEntorno {
    public static void main(String[] args) {
        /// obtener todas las env
        Map<String, String> varEnv = System.getenv();
        System.out.println("variables de entorno = " + varEnv);

        // mostrarlas en array asociativo
        System.out.println("listar variables de entorno del sistema");
        for(String key: varEnv.keySet()){
            System.out.println(key + " => " + varEnv.get(key));
        }

        // obtener una enparticular
        String username = System.getenv("USERNAME");
        System.out.println("username = " + username);

        String javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        String tempDir = System.getenv("TEMP");
        System.out.println("tempDir = " + tempDir);

        String path = System.getenv("PATH");
        System.out.println("path = " + path);

        String appEnv = System.getenv("APPLICATION_ENV");
        System.out.println("appEnv = " + appEnv);

        // crear variables desde terminal
        // correr por consola esto:
        // setx SALUDAR_HOLA "Hola a todos !!!"

        String saludarHola = System.getenv("SALUDAR_HOLA");
        System.out.println("saludarHola = " + saludarHola);
                
    }
}
