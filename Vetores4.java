import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        double [] a=new double[n];
       int cont = 0;
       double soma = 0;
     double media = 0;
        for(int i=0; i<n;i++){  
            a[i]=sc.nextDouble();
           cont++;
        }//for
        for(int i=0; i<n; i++){
            soma += a[i];
        }//for
        media = soma / cont;
        System.out.printf("%.3f%n", media);
        for(int i=0; i<n;i++){
           if(a[i]<media){
               System.out.printf("%.1f%n",a[i]);             
           }//if
        }//for
                
       sc.close();
               
    }//main

}//class
