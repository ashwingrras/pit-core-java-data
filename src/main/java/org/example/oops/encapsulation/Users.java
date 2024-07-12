package org.example.oops.encapsulation;

/*
    product model:
    1. name
    2. id
    3. mrp
    4. sp
    5. discount
    6. description
    7. category
    8. color
    9. size
    10. collection
    11. reviews

 */

public class Users
{
    private int id;
    private String name;

    private String address;

    private int age;

    private Account account;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }
}
