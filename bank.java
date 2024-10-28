class Account{
String customerName;
int accountNumber;
String accountType;
double balance;


Account(String customerName,
int accountNumber,
String accountType,
double balance){


this.customerName=customerName;
this.accountNumber=accountNumber;
this.accountType=accountType;
this.balance=balance;
}

void deposite(double amount){
balance += amount;
System.out.println("Deposited:"+amount);
}

void displayBalance(){
System.out.println("balance:"+balance);
}
}

class SavAcct extends Account{
SavAcct(String customerName,int accountNumber,String accountType, double balance){
super( customerName, accountNumber,accountType, balance);
}

void computeInterest(double rate){
double interest=balance/rate*100;
balance += interest;
System.out.println("Interested added."+interest);
}

void withdrew(double amount){
if(amount > balance){
System.out.println("insufficient balance");
}else{
balance -= amount;
System.out.println("withdraw:"+amount);
}
}
}

class CurAcct extends Account{
private static final double MIN_BALANCE=500.0;
private static final double PENALTY=50.0;

CurAcct(String customerName,int accountNumber,String accountType, double balance){
super(customerName, accountNumber,accountType, balance);
}
void checkMinBalance(){
if(balance < MIN_BALANCE){
System.out.println("balance below minimun,penalty imposed");
balance -= PENALTY;
}
}

void withdrew(double amount){
if(amount > balance){
System.out.println("insufficient balance");
}else{
balance -= amount;
checkMinBalance();
System.out.println("withdraw:"+amount);
}
}

}

class Hello{
public static void main(String args[]){


SavAcct s1=new SavAcct("john",12345,"BT",60.000);

s1.deposite(50);
s1.displayBalance();
s1.computeInterest(5);
s1.withdrew(300);
s1.displayBalance();

CurAcct c1=new CurAcct("jia",98745,"BT",80.000);

c1.deposite(200);
c1.displayBalance();

c1.withdrew(400);
c1.displayBalance();


}
}
