package ejercicio2;

public class Hilo extends Thread{

    private Saldo s;
    private String nombre;
    private int cantidadAumentar;

    public Hilo(Saldo s, String nombre, int cantidadAumentar) {
        this.s = s;
        this.nombre = nombre;
        this.cantidadAumentar = cantidadAumentar;
    }

    @Override
    public void run() {
        super.run();
        s.addSaldo(cantidadAumentar, nombre);
    }
}
