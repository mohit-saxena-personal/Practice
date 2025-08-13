package dsa.sorting;

import java.util.ArrayList;
import java.util.List;

public class AllMissNoCyc {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        System.out.println(missingNos(arr));
    }
    static void swap(int[] arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static List<Integer> missingNos(int[] arr){
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while(i< arr.length){
            int correct = arr[i] - 1;
            if(arr[i] != arr[correct]){
                swap(arr,i,correct);
            }else {
                i++;
            }
        }
        for(int index = 0;index< arr.length;index++){
            if(index+1 != arr[index]){
                list.add(index+1);
            }
        }
        return list;
    }
}
