package ejercicio1;

public class Hilo extends Thread{

    private Contador c;

    public Hilo(Contador c) {
        this.c = c;
    }

    @Override
    public void run() {
        super.run();
        synchronized (c){
            c.aumento();
            System.out.println(c.getValor());
        }

    }
}
