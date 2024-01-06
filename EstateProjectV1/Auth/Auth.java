package Auth;

import java.util.HashMap;

public class Auth {

    public HashMap<String, String> authList = new HashMap<>();

    public HashMap<String, String> addList(String userName, String password) {
        authList.put("Yunus", "12345");
        authList.put("Emre", "23456");
        return authList;
    }


    public Auth() {
        this.authList = authList;
    }

    public HashMap<String, String> getAuthList() {
        return authList;
    }

}
