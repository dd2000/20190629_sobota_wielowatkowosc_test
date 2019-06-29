package Zadanie_1_Jas_i_Malgosia;

public class Jas_i_Malgosia_2watki_App implements Runnable{


    public static void main(String[] args) throws InterruptedException {
        Thread threadJas = new Thread( new Jas());
        Thread threadGosia = new Thread( new Gosia());

        threadJas.start();

        threadGosia.start();

        threadGosia.join();  // join - czekaj aż wątek Gosia się zabije
        threadJas.join();   // join - czekaj aż wątek Jaś się zabije
        System.out.println("KONIEC DNIA !!! dla wszystkich");
    }

    public void run() {

    }
}
