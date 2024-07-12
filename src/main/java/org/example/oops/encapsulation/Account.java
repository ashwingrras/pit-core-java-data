package org.example.oops.encapsulation;

public class Account
{
    private Integer id;
    private Double balance = 1000.00;

    public double getBalance()
    {
        return balance;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }
}
