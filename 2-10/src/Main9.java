public class Main9 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        char operator = '+';
        int result=0;
        boolean error=false;
        String errorMessage="";
        switch (operator) {
            case '+':
                result=num1+num2;
                break;
            case '-':
                result=num1-num2;
                break;
            case '*':
                result=num1*num2;
                break;
            case '/':
                if (num2==0) {
                  error=true;
                  errorMessage="エラー:0で割ることはできません";
                }else {
                  result=num1/num2;
                }
                break;
            default:
                error=true;
                errorMessage="エラー:無効な演算子です";
                break;
        }
        if (error) {
            System.out.println(errorMessage);
          }else{
            System.out.println("結果:"+result);
        }
    }
}