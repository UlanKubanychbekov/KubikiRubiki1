package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Test {

    Random random = new Random();

    public int game() {
        int kub1;
        switch (kub1 = random.nextInt(1, 7)) {
            case 1 -> {
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   #   |");
                System.out.println("|       |");
                System.out.println("+-------+");
            }
            case 2 -> {
                System.out.println("+-------+");
                System.out.println("|     # |");
                System.out.println("|       |");
                System.out.println("| #     |");
                System.out.println("+-------+");
            }
            case 3 -> {
                System.out.println("+-------+");
                System.out.println("|     # |");
                System.out.println("|   #   |");
                System.out.println("| #     |");
                System.out.println("+-------+");
            }
            case 4 -> {
                System.out.println("+-------+");
                System.out.println("| #   # |");
                System.out.println("|       |");
                System.out.println("| #   # |");
                System.out.println("+-------+");
            }
            case 5 -> {
                System.out.println("+-------+");
                System.out.println("| #   # |");
                System.out.println("|   #   |");
                System.out.println("| #   # |");
                System.out.println("+-------+");
            }
            case 6 -> {
                System.out.println("+-------+");
                System.out.println("| # # # |");
                System.out.println("|       |");
                System.out.println("| # # # |");
                System.out.println("+-------+");
            }
        }
        return kub1;
    }

    public int game1() {
        Random random = new Random();
        int kub2 = 0;

        switch (kub2 = random.nextInt(1, 7)) {
            case 1 -> {
                System.out.println("+-------+");
                System.out.println("|       |");
                System.out.println("|   #   |");
                System.out.println("|       |");
                System.out.println("+-------+");
            }
            case 2 -> {
                System.out.println("+-------+");
                System.out.println("|     # |");
                System.out.println("|       |");
                System.out.println("| #     |");
                System.out.println("+-------+");
            }
            case 3 -> {
                System.out.println("+-------+");
                System.out.println("|     # |");
                System.out.println("|   #   |");
                System.out.println("| #     |");
                System.out.println("+-------+");
            }
            case 4 -> {
                System.out.println("+-------+");
                System.out.println("| #   # |");
                System.out.println("|       |");
                System.out.println("| #   # |");
                System.out.println("+-------+");
            }
            case 5 -> {
                System.out.println("+-------+");
                System.out.println("| #   # |");
                System.out.println("|   #   |");
                System.out.println("| #   # |");
                System.out.println("+-------+");
            }
            case 6 -> {
                System.out.println("+-------+");
                System.out.println("| # # # |");
                System.out.println("|       |");
                System.out.println("| # # # |");
                System.out.println("+-------+");
            }
        }
        return kub2;
    }
}