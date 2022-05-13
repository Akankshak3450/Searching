package com.company;
import java.util.Scanner;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter data for array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter data to search : ");
        int se = sc.nextInt();
        int low =0;
        int high = n-1;
        while(low<high){
            int mid=(low+high)/2;
            if(arr[mid] == se){
                System.out.println("Data found at : "+(mid+1));
            }else if( arr[mid]>se) {
                low =mid+1;
                System.out.println("Data found at : "+(low+1));
            }else{

                high = mid-1;
                System.out.println("Data found at : "+(high+1));

            }
            break;

        }
    }
}
