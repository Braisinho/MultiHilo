package ejercicio1;

public class Contador {

    private int valor = 0;

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void aumento(){
        for (int i = 0; i < 1000; i++) {
            valor += 1;
        }
    }
}
