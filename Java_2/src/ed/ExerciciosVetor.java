
package ed;


public class ExerciciosVetor {

   
    public static void main(String[] args) {
        
        //EXERCICIO 1
        char [] vetorChar;
        vetorChar = new char[31];
        
        vetorChar[0]='a';
        System.out.println(vetorChar[0]);
        System.out.println("------------------");
        
        //EXERCICIO 2
       
        int [] vetor2;
        vetor2 = new int[10];
        vetor2[0]=18;
        vetor2[1]=3;
        vetor2[2]=21;
        vetor2[3]=8;
        vetor2[4]=14;
        vetor2[5]=5;
        vetor2[6]=6;
        vetor2[7]=11;
        vetor2[8]=2;
        vetor2[9]=9;
        
        // A -------------------
        vetor2[7] = 15;
        
        // B -------------------
        vetor2[1] = vetor2[2] - 3;
        // C -------------------
        vetor2[9] = vetor2[0] + vetor2[5];
        // D -------------------
        for(int i=0;i<10;i++){
            System.out.println(vetor2[i]);
        }
        System.out.println("------------------");
        // EXERCICIO 3 
        
        int [] vetor3;
        vetor3 = new int[10];
        vetor3[0]=18;
        vetor3[1]=3;
        vetor3[2]=21;
        vetor3[3]=8;
        vetor3[4]=14;
        vetor3[5]=5;
        vetor3[6]=6;
        vetor3[7]=11;
        vetor3[8]=2;
        vetor3[9]=9;
        
        for(int i=0;i<10;i++){
            if(i%2 == 0){
                vetor3[i]++;
            } else {
                vetor3[i]--;
            }
            System.out.println(vetor3[i]);
        }
        System.out.println("------------------");
        
        
    }
    
}
