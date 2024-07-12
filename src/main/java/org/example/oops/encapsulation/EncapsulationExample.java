package org.example.oops.encapsulation;

public class EncapsulationExample
{
    public static void main(String[] args)
    {
        System.out.println(" at EncapsulationExample");
        Account account = new Account();
        System.out.println(account.getBalance());
        Users users = new Users();
        users.setId(101);
        users.setAccount(account);
        System.out.println(users.getId());

        /*
        int a = 10;
        Integer b = a; // auto boxing
        Integer c = 15;
        int d = c; // unboxing
        */
    }
}
