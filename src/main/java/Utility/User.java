package Utility;

import java.util.Map;

public class User {
    String username;
    String password;
    String email;

    protected User(Map<String, String> userData) {
        this.username = userData.get("username");
        this.password = userData.get("password");
        this.email = userData.get("email");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
