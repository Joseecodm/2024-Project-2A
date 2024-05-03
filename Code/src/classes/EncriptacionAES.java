package classes;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Josee
 */
public class EncriptacionAES {

    private static final String ALGORITMO = "AES";
    private static final String CLAVE_SECRETA = "1234567890123456"; // La clave debe tener 16, 24 o 32 bytes para AES

    public static String encriptar(String texto) {
        try {
            SecretKeySpec clave = new SecretKeySpec(CLAVE_SECRETA.getBytes(), ALGORITMO);
            Cipher cifrador = Cipher.getInstance(ALGORITMO);
            cifrador.init(Cipher.ENCRYPT_MODE, clave);
            byte[] textoEncriptado = cifrador.doFinal(texto.getBytes());
            
            return Base64.getEncoder().encodeToString(textoEncriptado);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException ex) {
        }
        return null;
    }

    public static String desencriptar(String textoEncriptado) {
        try {
            SecretKeySpec clave = new SecretKeySpec(CLAVE_SECRETA.getBytes(), ALGORITMO);
            Cipher cifrador = Cipher.getInstance(ALGORITMO);
            cifrador.init(Cipher.DECRYPT_MODE, clave);
            byte[] textoDesencriptado = cifrador.doFinal(Base64.getDecoder().decode(textoEncriptado));
            return new String(textoDesencriptado);
        } catch (InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException ex) {
        }
        return null;
    }
}