package dsa.sorting;

import java.util.Arrays;

public class MergeSortInMem {
    public static void main(String[] args) {
        int[] arr ={5,4,3,2,1,6};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr,int start,int end) {
        if (end-start == 1) {
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid,end);
        merge(arr,start,mid,end);

    }

    private static void merge(int[] arr,int s,int m,int e) {
        int[] mix = new int[e-s];
        int i = s;
        int j = m;
        int k = 0;
        while(i < m && j<e){
            if(arr[i]<arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] =arr[j];
                j++;
            }k++;

        }
        //it may be possible one of the arrays not completed
        // add all rem element
        while(i<m){
            mix[k] = arr[i];
            i++;
            k++;
        }
        while(j<e){
            mix[k] = arr[j];
            j++;
            k++;
        }
        for(int l=0; l < mix.length;l++){
            arr[s+l] = mix[l];
        }
    }
}
