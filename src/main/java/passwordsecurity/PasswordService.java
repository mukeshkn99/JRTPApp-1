package passwordsecurity;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class PasswordService {
public static String encode(String txt) {
	Encoder encode=Base64.getEncoder();
	return encode.encodeToString(txt.getBytes());
	
}

public static String decode(String encodetxt) {
	Decoder decoder=Base64.getDecoder();
	byte[] decode=decoder.decode(encodetxt);
	return new String(decode);
	
}
}
