public class Book {
    String title;
    String author;
    int pages;

    public Book(int pages){
        this.title="Java入門";
        this.author="山田太郎";
        this.pages=pages;
    }
    public Book(){
        this.title="Python実践";
        this.author="鈴木次郎";
        this.pages=300;
    }
}
