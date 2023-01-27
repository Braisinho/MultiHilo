package ejercicio1;

public class Hilo2 implements Runnable{

    private Contador c;

    public Hilo2(Contador c) {
        this.c = c;
    }

    @Override
    public void run() {
        synchronized (c){
            c.aumento();
            System.out.println(c.getValor());
        }

    }
}
