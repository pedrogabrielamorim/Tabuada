package Calc;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        int n = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a tabuada que deseja: ");
        n = scanner.nextInt();

        for (int i = 1; i <= 10; i++)
            System.out.println(n + "x" + i + "= " + n * i);
    }
}
