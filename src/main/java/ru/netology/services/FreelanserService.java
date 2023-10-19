package ru.netology.services;

public class FreelanserService {
    public int calculate(int income, int expenses, int threshold) {
        int money = 0;
        int rest = 0;
        for (int i = 0; i < 12; i++) {
            if (money >= threshold) {
                money -= expenses;
                money /= 3;
                rest++;
            } else {
                money += income;
                money -= expenses;
            }

        }
        return rest;
    }
}
