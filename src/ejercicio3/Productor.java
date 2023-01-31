package ejercicio3;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Productor extends Thread {
    private Cola cola;
    private String file;

    public Productor(Cola c, String file) {
        cola = c;
        this.file = file;
    }

    public void run() {
        Path path = Paths.get(file);
        try {
            List<String> contentList = Files.readAllLines(path, StandardCharsets.UTF_8);
            for (String value:
                 contentList) {
                for (int i = 0; i < value.length(); i++) {
                    if (value.charAt(i) != ' '){
                        cola.put(value.charAt(i));
                        System.out.println(getState());
                    }
                    try {
                        sleep(100);
                    } catch (InterruptedException e) {}
                }
            }
            System.out.println(getState());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


