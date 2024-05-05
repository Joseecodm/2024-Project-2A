package classes;

/**
 *
 * @author Josee
 */
public class autenticacion {

    private static final String USUARIO = "usuario";
    private static final String CONTRASENA = "1234567890123456"; // La contraseña debería ser almacenada de forma segura

    public static boolean autenticar(String usuario, String contrasena) {
        // Verificar si el usuario y la contraseña coinciden
        // Usuario autenticado
        // Usuario no autenticado
        
        return usuario.equals(USUARIO) && contrasena.equals(CONTRASENA); 
    }
}
