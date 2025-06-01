package org.example;

import java.util.Date;

public class Transaction implements ITransaction{
    private User sender;
    private User recipient;
    private int money;
    private Date date;

    public Transaction(User sender, User recipient, int money) {
        setMoney(money);
        setSender(sender);
        setRecipient(recipient);
        sender.reduce(money);
        recipient.increase(money);
        setDate(new Date());
    }

    @Override
    public User getSender() {
        return sender;
    }

    @Override
    public void setSender(User user) {
        sender=user;
    }

    @Override
    public User getRecipient() {
        return recipient;
    }

    @Override
    public void setRecipient(User user) {
        recipient=user;
    }

    @Override
    public int getMoney() {
        return money;
    }

    @Override
    public void setMoney(int money) {
        this.money=money;
    }

    @Override
    public Date getDate(){
        return date;
    }

    @Override
    public void setDate(Date date){
        this.date = date;
    }

    @Override
    public void showTransaction() {
        System.out.printf("Операция была выполнена %s между пользователями банка" +
                ":%s и %s на сумму %d\n", getDate(), getSender().getName(), getRecipient().getName(), getMoney());
    }
}
