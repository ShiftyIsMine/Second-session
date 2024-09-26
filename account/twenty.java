package account;

public class twenty {
    private String account;
    private int money;
    private int balance;

    public twenty(String account, int balance) {
        this.account = account;
        this.balance = balance;
    }


    public boolean transfer(twenty receiver, int b) {
        this.balance -= b;
        receiver.balance += b;
        if(balance < 3000){
            System.out.println("잔액부족");
            return false;
        }
        return true;
    }

    public void setAccount(String account) {
        this.account = account;
    }
    public void setMoney(int money) {
        this.money = money;
    }


    @Override
    public String toString() {
        return "twenty{" +
                "account='" + this.account + '\'' +
                ", balance=" + this.balance +
                '}';
    }

}

