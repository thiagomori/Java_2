
package estruturadedadoslab;

import java.io.File;
import java.io.FileReader;

public class Main {


    public static void main(String[] args) throws Exception {
        File file = new File("E:/EstruturaDeDadosLab/texto.txt");
        String [][] matrizM = new String[20][20];
        Matriz m = new Matriz();
        
        // EX 1
        matrizM = m.FileReader(matrizM,file);
       
}
}

