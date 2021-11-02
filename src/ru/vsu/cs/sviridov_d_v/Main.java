package ru.vsu.cs.sviridov_d_v;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Locale.setDefault(Locale.ROOT);

        double N = readNumber("Enter the last limb of the progression: ");

        double k = readNumber("Enter the degree of progression: ");

        double sum = countSum(N, k);

        System.out.println("Sum of progression: " + sum);
    }

    static double readNumber(String text) {
        System.out.print(text);
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    static double countSum(double N, double k) {
        double sum = 0;
        for (int i = 1; i <= N; i++) {
            sum += Math.pow(i, k);
        }

        return sum;
    }

}


