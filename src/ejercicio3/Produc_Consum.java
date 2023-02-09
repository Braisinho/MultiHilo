package ejercicio3;

public class Produc_Consum {
    public static void main(String[] args) {
        String filePath = "src/ejercicio3/file.txt";
        Cola cola = new Cola();

        Productor p = new Productor(cola, filePath);
        Consumidor c = new Consumidor(cola, filePath);
        

        p.start();
        c.start();



    }
}