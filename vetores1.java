import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double [] vet = new double [n];
        double maior = 0;
       double posicao =0 ;
        for (int i=0; i<n; i++){
            vet[i] = sc.nextDouble();
          
        }//for       
            maior = vet[0];
       for (int i=1; i<n; i++){
         if(maior < vet[i]){
           maior = vet[i];
           posicao = i;
           
        }//if                
       }//for
        
         System.out.println(maior);
           System.out.println(posicao);                  
    
          sc.close(); 
    }//main

}//class
