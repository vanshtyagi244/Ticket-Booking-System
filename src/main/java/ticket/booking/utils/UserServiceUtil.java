package ticket.booking.utils;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class UserServiceUtil {

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();


    public static String hashPassword(String plainPassword){
        return encoder.encode(plainPassword);
    }

    public static boolean checkPassword(String rawPassword, String hashedPassword){
        return encoder.matches(rawPassword, hashedPassword);
    }
}
