public class BankAccount{
    int balance;

    public BankAccount(){
    this.balance=0;
    }
    public int getBalance(){
        return balance;
    }
    public void deposit(int amount){
        this.balance += amount;
        System.out.println(amount+"円預けました");
        System.out.println("残高:"+amount+"円");
    }
    public void withdraw(int amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println(amount+"円引き出しました");
            System.out.println("残高："+balance+"円");
        } else {
            System.out.println("残高が不足しています");
        }
    }
}