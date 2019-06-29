package Zadanie_1_Jas_i_Malgosia;

public class Gosia implements Runnable {
    public void run() {
        System.out.println("Gosia zaczyna bieganie");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gosia skończyła bieganie");
        System.out.println("Gosia zaczyna prysznic");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gosia skończyła prysznic");
        System.out.println("Gosia zaczyna śniadanie");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gosia skończyła śniadanie");
        System.out.println("Gosia zaczyna ubieranie");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gosia skończyła ubieranie");
        System.out.println("Gosia zaczyna z koleżanką plotkowanie");
        try {
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Gosia skończyła z koleżanką plotkowanie");
        System.out.println("Koniec dnia Gosi");
    } // void run()

    /* // wszystkie powyższe instrukcje można zebrać w jednym bloku try-catch

        try {
            System.out.println("Gosia zaczyna bieganie");
            Thread.sleep(6000);
            System.out.println("Gosia skończyła bieganie");
            System.out.println("Gosia zaczyna prysznic");
            System.out.println("Gosia skończyła prysznic");
            System.out.println("Gosia zaczyna śniadanie");
            System.out.println("Gosia skończyła śniadanie");
            System.out.println("Gosia zaczyna ubieranie");
            System.out.println("Gosia skończyła ubieranie");
            System.out.println("Gosia zaczyna z koleżanką plotkowanie");
            System.out.println("Gosia skończyła z koleżanką plotkowanie");
            System.out.println("Koniec dnia Gosi");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    * */


}
