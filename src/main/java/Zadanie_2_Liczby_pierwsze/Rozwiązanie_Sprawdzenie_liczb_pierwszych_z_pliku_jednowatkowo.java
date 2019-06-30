package Zadanie_2_Liczby_pierwsze;

//public class Rozwiązanie_Sprawdzenie_liczb_pierwszych_z_pliku_jednowatkowo {

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Rozwiązanie_Sprawdzenie_liczb_pierwszych_z_pliku_jednowatkowo {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("src/main/resources/numbers.txt");
        Scanner scanner = new Scanner(file);

        long startTime = System.currentTimeMillis();

        int ileLiczbPierwszych = 0;
        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();

            if (isPrime(number)) {
                ileLiczbPierwszych++;
                System.out.println("Liczba pierwsza: " + number + ". Łącznie znalazłem liczb pierwszych: " + ileLiczbPierwszych);
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Zajeło to " + (endTime-startTime) + " ms");
    }

    private static boolean isPrime(long number) {
        if (number <= 1)
            return false;
        for (long i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    }

}  // Rozwiązanie_Sprawdzenie_liczb_pierwszych_z_pliku_jednowatkowo