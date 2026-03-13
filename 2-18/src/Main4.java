public class Main4 {
    public static void main(String[] args) {
        int[] prices = {100, 200, 300};  // 商品価格
        int[] quantities = {1, 2, 3};    // 数量
        int[] totals=calcTotal(prices,quantities);
        
        System.out.print("商品価格: ");
        printArray(prices);
        System.out.print(", 数量: ");
        printArray(quantities);
        System.out.println();
        System.out.print("合計金額: ");
        printArray(totals);
    }
    public static int[] calcTotal(int[] prices, int[] quantities){
        int[]result=new int[prices.length];
        for(int i=0;i<prices.length; i++){
            result[i]=prices[i]*quantities[i]*110/100;
        }
        return result;
    }
    public static void printArray(int[] arrey) {
        System.out.print("[");
        for (int i=0; i<arrey.length; i++){
            System.out.print(arrey[i]);
            if (i<arrey.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}