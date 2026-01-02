public class Main8 {
    public static void main(String[] args) {
        int score = 85;  // ここに点数を入力
        switch (score/10) {
            case 10://100点
            case 9://90-99点
                System.out.println("A");
                break;
            case 8://89-80点
                System.out.println("B");
                break;
            case 7://79-70点
                System.out.println("C");
                break;
            case 6://69-60点
                System.out.println("D");
                break;
            default:
                System.out.println("F");
                break;
        }
    }
}