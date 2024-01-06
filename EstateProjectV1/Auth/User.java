package Auth;

import java.util.HashMap;
import java.util.List;

public abstract class User {

    //private Long id;

    private String userName;

    private String password;



    /////////

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    ///////

    public User(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

}
