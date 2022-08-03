import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double [] altura = new double[n];
        char [] sexo = new char[n];
     
        for(int i=0; i<n;i++){  
            altura[i]=sc.nextDouble();
        sexo[i]=sc.next().charAt(0) ;
         }//for
        
        double maior = altura[0];
         for(int i=0; i<n;i++){  
            if(maior>altura[i]){
         maior = altura[i];
            }//if 
         }//for
         
         double menor = altura[0];
         for(int i=0; i<n;i++){ 
             if(menor<altura[i]){
             menor = altura[i];
             }//if
         }//for
         
         double soma = 0;
         double contMulheres = 0;
         int contHomens =0;
          for(int i=0; i<n;i++){
            if(sexo[i]=='F'){
                soma+=altura[i];
                contMulheres++;
            }//if
            
          }//for
          
          double media = soma / contMulheres;
          
          for(int i=0; i<n;i++){
              if(sexo[i]=='M'){
              contHomens++;
              }//if
             
          }//for
              System.out.printf("Menor altura = %.2f%n",menor); 
              System.out.printf("Maior altura = %.2f%n",maior);
              System.out.printf("Media das alturas das mulheres = %.2f%n",media);
              System.out.println("Numero de homens = " + contHomens);
    }//main

}//class
