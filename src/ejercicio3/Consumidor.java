package ejercicio3;

public class Consumidor extends Thread {
    private Cola cola;

    public Consumidor(Cola c, int n) {
        cola = c;
    }

    public void run() {
        char valor;
        for (int i = 0; i < 5; i++) {
            valor = cola.get();
            System.out.println(getState());
        }
    }
}
