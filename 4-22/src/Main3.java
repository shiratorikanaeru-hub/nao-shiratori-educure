import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class Main3 {
    public static void main(String[] args) {

        try {
            // XMLファイルを読み込む
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse("src/excersise.xml");

            // book要素を取得
            Element book = document.getDocumentElement();

            // title、author、priceを取得
            String title = book.getElementsByTagName("title")
                    .item(0).getTextContent();

            String author = book.getElementsByTagName("author")
                    .item(0).getTextContent();

            int price = Integer.parseInt(
                    book.getElementsByTagName("price")
                            .item(0).getTextContent());

            // Bookオブジェクトを作成
            Book b = new Book(title, author, price);

            // 本の情報を表示
            System.out.println("タイトル: " + b.getTitle());
            System.out.println("著者: " + b.getAuthor());
            System.out.println("価格: " + b.getPrice());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}