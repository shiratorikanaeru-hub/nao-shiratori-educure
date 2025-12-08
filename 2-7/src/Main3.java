public class Main3 {
    public static void main(String[] args) throws Exception {
        int attck=15;
        int defence=5;
        int damage = (attck*2-defence)/3 ;//整数同士の計算の場合小数点以下は、自動で切り捨てされる。
        System.out.println("与えるダメージ："+damage);
    }
}