package org.example;

public interface IUser {
    public String getName();
    public void setName(String name);
    public String getPassword();
    public void setPassword(String password);
    public boolean getStatus();
    public void setStatus(boolean status);
    public int getMoney();
    public void setMoney(int money);
    public void showTransactions();
    public void giveMoney(int money, User recipient);
    public void increase(int money);
    public void reduce(int money);
    public void showBalance();
}
