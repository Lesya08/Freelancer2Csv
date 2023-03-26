package ru.netology.services;

public class Freelancer {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0;
        int money = 0;

        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                //Отдыхать
                money = money - expenses;
                money = money / 3;
                count++;
            } else {
                //Работать
                money = money + income - expenses;
            }
        }
        return count;
    }
}