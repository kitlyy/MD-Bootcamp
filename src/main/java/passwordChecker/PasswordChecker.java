package passwordChecker;

public class PasswordChecker {
    static void main() {
        PasswordChecker pc1 =  new PasswordChecker();
        System.out.println(pc1.validatePassword("gjhjddh1"));
    }
    public boolean validatePassword(String s) {
        return s.length() >= 8
                && s.matches(".*[A-Za-z].*")
                && s.matches(".*\\d.*");
    }
}