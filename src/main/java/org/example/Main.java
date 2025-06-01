package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User user = new User("Mike", "1234", 100000);
        User user1 = new User("Jon", "1234", 100000);
        User user2 = new User("Cris", "1234", 100000);
        user.giveMoney(10000, user1);
        user.giveMoney(10000, user2);
        user.giveMoney(10000, user2);
        user.giveMoney(10000, user2);
        user.showTransactions();
        user.showBalance();
    }
}