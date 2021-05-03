package day37_methods_overloading;

public class WarmUpMethod {
    public static void main(String[] args) {

        loginVoid("cybertekstudent", "abc123");
        login("cybertel", "abc123");
        System.out.println(login("cybertekstudenm", "abc123"));

    }

    public static void loginVoid(String username, String password) {
        String secretUsername = "cybertekstudent";
        String secretPassword = "abc123";
        if (username.equals(secretUsername) && password.equals(secretPassword)) {
            System.out.println("Login successful. Welcome to Cybertek");
        } else {
            System.out.println("Incorrect username or password");
        }
    }

    public static boolean login(String username, String password) {
        String secretUsername1 = "cybertekstudent";
        String secretPassword1 = "abc123";
        if (username.equals(secretUsername1) && password.equals(secretPassword1)) {
            return true;
        }
        return false;

    }

    boolean isLoginSuccess = login("nadir", "mountain");

    public void isLoginSuccess() {


        System.out.println("isLoginSuucess= " + isLoginSuccess);
    }
    }

