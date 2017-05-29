


import java.io.*;
import java.util.Scanner;

public class Sort {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("elements are:");
        for (int i = 0; i < n; i++) 
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) 
        {
            for (int j = i + 1; j < n; j++) 
            {
                if (a[i] > a[j]) 
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("after sorting:");
        for (int i = 0; i < n - 1; i++) 
        {
            System.out.println(a[i] + ",");
        }
        System.out.println(a[n - 1]);
        System.out.println("the minimum no in the sorted array: "+a[0]);
        System.out.println("the maximum no in the sorted array" +a[n-1]);
	}
}