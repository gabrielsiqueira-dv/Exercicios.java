import java.awt.BorderLayout;
import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String [] nome = new String[n];
      double [] notaA=new double[n];
      double [] notaB=new double[n];
      double [] media =new double [n];
        for(int i=0; i<n;i++){  
            nome[i]=sc.next();
            notaA[i]=sc.nextDouble();
              notaB[i]=sc.nextDouble();
              
        }//for
        for(int i=0; i<n;i++){ 
           media[i] = (notaA[i] +notaB[i])/2; 
        }//for
        System.out.println("Alunos aprovados:");
        for(int i=0; i<n;i++){ 
            if(media[i]>=6){
             System.out.printf("%s%n",nome[i]);
            }//if
        }//for
    }//main

}//class
