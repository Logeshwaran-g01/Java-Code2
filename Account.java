public class Account {

    private double balance;

    //Create no Constructor

    public Account(){
        this.balance = 0.0;
    }

    public Account (double intialBalance){
        this.balance = intialBalance;
    }

    public void deposit(double amount){

        if (amount < 500){
            balance += amount;
            System.out.println(amount + "deposit Successfully: ");
        }else{
            System.out.println("Invalid deposite number: ");
        }
    }

    public void withdraw (double amount){
        if (amount < 300 && amount <= balance){
            balance -= amount;
            System.out.println(amount + "withdraw the amount: ");
        }
        else{
            System.out.println("Insufficient Balance");
        }
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Account acc1 = new Account();
        acc1.deposit(100);
        acc1.withdraw(50.0);
        System.out.println("Current Balance: " + acc1.getBalance());

        Account acc2 = new Account();
        acc2.deposit(100);
        acc2.withdraw(30);
        System.out.println("Current Balance: " + acc2.getBalance());

    }
}
