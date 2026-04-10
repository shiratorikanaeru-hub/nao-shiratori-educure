public class Book {
    int id;
    String title;
    String author;
    int pages;

    public Book(int id,String title,String author){
        this.id=id;
        this.title=title;
        this.author=author;
        this.pages=0;
    }
    public Book(int id,String title,String author,int pages){
        this.id=id;
        this.title=title;
        this.author=author;
        this.pages=pages;
    }
    public void showInfo(){
        System.out.println("本"+id+":"+title+"-"+author+"("+pages+"ページ)");
    }
}
