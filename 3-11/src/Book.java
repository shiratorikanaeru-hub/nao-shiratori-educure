public class Book extends Product{
    String author;
    int stookQuantity;
    public Book(String name,int price,String author,int stookQuantity){
        super(name,price);
        this.author=author;
        this.stookQuantity=stookQuantity;
    }
    @Override
    public void displayInfo(){
        System.out.println("書籍名:"+name);
        System.out.println("著者:"+author);
        System.out.println("価格:"+price+"円");
    }
    @Override
    public  void checkStook(){
        if (stookQuantity>0){
            System.out.println("在庫あり");
        }else{
            System.out.println("在庫なし");
        }
    }
}
