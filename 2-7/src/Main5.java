public class Main5 {
    public static void main(String[] args) throws Exception {
        int subtotal =280*3+120*5+100*2;
        double x =subtotal*0.1;//x=消費税金額
        int tax=(int)x;
        int total =subtotal+tax;
        int change =2000-total;
        System.out.println("小計:"+subtotal);
        System.out.println("消費税:"+tax);
        System.out.println("合計金額:"+total);
        System.out.println("おつり:"+change);
    }
}