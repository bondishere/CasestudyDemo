package sample;
import java.util.*;
public class Sort
{
public static void main(String[] args)
{
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        int n = s.nextInt();
		int a[] = new int[n];
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            
        }
		
		for(int i = 0; i < n; i++)
		{
			        System.out.print(" " + a[i]);
		}

	}
}