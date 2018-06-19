package top.kwseeker.jbcrypt;

import org.mindrot.jbcrypt.BCrypt;

public class BCryptUtil {

    public static String BCryptEncode(String password) {
        //return BCrypt.hashpw(password, BCrypt.gensalt(10));
        return BCrypt.hashpw(password, BCrypt.gensalt());   //log_rounds默认为10
    }

    public static String BCryptEncode(String password, int log_rounds) {
        return BCrypt.hashpw(password, BCrypt.gensalt(log_rounds));
    }

    public static boolean isBCryptMatch(String candidate, String hashedPasswd ) {
        return BCrypt.checkpw(candidate, hashedPasswd);
    }

}
