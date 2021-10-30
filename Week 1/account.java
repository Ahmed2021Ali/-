  // احمد علي عبدالغني علي 
package assignment_1_part2;
import java.util.Date;
public class account 
{
    private int id;
    private double balance;
    private double annualInterestRate;
    private Date dateCreated;
    public account()
    {
     id=0;
     balance=0.0;
     annualInterestRate=0.0;
     dateCreated=new Date();
    }
    public account(int id,double balance)
    {
        this.id=id;
        this.balance=balance;
    }
    public int getId() 
    {
        return id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public double getBalance() 
    {
        return balance;
    }
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    public double getAnnualInterestRate()
    {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) 
    {
        this.annualInterestRate = annualInterestRate;
    }
    public Date getDateCreated()
    {
        return dateCreated;
    }
    public void setDateCreated(Date dateCreated) 
    {
        this.dateCreated = dateCreated;
    }
    public double getMonthlyInterestRate()
    {
        return (annualInterestRate/100)/12;
    }
    public void withdraw(double amount)
    {
        this.balance-=amount;
    }
    public void deposit(double amount)
    {
        this.balance+=amount;
    }
}

