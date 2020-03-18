package Utility;

import java.util.HashMap;
import java.util.Map;

public class Utility {

    public static String getBaseURL() {
        String env = System.getenv("ENV");
        String envVar = env.toUpperCase() + "_URL";
        return System.getenv(envVar);
    }

    private static String getUsername(String access) {
        String envVar = "USERNAME_" + access.toUpperCase();
        return System.getenv(envVar);
    }

    private static String getPassword(String access) {
        String envVar = "PASSWORD_" + access.toUpperCase();
        return System.getenv(envVar);
    }

    private static String getEmail(String access) {
        String envVar = "EMAIL_" + access.toUpperCase();
        return System.getenv(envVar);
    }

    public static User getUser(String access) {
        Map<String, String> userData = new HashMap<>();
        userData.put("username", getUsername(access));
        userData.put("password", getPassword(access));
        userData.put("email", getEmail(access));
        return new User(userData);
    }

}
