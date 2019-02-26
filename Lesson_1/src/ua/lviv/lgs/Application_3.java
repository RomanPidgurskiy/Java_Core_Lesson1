package ua.lviv.lgs;

public class Application_3 {
          public static void main(String[] args) {
        		int[] array = new int[10];
        		int max=0; int min=100;
        		
        		for (int i=0;i<=9;i++)
        		{
        		    array[i]=(int) (Math.random() * 100);
        			System.out.println(array[i]);
        		}
        		
      
        		int n=0;
        		while (n<array.length)
        		{ 
        			
        		    if (max < array[n]) { max=array[n];}
        			if (min > array[n]) { min=array[n];}
        			n++;
        			
        			
        			}
        		
        		
        		System.out.println("Максимальне число - " + max +"\n"+
        		"Мінімальне число - "+ min);
        		
}
}
