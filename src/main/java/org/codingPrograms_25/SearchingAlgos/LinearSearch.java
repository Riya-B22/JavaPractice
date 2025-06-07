package org.codingPrograms_25.SearchingAlgos;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = {23,14,5,46,30,8};
        int numToSearch=30;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==numToSearch){
                System.out.println("number found at index:" + numToSearch);
                break;
            }
        }
    }
}
