public class Main6 {
    public static void main(String[] args) throws Exception {
        String experiencePointText = "1000"; 
        int point = Integer.parseInt(experiencePointText); 
        System.out.println("現在の経験値を入力してください："+point);
        double bonus =point*0.25;
        int experienceBonus =(int)bonus;
        int total =point+experienceBonus;
        System.out.println("ボーナス後の経験値："+total);
    }
}