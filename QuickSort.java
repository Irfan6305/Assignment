package array;

import java.util.Arrays;

public class QuickSort {
    public static void quick_sort(int arr[],int low,int high){
        if(low<high){
            int p=pivotly(arr,low,high);
            quick_sort(arr,low,p-1);
            quick_sort(arr,p+1,high);
        }
    }
    public static int pivotly(int arr[],int low,int high){
        int i=low;
        int j=low;
        int pivot=arr[high];
        while(i<=high){
            if(arr[i]<=pivot){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
            i++;
        }
        return j-1;
    }
    public static void main(String[] args) {
        int arr[]={2,5,6,78,9,4,345,24,53,2564,2,123,56};
        quick_sort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}