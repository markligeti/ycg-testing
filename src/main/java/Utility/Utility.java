package Utility;

public class Utility {

    public static String getBaseURL() {
        String env = System.getenv("ENV");
        String envVar = env.toUpperCase() + "_URL";
        return System.getenv(envVar);
    }

    public static String getUsername(String access) {
        String envVar = "USERNAME_" + access.toUpperCase();
        return System.getenv(envVar);
    }

    public static String getPassword(String access) {
        String envVar = "PASSWORD_" + access.toUpperCase();
        return System.getenv(envVar);
    }
}
