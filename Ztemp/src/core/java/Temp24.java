package core.java;

import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.codec.Base64;

public class Temp24 {

	public static String APP_PRIVATE_KEY="aaaaaaaaa";
	
	public static String APP_PRIVATE_KEY_SALT="bbbbbbbbbbbb";
	public static void main(String[] args) {
		String str = "Hello world!How are you";
		String encryptedStr = encrypt(str);
		System.out.println(encryptedStr);
	}

	public static String encrypt(String stringToBeEncrypted) {
		String encryptedString = null;
		try {
			byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
			IvParameterSpec ivspec = new IvParameterSpec(iv);

			SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec spec = new PBEKeySpec(APP_PRIVATE_KEY.toCharArray(), APP_PRIVATE_KEY_SALT.getBytes(), 65536, 256);
			SecretKey tmp = skf.generateSecret(spec);
			SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");

			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding"); 
			cipher.init(Cipher.ENCRYPT_MODE, secret, ivspec);

			byte[] inputBytes = cipher.doFinal(stringToBeEncrypted.getBytes("UTF-8"));
			encryptedString = new String(Base64.encode(inputBytes));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return encryptedString;
	}
}
