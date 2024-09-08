package Arrays;

import java.util.Scanner;

public class MinEle {

	public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.print("Enter size:");
        int n=obj.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements:");
        for(int i=0;i<n;i++) {
        	arr[i]=obj.nextInt();
        }
        //Smallest element
        int min=arr[0];
        for(int i=0;i<n;i++) {
        	if(arr[i]<min) {
        		min=arr[i];
        	}
        }
        System.out.print("Smallest Element="+min);
	}

}
