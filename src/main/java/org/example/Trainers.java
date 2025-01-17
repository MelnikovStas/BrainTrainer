package org.example;

import java.util.Random;
import java.util.Scanner;

public class Trainers {
    public static void nBack() {
        int level = 1;
        Random rand = new Random();
        Scanner scanner = new Scanner(System.in);
        String task = "";
        boolean game = true;
        while (game) {
            System.out.println("Level " + level);
            task = "";
            for (int i = 0; i < level; i++) {
                int randomNumber = rand.nextInt(10);
                System.out.print(randomNumber);
                task += randomNumber;
            }
            System.out.println();
            String answer = scanner.nextLine();
            if (task.equals(answer)) {
                System.out.println("Good");
                level++;
                continue;
            } else {
                System.out.println("Bad");
                level--;
                if (level < 1) {
                    game = false;
                }
                continue;
            }
        }
    }
}
