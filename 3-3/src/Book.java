public class Book {
    String title;
    boolean isLent=false;

    public void setTitle(String title){
        this.title=title;
        System.out.println("「"+title+"」を登録しました");
    }
    public String getTitle(){
        return title;
    }
    public void lend(){
        if(isLent){
            System.out.println("申し訳ありません。この本は貸出中です");
        }else{
            isLent=true;
            System.out.println("本を貸し出しました");
        }
    }
    public void returnBook(){
        if(isLent){
            isLent=false;
            System.out.println("本が返却されました");
        }
    }
}
