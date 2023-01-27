package ejercicio1;


/**
 * Brais Ferro Oliveira PSP
 */
public class Main {
    public static void main(String[] args) {
        Contador c = new Contador();
        Hilo h1 = new Hilo(c);
        Hilo h2 = new Hilo(c);
        Hilo h3 = new Hilo(c);
        Hilo h4 = new Hilo(c);
        Hilo h5 = new Hilo(c);

        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();

        Contador c2 = new Contador();
        Hilo2 h6 = new Hilo2(c2);
        Hilo2 h7 = new Hilo2(c2);
        Hilo2 h8 = new Hilo2(c2);
        Hilo2 h9 = new Hilo2(c2);
        Hilo2 h10 = new Hilo2(c2);

        Thread t1 = new Thread(h6);
        t1.start();

        Thread t2 = new Thread(h7);
        t2.start();

        Thread t3 = new Thread(h8);
        t3.start();

        Thread t4 = new Thread(h9);
        t4.start();

        Thread t5 = new Thread(h10);
        t5.start();

    }
}
