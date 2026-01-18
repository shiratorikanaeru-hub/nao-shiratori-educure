public class Main3 {
    public static void main(String[] args) {
        int height = 5; 
        for(int step=1;step<=height; step++){
            for(int space=1; space<=height-step; space++){
                System.out.print(" ");
            }
            for(int star =1; star<=2*step-1;star++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
