package com.package2;
import java.util.Scanner;
public class TestClass {
    static String[] getReverseArray(String[] arr) {
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n: --->");

        //taking input of array size
        int n = sc.nextInt();
        String[] arr = new String[n];
        System.out.println("Enter the values of array: ---->");

        //taking input in array
        for(int i=0; i<n; i++) {
            String tmpS = sc.next();
            arr[i] = tmpS;
        }

        String[] resultArr = getReverseArray(arr);
        for(int i=n-1;i>=0;i--) {
            System.out.println(arr[i]); //print your result array
        }
    }
}
