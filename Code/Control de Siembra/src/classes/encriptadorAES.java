package classes;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;

/**
 *
 * @author Josee
 */
public class encriptadorAES {

    private static final String CLAVE = "1234567890123456"; // Cambia esta clave por una segura y más compleja

    public static String encriptar(String texto) {
        try {
            SecretKeySpec key = new SecretKeySpec(CLAVE.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] textoEncriptado = cipher.doFinal(texto.getBytes());
            return Base64.getEncoder().encodeToString(textoEncriptado);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String desencriptar(String textoEncriptado) {
        try {
            SecretKeySpec key = new SecretKeySpec(CLAVE.getBytes(), "AES");
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] textoDesencriptado = cipher.doFinal(Base64.getDecoder().decode(textoEncriptado));
            return new String(textoDesencriptado);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
