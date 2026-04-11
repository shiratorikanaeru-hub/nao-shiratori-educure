public class Main6 {
    public static void main(String[] args) {
        Account sm=new Account("12345");
        System.out.println("口座番号:"+sm.accountNumber);
        sm.deposit(1000);
        System.out.println("残高:"+sm.balance+"円");
        sm.withdraw(500);
        System.out.println("出金後残高:"+sm.balance+"円");
    }
}