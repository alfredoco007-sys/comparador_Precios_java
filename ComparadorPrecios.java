
package ComparadorPrecios;

import java.util.Scanner;

public class ComparadorPrecios {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos productos tienes");
        int s=sc.nextInt();
        String[] nomb= new String[s];
        double[] pre= new double[s];
        double[] subtotal= new double[s]; 
        double total=0;
        double menor=subtotal[0];
        double mayor=subtotal[0];
        
        for (int i = 0; i < s; i++) {
            System.out.println("nombre del producto:");
            nomb[i]=sc.next();
            System.out.println("precio:");
            pre[i]=sc.nextDouble();
            System.out.println("ingresa cantidad:");
            int ct=sc.nextInt();
            subtotal[i]=((double)pre[i]*ct);
            total=total+subtotal[i];
            if(subtotal[i]>mayor){
                mayor=subtotal[i];
            }
            if(subtotal[i]<mayor){
                menor=subtotal[i];
            }
        }
            System.out.println("el total mas grande"+mayor);
            System.out.println("el total mas pequeño"+menor);
            System.out.println("el total es "+total);
        }
    }
    
