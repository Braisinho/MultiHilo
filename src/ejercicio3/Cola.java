package ejercicio3;
public class Cola {

    private char txt;
    private boolean disponible = false;

    public synchronized char get() {
    	  while (!disponible) {
    	    try {
    	          wait();
    	    } catch (InterruptedException e) { }
    	  }
    	  System.out.println("Se consume: " + txt);
    	  disponible = false;
    	  notify();
    	  return txt;
    	}


    public synchronized void put(char valor) {
    	  while (disponible){
    	    try {
    	          wait();
    	    } catch (InterruptedException e) { }
    	  }
    	  txt = valor;
    	  disponible = true;
    	  System.out.println("Se produce: " + txt);
    	  notify();
    	}

     
     
}
