public class Main3 {
    public static void main(String[] args) {
        String input = "Hello";  // 逆順にする文字列
        String result=reverseString(input);
        System.out.println("入力: \""+input+"\"");
        System.out.println("出力 \""+result+"\"");
    }
    public static String reverseString(String Hello) {
        return new StringBuilder(Hello).reverse().toString();
    }
}