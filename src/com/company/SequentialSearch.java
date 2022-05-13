package com.company;
import java.util.*;
public class SequentialSearch {
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
        int flag =0;
        int pos=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]==se){
                flag =1;
                pos =i;
                break;
            }
        }
        if(flag ==1){
            System.out.println("Data found at "+(pos+1)+" position");
        }else{
            System.out.println("Data not found !");

        }
    }
}
