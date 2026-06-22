public class Calculator {
    // TODO: 2つの整数の割り算を行うメソッド
    public int divide(int a, int b) throws ArithmeticException {
        // TODO: 
        // 1. bが0の場合は例外をスロー
        // 2. そうでない場合はa÷bの結果を返す
        if (b==0) {
            throw new ArithmeticException("0で割ることはできません");
        }
        return a/b;
    }
}