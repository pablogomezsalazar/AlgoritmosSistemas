package examencito;
import java.util.Scanner;
public class pasado {

	
   	 
   	 Scanner s = new Scanner(System.in);
      
   	 public static int busquedaBinaria (String[] x, String dato) {
         int inicio= 0;
         int fin = x.length -1;
         int mit;

         while (inicio <= fin) {
             mit= (inicio+fin) / 2;

             if (x[mit].compareTo(dato) < 0) {
                 inicio = fin + 1;
             } else if (x[mit].compareTo(dato) > 0) {
                 fin = mit - 1;
             } else {
                 return mit;
             }
         }
     return -1;
     }
     
     public static void main (String[] args) 
     {
         java.util.Scanner Leer = new java.util.Scanner(System.in);
         
         int numdeLibros = Leer.nextInt();
         
         
         
         String [] infoteca = new String[numdeLibros];
         
         for(int i=0; i<infoteca.length; i++){
        	 
             infoteca[i] = Leer.nextLine();
            	 
             }
         
         System.out.print("el libro que buscas es: ");
         String libroquebusca = Leer.nextLine();
         
         int ubicacion = busquedaBinaria(infoteca,libroquebusca);
         
         if(ubicacion == -1)
             System.out.println(" -1 ");
         else
             System.out.println(ubicacion);
   	
   }
}
