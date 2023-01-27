package ejercicio2;

public class Main {
    public static void main(String[] args) {
        Saldo saldo = new Saldo();

        Hilo h1 = new Hilo(saldo,"Hilo1", 1000);
        Hilo h2 = new Hilo(saldo,"Hilo2", 500);
        Hilo h3 = new Hilo(saldo,"Hilo3", 250);
        Hilo h4 = new Hilo(saldo,"Hilo4", 125);

        h1.start();
        h2.start();
        h3.start();
        h4.start();

        System.out.println(saldo.getSaldo());
    }
}
