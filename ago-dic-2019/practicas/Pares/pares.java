import java.util.Scanner;
public class pares {

		public static void main(String[] args) {
	   Scanner s=new Scanner(System.in);
	   int arr2[]=new int[20];
	   
	   System.out.print("cuantos numeros va a meter ");
	   int num=s.nextInt();
	   int arr[]= new int[num];
	   for(int j=0;j<num;j++) 
	   {
		 System.out.print("cuales son? ");
		  int n=s.nextInt();
		  arr[j]=n;
		   
	   }
	   
	   System.out.println("");
	   System.out.println("Los Numeros Pares son: ");
	   for(int i=0;i<arr.length;i++) 
	   {
		if(arr[i]%2==0) 
		{
			
			
		arr2[i]=arr[i];
		
		}
	   }
	   System.out.println("");
	   System.out.println("numeros inversos: ");
	   for(int i=arr2.length-1;i>=0;i--)
	   {
		   if(arr2[i]!=0)
		   {
			   System.out.print(arr2[i]+",");
		   }
		   
		   
	   }

	   
		}
	}