/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedadoslab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Matriz {
   
   public static String [][] FileReader(String [][] matriz,File file) throws Exception {
     FileReader data;
     Integer linhas = linhas = matriz.length;
     Integer colunas = matriz[0].length;
     
     data = new FileReader(file);
     BufferedReader linha = new BufferedReader(data);
     
     String aux = linha.readLine();
     
     for(int i = 0; i < linhas;i++){
         for(int j = 0;j<colunas;j++){
             if(aux != null){
                 matriz[i][j] = ""+ aux.charAt(j);
             }
         }
         aux = linha.readLine();
     }
     for(int i = 0;i<linhas;i++){
        for(int j = 0;j<colunas;j++){
            System.out.print(matriz[i][j]);
    }
        System.out.println("");
    }
        data.close();
        return matriz;
     }
     
   } 
    
