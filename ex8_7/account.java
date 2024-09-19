package ex8_7;

public class account {
    private long balance;
    private String name;
    private String password;
    private long number;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getPassword(){
        return password;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public long getBalance() {
        return this.balance;
    }
    public long getNumber() {
        return this.number;
    }
    public void setNumber(long number){
        this.number = number;
    }

    @Override
    public String toString() {
        return "account{" +
                "잔고=" + this.balance + "\n" +
                ", 이름='" + this.name + '\'' + "\n" +
                ", password='" + this.password + '\'' + "\n" +
                ", 계좌번호=" + this.number + "\n" +
                '}';
    }

    public void deposit(long amount){
        this.balance += amount;
    }

    public void withdraw(long amount){
        this.balance -= amount;
    }
}
