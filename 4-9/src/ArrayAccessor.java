public class ArrayAccessor {
    private int[] array;
    
    // TODO: コンストラクタを実装
    public ArrayAccessor(int[] array) {
        this.array = array;
    }
    
    // TODO: 以下の要件を満たすgetElementメソッドを実装してください
    // 1. 引数で指定された位置の要素を取得
    // 2. 位置が範囲外の場合は例外をスロー
    // 3. 適切な例外処理を行う
    public int getElement(int index) {
        if (index < 0 || index >= array.length) {
            throw new ArrayIndexOutOfBoundsException("指定された位置は範囲外です");
        }
        return array[index];
    }
}