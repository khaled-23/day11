public class Account {
    private String id;
    private String name;
    private int balance;

    public Account(String id, String name){
        this.id=id;
        this.name=name;
    }
    public Account(String id, String name, int balance){
        this.id=id;
        this.name=name;
        this.balance=balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }
    public int credit(int amount){
        this.balance= this.balance+amount;
        return amount;
    }
    public int debit(int debit){
        if(debit<getBalance()){
            this.balance = this.balance-debit;
        }else System.out.println(this.name+ "doesn't have enough balance: "+ this.getBalance());
        return -debit;
    }
    public int transferTo(Account toAccount, int amount){
        if(getBalance()>=amount){
            this.balance= this.balance-amount;
            toAccount.credit(amount);
        }else System.out.println(this.name +" doesn't have enough balance: " + this.balance);

        return amount;
    }


    @Override
    public String toString() {
        return "Account{" +
                "id='" + this.id + '\'' +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }
}
