import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[]args){
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      char cob;
      int somaTotal;
      int somaCoelho = 0;
      int somaSapo = 0;
      int somaRato = 0;
        for(int i = 1; i<=n; i++){
        int q = sc.nextInt();
        cob = sc.next().charAt(0);
            if(cob == 'C'){
              somaCoelho += q;
      
            }else if(cob == 'R'){
                somaRato += q;
      
                }else if(cob == 'S'){
                    somaSapo += q;
                }
      
        }
            somaTotal = somaCoelho + somaRato + somaSapo;
            double percentualCoelho =((double) somaCoelho / somaTotal)*100;
            double percentualRato = ((double)somaRato / somaTotal)*100;
            double percentualSapo = ((double)somaSapo / somaTotal)*100;
              System.out.println("Total: " + somaTotal + " cobaias");
               System.out.println("Total de coelhos: " + somaCoelho);
                System.out.println("Total de ratos: " + somaRato);
                 System.out.println("Total de sapos: " + somaSapo);
                  System.out.printf("Percentual de coelhos: %.2f %%%n",percentualCoelho);
                   System.out.printf("Percentual de ratos: %.2f %%%n",percentualRato);
                    System.out.printf("Percentual de sapos: %.2f %%%n",percentualSapo);
    }
     
}
   
