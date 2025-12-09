public class Main2 {
    public static void main(String[] args) throws Exception {
        double listPrice= 2500*0.2 ;
        int discountPrice =(int)listPrice;
        System.out.println("割引額："+discountPrice+"円");
        int salesPrice = 2500-discountPrice ;
        System.out.println("販売価格："+salesPrice+"円");
    }
}
