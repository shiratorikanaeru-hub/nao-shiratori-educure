public class Main2 {
    public static void main(String[] args) throws Exception {
        double price= 2500*0.2 ;
        int discountPrice =(int)price;
        System.out.println("割引額："+discountPrice+"円");
        int salesPrice = 2500-500 ;
        System.out.println("販売価格："+salesPrice+"円");
    }
}
