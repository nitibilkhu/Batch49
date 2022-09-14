package ObjectClass;

public class BankingSystem {
    int acc_no;
    String acc_holder_name;
    double balance;
    int deposit;
    int withDraw;

    public void dataOfCustomer(int a_n, String cust_name, double bal) {
        acc_no = a_n;
        acc_holder_name = cust_name;
        balance = bal;
        System.out.println(acc_no + " " + acc_holder_name + " " + balance);
        System.out.println("Balance is " + balance);
    }

    public void deposit(int d) {
      deposit = d;
      balance += deposit;
        System.out.println(deposit + " is deposited");
        System.out.println("New Balance is " + balance);
    }

    public void withDraw(int w) {
       withDraw = w;
       balance -= withDraw;
        System.out.println(withDraw + " is withdrawn");
        System.out.println("Balance is " + balance);
    }
}

class DisplayCustInfo {
    public static void main(String[] args) {
        BankingSystem bs = new BankingSystem();
        bs.dataOfCustomer(1234567890, "Dhav", 1000);
        bs.deposit(4000);
        bs.withDraw(1500);
    }
}
