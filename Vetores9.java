import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        String [] produtoNome = new String[n];
     double [] precoCompra = new double[n];
     double [] precoVenda = new double [n];
     
        for(int i=0; i<n;i++){ 
            produtoNome [i] = sc.next();
            precoCompra [i] = sc.nextDouble();
            precoVenda [i] = sc.nextDouble();
        }
        int cont = 0;
         for(int i=0; i<n;i++){ 
        double porcentagem = ((precoVenda[i] - precoCompra [i])/precoCompra[i]) * 100;
        if(porcentagem < 10){
            cont++;
        }
         }
            System.out.println("Lucro abaixo de 10%: "+ cont);
         
        cont = 0;
       
        for(int i=0; i<n;i++){
         double porcentagem = ((precoVenda[i] - precoCompra [i])/precoCompra[i]) * 100;
         if(porcentagem >=10 && porcentagem <=20){
         cont++;
         }
        }
            System.out.println("Lucro entre 10% e 20%: "+ cont);
        
            cont = 0;
        
        for(int i=0; i<n;i++){  
           double porcentagem = ((precoVenda[i] - precoCompra [i])/precoCompra[i]) * 100;
           if(porcentagem >20){
               cont++;
           }
           
        }
        System.out.println("Lucro acima de 20%: "+ cont);
        
      double somaCompra = 0;
      
         for(int i=0; i<n;i++){ 
             somaCompra+= precoCompra[i];
             
         }
         System.out.printf("Valor total de compra: %.2f%n",somaCompra);
         
         double somaVenda =0;
         
         for(int i=0; i<n;i++){ 
         somaVenda += precoVenda[i];
         }
         System.out.printf("Valor total de venda:",somaVenda);
         
         double somaTotal= somaVenda - somaCompra;
         
         System.out.printf("Lucro total: %.2f%n", somaTotal);
    }//main

}//class

    
    
      
    
