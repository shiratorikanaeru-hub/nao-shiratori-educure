// 必要なインポート文を記載
import java.util.ArrayList;

public class Main2 {
    public static void main(String[] args) {
        // Integer型のArrayListを作成
        ArrayList<Integer>scores=new ArrayList<>();
        // 点数を追加
        scores.add(85);
        scores.add(92);
        scores.add(78);
        scores.add(55);
        scores.add(43);
        
        // 点数リストを表示
        System.out.println("点数リスト:"+scores);
        // 平均点を計算
        int total=0;
        for(int score:scores){
            total+=score;
        }
        double average=(double)total/scores.size();
        System.out.println("平均点:"+average);

        // 最高点を取得
        int max=getMaxScore(scores);
        System.out.println("最高点:"+max);
        
        // 不合格者数（60点以下）を計算
        int failCount=countFail(scores);
        System.out.println("不合格者数:"+failCount);
    }
    public static int getMaxScore(ArrayList<Integer>scores){
         int max=scores.get(0);
         for(int score:scores){
            if(score>max){
                max=score;
            }
         }
            return max;
    }
    public static int countFail(ArrayList<Integer>scores){
        int count=0;
        for(int score:scores){
            if(score<=60){
                count++;
            }
        }
        return count;
    }
}