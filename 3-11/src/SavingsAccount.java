public class SavingsAccount implements BankAccount {
    String ownerName;
    int balance;

    public SavingsAccount(String ownerName, int balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }
    @Override
    public void deposit(int amount) {
        balance += amount;
        System.out.println(amount + "円入金しました");
    }
    @Override
    public void withdraw(int amount) {
        balance -= amount;
        System.out.println(amount + "円出金しました");
    }
    @Override
    public int getBalance() {
        return balance;
    }
    @Override
    public void displayAccountInfo() {
        System.out.println("口座名義人：" + ownerName);
        System.out.println("残高：" + balance);
    }
}