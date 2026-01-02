public class Main9 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '+';  // +, -, *, / のいずれか
        switch (operator) {
            case '+':
                System.out.println("結果:"+(num1+num2));
                break;
            case '-':
                System.out.println("結果:"+(num1-num2));
                break;
            case '*':
                System.out.println("結果:"+(num1*num2));
                break;
            case '/':
                System.out.println("エラー:0で割ることができません");//2つ目のオペランドが0の場合
            default:
                System.out.println("エラー:無効な演算子です");
                break;
        }
    }
}