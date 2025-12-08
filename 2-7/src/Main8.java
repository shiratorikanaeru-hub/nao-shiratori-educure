public class Main8 {
    public static void main(String[] args) throws Exception {
        String power= "50"; 
        int attackPower = Integer.parseInt(power); 
        System.out.println("攻撃力を入力してください："+attackPower);
        String defence= "20"; 
        int difencePower = Integer.parseInt(defence); 
        System.out.println("防衛力を入力してください："+difencePower);
        int damage =attackPower-difencePower;
        System.out.println("通常ダメージ："+damage);
        double hit =damage*1.5;
        int criticalHit =(int)hit;
        System.out.println("クリティカルダメージ:"+criticalHit);
}
}