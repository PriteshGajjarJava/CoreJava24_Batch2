class Account {
    int actNo;
    float balance;
    String bankInfo;
    Account(int actNo, float balance, String bankInfo) {
        this.actNo = actNo; this.balance = balance; this.bankInfo = bankInfo;
    }
    synchronized void withdrawl(float amt) {
        System.out.println(this.actNo + " => Amount before withdrawl: " + this.balance);
        this.balance = this.balance - amt;
        System.out.println(this.actNo + " => Amount after withdrawl: " + this.balance);
    }
    synchronized void deposite(float amt) {
        System.out.println(this.actNo + " => Amount before Deposit: " + this.balance);
        this.balance = this.balance + amt;
        System.out.println(this.actNo + " => Amount after Deposit: " + this.balance);
    }
    // Read method
    String getBankDetails() {
        return this.bankInfo;
    }
    // Read method
    float checkBalance() {
        return this.balance;
    }
}

class TransactionThread extends Thread {
    Account act;
    float amt;
    TransactionType type;
    TransactionThread(Account act, float amt, TransactionType type) {
        this.act = act; this.amt = amt; this.type = type;
    }
    public void run() {
        switch (type) {
            case WITHDRAWL: act.withdrawl(amt); break;
            case DEPOSIT: act.deposite(amt); break;
            case CHECK_BALANCE: float bal = act.checkBalance(); System.out.println("Current bal is: " + bal); break;
            case GET_BANK_INFO: String info = act.getBankDetails(); System.out.println("Bank info:" + info); break;
        }
    }
}
enum TransactionType { DEPOSIT, WITHDRAWL, CHECK_BALANCE, GET_BANK_INFO };
public class ThreadSafetyDemo {
    public static void main(String[] args) {
        Account a1 = new Account(110, 10000, "SBI:Camp");
        Account a2 = new Account(211, 15000, "SBI:Kothrud");

        // t1 -> a1 -> Deposit
        TransactionThread t1 = new TransactionThread(a1, 1000, TransactionType.DEPOSIT);
        t1.start();
        
        // t2 -> a1 -> Withdrawl
        TransactionThread t2 = new TransactionThread(a1, 3000, TransactionType.WITHDRAWL);
        t2.start();

    }
}