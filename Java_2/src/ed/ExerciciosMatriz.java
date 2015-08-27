
package ed;


public class ExerciciosMatriz {


    public static void main(String[] args) {
        // EXERCICIO 1
        char [][] matrizChar;
        matrizChar = new char[4][12];
        // EXERCICIO 2
        float [][] matrizFloat;
        matrizFloat = new float [8][6];
        // EXERCICIO 3
     /**   int [][] matrizInt;
        matrizInt = new int[480][640];
        for(int i = 0;i<480;i++){
            for(int j = 0;j<640;j++){
                matrizInt[i][j]=0;
                System.out.print(matrizInt[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();*/
        // EXERCICIO 4
        int [][] matriz;
        matriz = new int[480][640];
        for(int i = 0;i<480;i++){
            for(int j = 0;j<640;j++){
                matriz[i][j]=0;
                matriz[0][4] = matriz[0][4] + matriz[2][2];
                matriz[4][2]+=3;
                matriz[3][1]= matriz[2][2] + matriz[4][0];
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
}
