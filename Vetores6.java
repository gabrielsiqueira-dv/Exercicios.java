import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String [] nome = new String[n];
       int [] idade=new int[n];
      
        for(int i=0; i<n;i++){  
            nome[i]=sc.next();
            idade[i]=sc.nextInt();
            
        }//for
        String nomeMaior = null;
        int maior = idade[0];
        for(int i=0; i<n;i++){
            if(maior<idade[i]){
                maior = idade[i];
                nomeMaior = nome[i];
        
            }//if   
        }//for
         System.out.printf("Pessoa mais velha: %s%n " ,nomeMaior);
        sc.close(); 
    }//main

}//class
