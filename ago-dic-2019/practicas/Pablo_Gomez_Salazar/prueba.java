package examencito;

import java.util.Scanner;

public class prueba {
	 Scanner s = new Scanner(System.in);
	 public static void main(String[] args) 
	    {
	        Scanner s = new Scanner (System.in);
	        
	        int numdeTazos, numdeSerie, tazof;
	        
	        
	        System.out.println("cantidad de tazos");
	        numdeTazos = s.nextInt();
	        int [] tazo = new int [numdeTazos];
	        
	        
	        System.out.println("Numero de serie del tazo que se busca");
	        numdeSerie = s.nextInt();
	        
	        
	        System.out.println("cual es el num de serie de cada tazo");
	        for (int i = 0; i < tazo.length; i++) 
	        {
	            numdeSerie=s.nextInt();
	            tazo[i]=numdeSerie;
	        }
	    }
	     
	        public static void quickSort(int [] t, int izq, int der)
	        {
	            int piv = t[izq];
	            int i = izq;
	            int j = der;
	            int a;
	            
	            while (i<j)
	            {
	                while (t[i]<=piv && i<j)
	                {
	                    i++;
	                
	                    while (t[j]<=piv)
	                    {
	                        j--;
	                    }
	                }
	                if (i<j)
	                {
	                    a = t[i];
	                    t[i] = t[j];
	                    t[j] = a;
	                }
	            }
	            t[izq] = t[j];
	            t[j] = piv;
	            if(izq<j-1)
	            {
	                quickSort(t, izq, j-1);
	            }
	            if(j+1<der)
	            {
	                quickSort(t, j+1, der);
	            }
	        }
	    }
	    

	 