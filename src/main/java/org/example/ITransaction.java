package org.example;

import java.util.Date;

public interface ITransaction {
    public User getSender();
    public void setSender(User user);
    public User getRecipient();
    public void setRecipient(User user);
    public int getMoney();
    public void setMoney(int money);
    public Date getDate();
    public void showTransaction();
}
