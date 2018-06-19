package top.kwseeker;

import top.kwseeker.jbcrypt.BCryptUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String password = "123456";

        // jBCrypt
        String hashedPasswd = BCryptUtil.BCryptEncode(password);
        boolean isMatch = BCryptUtil.isBCryptMatch(password, hashedPasswd);
        boolean isMatch2 = BCryptUtil.isBCryptMatch("123457", hashedPasswd);
        System.out.println("Password: " + password + " Ciphertext: " + hashedPasswd + "\n"
            + "isMatch: " + isMatch + " isMatch2: " + isMatch2);
    }
}
