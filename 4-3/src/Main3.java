public class Main3 {
    public static boolean validateUsername(String username) {
        if (username.length()<4||username.length()>16) {
            return false;
        }
        if (!username.matches("[A-Za-z0-9_]+")) {
            return false;
        }
        if (username.matches("[0-9]+")) {
            return false;
        }
        return true;
    }

    public static boolean validatePassword(String password) {
        if (password.length()<8) {
            return false;
        }
        if (!password.matches(".*[A-Z].*")) {
            return false;
        }
        if (!password.matches(".*[0-9].*")) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // テストケース
        String[] usernames = {"Player_1", "123456", "P@layer"};
        String[] passwords = {"Password123", "password123", "Pass"};
        System.out.println("ユーザー名をチェック:");
        for(String u :usernames){
            System.out.println(u+":"+(validateUsername(u)?"有効":"無効"));
        }
        System.out.println("パスワードチェック:");
        for(String p:passwords){
            System.out.println(p+":"+(validatePassword(p)?"有効":"無効"));
        }
    }
}