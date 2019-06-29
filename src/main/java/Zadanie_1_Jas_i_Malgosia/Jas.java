package Zadanie_1_Jas_i_Malgosia;

public class Jas implements Runnable {
    public void run() {
        System.out .println ("Jaś zaczyna: sniadanie");
        try {
            Thread. sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System. out .println ("Jaś skończył: śniadanie");
        System.out .println ("Jaś zaczyna: prysznic");
        try {
            Thread. sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System. out .println ("Jaś skończył: prysznic");
        System.out .println ("Jaś zaczyna: ubiera się");
        try {
            Thread. sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System. out .println ("Jaś skończył: ubiera się");
        System.out .println ("Jaś zaczyna: zakupy");
        try {
            Thread. sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System. out .println ("Jaś skończył: zakupy");
        System.out .println ("Jaś zaczyna: gra na konsoli");
        try {
            Thread. sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System. out .println ("Jaś skończył: gra na konsoli");
        System.out.println("Koniec dnia Jasia");

    }
}
