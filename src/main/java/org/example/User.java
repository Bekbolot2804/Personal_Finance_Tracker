package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

//Реализация класса Пользователя,
//у него 5 параметров(имя, пароль, статус, деньги, динамический массив Транзакций я думаю
//его заменить на HashMap или HashSet)
//Методы класса: Типичные геттеры и сеттеры для всех параметров
//Другие методы: показать транзакции, перевести, увеличить, уменьшить деньги, показ баланса
public class User implements IUser{
    private String name;
    private String password;
    private boolean status = true;
    private int money = 0;
    private List<Transaction> transaction = new ArrayList<>();

    public User(String name, String password, int money){
        setName(name);
        setPassword(password);
        setMoney(money);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name=name;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public void setPassword(String password) {
        this.password=password;
    }

    @Override
    public boolean getStatus() {
        return this.status;
    }

    @Override
    public void setStatus(boolean status) {
        this.status=status;
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
    public void showTransactions() {
        for (Transaction transaction : this.transaction) {
            transaction.showTransaction();
        }
    }

    @Override
    public void giveMoney(int money, User recipient) {
        Transaction transaction = new Transaction(this, recipient, money);
        this.transaction.add(transaction);
    }

    @Override
    public void increase(int money) {
        money=money+getMoney();
        setMoney(money);
    }

    @Override
    public void reduce(int money) {
        money=getMoney()-money;
        setMoney(money);
    }

    @Override
    public void showBalance(){
        System.out.printf("Мой баланс сейчас:%d", getMoney());
    }
}
