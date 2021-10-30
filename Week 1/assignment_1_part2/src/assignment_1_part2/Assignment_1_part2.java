package assignment_1_part2;

public class Assignment_1_part2
{

    public static void main(String[] args)
    {
        // احمد علي عبدالغني علي 
                account acc=new account(2000,23000);
        acc.setAnnualInterestRate(5.1);
        acc.withdraw(4000.0);
        acc.deposit(3000.0);
        System.out.println("Balance :"+acc.getBalance());
        System.out.println("Data Created: "+acc.getDateCreated());
        
    }
    
}
