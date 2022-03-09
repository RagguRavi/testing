package core.java;

import java.io.UnsupportedEncodingException;
import java.security.spec.KeySpec;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

import org.springframework.security.crypto.codec.Base64;


public class EncryptionDecryption {
	public static Logger LOGGER = LogManager.getLogManager().getLogger("EncryptionDecryption");
	public static String APP_PRIVATE_KEY="sdfkMDgbdfhsdeRAGHUdcgddb43278d^%^YDFtehfghrerBEEPERdsagdhDSrhMDgd#$sd73";

	public static String APP_PRIVATE_KEY_SALT="dhdkjdfheufh32339ewdedu38ft9hurehf";
	
	public static final String sepreater = "~~~";
	public static final String algorithm = "DES";
	private static final char MARKER_CHAR = '~';
	public static void main(String[] args) throws UnsupportedEncodingException {
		String encryptedString = "ravi_beepermd"+sepreater+"6142"+sepreater+"3";
		System.out.print(decryptUrlSafe("t~Z~J8p7~Xx12qp~C~J_x_~W~Ln~F~D6~W~Mfrp~K~H~Vs2~N~Kx5~Yll~Q3~E"));
		
		
	}
	
	
	
	public static String encrypt(String stringToBeEncrypted) {
		String encryptedString = null;
		try {
			DESKeySpec dks = new DESKeySpec(APP_PRIVATE_KEY.getBytes());
			SecretKeyFactory skf = SecretKeyFactory.getInstance(algorithm);
			SecretKey desKey = skf.generateSecret(dks);
			Cipher cipher = Cipher.getInstance(algorithm);
			cipher.init(Cipher.ENCRYPT_MODE, desKey);
			byte[] inputBytes = cipher.doFinal(stringToBeEncrypted.getBytes());
			encryptedString = new String(Base64.encode(inputBytes));
		} catch(Exception e) {
			e.printStackTrace();
		}
		return encryptedString;
	}
	
	
	public static String decryptUrlSafe(String stringToBeDecrypted) {
		String descryptedString = null;
		try {
			byte[] iv = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
	        IvParameterSpec ivspec = new IvParameterSpec(iv);
			
			SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
			KeySpec spec = new PBEKeySpec(APP_PRIVATE_KEY.toCharArray(), APP_PRIVATE_KEY_SALT.getBytes(), 65536, 256);
			SecretKey tmp = skf.generateSecret(spec);
			SecretKey secret = new SecretKeySpec(tmp.getEncoded(), "AES");
			
			Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
			cipher.init(Cipher.DECRYPT_MODE, secret, ivspec);
			
			stringToBeDecrypted = decodeCasingIndifference(stringToBeDecrypted);
			byte[] recoveredBytes = cipher.doFinal(org.apache.commons.codec.binary.Base64.decodeBase64(stringToBeDecrypted.getBytes()));
		    descryptedString = new String(recoveredBytes, "UTF-8");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return descryptedString;
	}
	
	private static String encodeCasingIndifference(String encryptedStr) {
		StringBuilder sb = new StringBuilder();

		for(char ch : encryptedStr.toCharArray()) {
			if (Character.isUpperCase(ch)) {
				sb.append(MARKER_CHAR);
			}

			sb.append(ch);
		}

		return sb.toString();
	}
	
	private static String decodeCasingIndifference(String encryptedText) {
		//In some cases MARKER_CHAR is replaced by %7E by browser then we are replacing this string to MARKER_CHAR
		if(encryptedText.contains("%7E")) {
			encryptedText = encryptedText.replaceAll("%7E", String.valueOf(MARKER_CHAR));
		}
		
		if(encryptedText.contains(String.valueOf(MARKER_CHAR))) {
			StringBuilder sb = new StringBuilder();
			boolean nextCharIsUpper = false;

			for(char ch : encryptedText.toCharArray()) {
				if(ch == MARKER_CHAR) {
					nextCharIsUpper = true;
				}

				if(nextCharIsUpper) {
					sb.append(Character.toUpperCase(ch));
				}else {
					sb.append(Character.toLowerCase(ch));
				}
				nextCharIsUpper = (ch == MARKER_CHAR);
			}

			String result = sb.toString();
			result = result.replaceAll(String.valueOf(MARKER_CHAR),"");;

			return result;
		} else {
			
			return encryptedText;
		}
}
	
	public static String decrypt(String stringToBeDecrypted) {
		String descryptedString = null;
		try {
			DESKeySpec dks = new DESKeySpec(APP_PRIVATE_KEY.getBytes());
			SecretKeyFactory skf = SecretKeyFactory.getInstance(algorithm);
			SecretKey desKey = skf.generateSecret(dks);
			Cipher cipher = Cipher.getInstance(algorithm);
			cipher.init(Cipher.DECRYPT_MODE, desKey);
			byte[] recoveredBytes = cipher.doFinal(Base64.decode(stringToBeDecrypted.getBytes()));
			descryptedString = new String(recoveredBytes);
		} catch(Exception e) {
			e.printStackTrace();
		}
		return descryptedString;
	}
	
}
