package Zadanie_2_Liczby_pierwsze;

import java.io.*;
import java.util.Scanner;

public class LiczbyPierwsze {

    public static void main(String[] args) throws IOException {
        /*
        1. liczby do sprawdzenia należy wczytać z pliku numbers.txt
        2. ponieważ sprawdzanie jednej liczby trwa długo, trzeba by zastosować wielowątkowość
            - 1 wątek dla każdej jednej wczytanej z pliku (sprawdzanej) liczby --> złe, bo np 5000 wątków
        3. lepiej stworzyć kilka wątków (4-5), a każdemu wątkowi dać np. 1000 liczb wczytanych np. do listy
         */
        File plik = new File("src/main/resources/numbers.txt");
        Scanner readFile = new Scanner(plik);
        String txtLiczba;
        while (readFile.hasNextLine()){
            txtLiczba = readFile.nextLine();
        }

        String filePath = "src/main/resources/numbers.txt";    // ->> "/path/to/numbers.txt";
        long number = 0;
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            String numberAsString = fileReader.readLine();
            number = Long.parseLong(numberAsString);
              if (isPrime(number)) System.out.println(number);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                fileReader.close();
            }
        }


    } // main()

    // metoda sprawdzająca, czy liczba jest pierwsza
    private static boolean isPrime(long number) {
        if (number <= 1)
            return false;
        for (long i = 2; i < number; i++) {
            if (number % i == 0)
                return false;
        }
        return true;
    } // isPrime(long number)

}
