package ru.netology;

public class Main {
    public static void main(String[] args) {

        BonusService service = new BonusService();

        long amount = 1000;
        boolean registered = true;
        long result = service.calculate(amount, registered);
        System.out.println(result);

    }
}