package ejercicio2;

public class Saldo{

    private int saldo;

    public Saldo(){
        this.saldo = 1000;
    }

    public int getSaldo() {
        try {
            Thread.sleep(1000);
            return saldo;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void setSaldo(int saldo) {
        try {
            Thread.sleep(1000);
            this.saldo = saldo;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void addSaldo(int saldo, String nombre){
        System.out.println("Saldo añadido por parte de : " + nombre);
        System.out.println("Saldo Previo : " + this.saldo);
        this.saldo += saldo;
        System.out.println("Saldo actual : " + this.saldo);
    }
}
