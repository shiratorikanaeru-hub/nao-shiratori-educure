// 商品クラス
public class Product {
    private String name;
    private int stock;
    
    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }
    
    // TODO: 在庫を1個減らすメソッド
    public void decreaseStock() {
        if(stock>0){
            stock--;
        }
        // TODO: stockが0より大きい場合のみ減らす
    }
    
    public int getStock() {
        return stock;
    }
    
    @Override
    public String toString() {
        return name + " (在庫: " + stock + "個)";
    }
}