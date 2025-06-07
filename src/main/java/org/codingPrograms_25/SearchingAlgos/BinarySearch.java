package org.codingPrograms_25.SearchingAlgos;

import java.util.Scanner;
// time complexity: O(log n), space complexity O(1)
public class BinarySearch {
    public static int binarySearch(int arr[],int num){
        int low=0,  high=arr.length-1;
        while(low <= high){
            int mid=(low+high)/2;
            if(arr[mid] == num){
               return mid;
            }
            else if(num>arr[mid]){
                low=mid+1;
            }
            else if(num<arr[mid]){
                high=mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of the array: ");
        int size;
        size=sc.nextInt();

        System.out.println("Enter an integer array");
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter number to be searched: ");
        int num=sc.nextInt();
        System.out.println("index is "+binarySearch(arr,num));
    }
}
/*
Enter size of the array:
10
Enter an integer array
5
14
18
21
26
28
30
58
70
85
Enter number to be searched:
30
index is 6
* */