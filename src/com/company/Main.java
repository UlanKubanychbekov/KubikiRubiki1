package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        System.out.println("+-----Start Game------+");
        GameDice();


    }

    public static void Game() {
        Scanner scanner = new Scanner(System.in);
        try {
            int repeatGame = scanner.nextInt();


            if (repeatGame > 2 || repeatGame < 1) {

                throw new RuntimeException(" выбери  1 или 2");
            }
            switch (repeatGame) {
                case 1 -> GameDice();
                case 2 -> System.out.println("Game Over");

            }
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void GameDice() {
        Test test = new Test();
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int kub = 0;
        int kubComp = 0;
        for (int i = 0; i < 3; i++) {
            try {
                int y = scanner.nextInt();
                if (y > 13 || y < 2) {
                    throw new RuntimeException("должен быть  от 2 - 12");
                }
                int sum = test.game();
                int sum1 = test.game1();
                int summaUser = sum + sum1;
                kub += summaUser - Math.abs(summaUser - y) * 2;


                Game game = new Game();
                int sumGame = game.game();
                int sumGame1 = game.game1();
                int ran = random.nextInt(1, 7);
                int sumComp = sumGame + sumGame1;
                kubComp += sumComp - Math.abs(sumComp - ran) * 2;

//                System.out.println("хотите жульничать? да / нет");
//
//                String chit = scanner.nextLine();
//                if (chit.equals("да")) {
//                    if (chitRan == 1) {


                System.out.println(kub + " = " + summaUser + " - " + "(" + summaUser + " - " + y + ")" + "*2");
                System.out.println(kubComp + " = " + sumComp + " - " + "(" + sumComp + " - " + ran + ")" + "*2");

            } catch (RuntimeException e) {
                System.out.println(e.getMessage());

            }
        }
        System.out.println("очки игрока: " + kub);
        System.out.println("очки компьютера: " + kubComp);
        if (kub > kubComp) {
            int igrok = kub - kubComp;
            System.out.println("победил игрок!!!");

            System.out.println("на: " + igrok + " очка больше");

        } else if (kubComp > kub) {
            int komp = kubComp - kub;
            System.out.println("победил комп!!!");

            System.out.println("на: " + komp + " очка больше");
        } else {
            System.out.println("ничья");

        }
        System.out.println("хотите продолжить игру? \n если да то 1:\n если нет  то 2");
        Game();
    }

}



