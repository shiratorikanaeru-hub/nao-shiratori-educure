// ジェネリックな倉庫クラス
public class Warehouse<T> {
    // TODO: 商品を格納するフィールドを作成
    private T item;
    
    // TODO: 商品を格納するメソッド
    public void store(T item) {
        this.item=item;
        System.out.println("商品追加: " + item);
    }
    
    // TODO: 商品を取り出すメソッド
    public T retrieve() {
        T temp=item;
        item =null;
        System.out.println("取り出し: " + temp);
        return temp;
    }
    
    // TODO: 倉庫が空かどうかをチェックするメソッド
    public boolean isEmpty() {
        return item==null;
    }
}
