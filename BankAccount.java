class Balance extends Exception{
    Balance(String s){
        super(s);
    }
}
public class BankAccount {
    int accno;
    double balance;
    BankAccount(int a , double b){
        accno = a;
        balance = b;
    }
    void withdraw(int c){
        if(c>balance){
            try{
                throw new Balance("Insufficient Amount");
            }
            catch(Balance e){
                System.out.println(e.getMessage());
            }
        }
        else {
            balance = balance - c;
            System.out.println("Current balance after withdraw " + c + " is : " + balance);
        }
    }
    void deposit(int d){
        balance = balance + d;
        System.out.println("Current balance after depositing amount of "+d+" is "+balance);
    }
    void show(){
        System.out.println("Account Number is : "+accno);
        System.out.println("Available Balance :"+balance);
    }
    public static void main(String[] args){
            BankAccount bank = new BankAccount(101,2000);
            bank.withdraw(10000);
            bank.deposit(1000);
            bank.show();
    }
}
