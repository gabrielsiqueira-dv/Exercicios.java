import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int maior;
        int menor;
        int soma= 0;
        while(m > 0 && n > 0){
          if(m > n){
            maior = m;
            menor = n;  
            }else{
               maior = n;
               menor = m;
            }
              soma = 0;
            for(int i = menor;i<=maior;i++){
               soma += i; 
                System.out.print(i+" ");
            }
            System.out.printf("Sum=%d%n",soma);
            m =sc.nextInt();
            n =sc.nextInt();
        }//while
                           
    
    }//main

}//class
