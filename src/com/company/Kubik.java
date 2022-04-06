package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Kubik {
    Scanner scanner = new Scanner(System.in);
    int y = scanner.nextInt();
    Random random = new Random();
    int kub1 = random.nextInt(1, 7);


    public int game () {
        try {


            if (1 >= y || y > 12) {
                throw new RuntimeException("загаданное число должен быть между 2-12");
            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

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
        int sum = kub1 + kub1;
        int kub = sum - Math.abs(sum - y) * 2;

        System.out.println(kub);
        return kub1;


    }

    public int komp() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 2; i++) {

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
            arrayList.add(kub1);

        }
        int sum = arrayList.get(0) + arrayList.get(1);
        int kub = sum - Math.abs(sum - kub1) * 2;
        return kub;

    }


}

