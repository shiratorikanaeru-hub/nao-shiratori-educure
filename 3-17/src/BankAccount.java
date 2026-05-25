public class BankAccount {
    private int balance;
    public BankAccount(int balance) {
        if (balance > 0) {
            this.balance = balance;
        } else {
            System.out.println("エラー: 初期残高は正の整数を指定してください。");
            this.balance = 0;
        }
    }
    public int getBalance() {
        return balance;
    }
    public void deposit(int amount) {
        if (amount <= 0) {
            System.out.println("エラー: 入金額は正の整数を指定してください。");
            return;
        }

        balance += amount;
        System.out.println(amount + "円入金しました");
    }
    public void withdraw(int amount) {
        if (amount <= 0) {
            System.out.println("エラー: 出金額は正の整数を指定してください。");
            return;
        }

        if (balance >= amount) {
            balance -= amount;
            System.out.println(amount + "円引き出しました");
        } else {
            System.out.println("引き出しに失敗しました。残高が不足しています。");
        }
    }
}