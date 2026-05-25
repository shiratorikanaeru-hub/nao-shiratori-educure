public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("エラー: 在庫数は0以上で設定してください");
            this.stock = 0;
        }
    }
    public String getName() {
        return name;
    }
    public int getStock() {
        return stock;
    }
    public void addStock(int amount) {
        if (amount <= 0) {
            System.out.println("エラー: 追加数は正の整数を指定してください");
            return;
        }
        stock += amount;
        System.out.println(amount + "個追加しました");
    }
    public void removeStock(int amount) {
        if (amount <= 0) {
            System.out.println("エラー: 販売数は正の整数を指定してください");
            return;
        }
        if (stock >= amount) {
            stock -= amount;
            System.out.println(amount + "個販売しました");
        } else {
            System.out.println("エラー:在庫が不足しています");
        }
    }
}