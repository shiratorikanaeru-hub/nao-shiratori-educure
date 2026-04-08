public class Pet {
    String name;
    int energy;
    public void eat(){
        this.energy +=10;
        System.out.println("ポチは食事をして元気になった!");
        System.out.println("現在の体力:"+energy);
    }
    public void play(){
        this.energy -=20;
        System.out.println("ポチは遊んで疲れた!");
        System.out.println("現在の体力:"+energy);
    }
}
