package Zadanie_1_Jas_i_Malgosia;

public class Jas_i_Malgosia_2watki_App implements Runnable{


    public static void main(String[] args) throws InterruptedException {
        Thread threadJas = new Thread( new Jas());
        Thread threadGosia = new Thread( new Gosia());

        threadJas.start();

        threadGosia.start();

    }

    public void run() {

    }
}
