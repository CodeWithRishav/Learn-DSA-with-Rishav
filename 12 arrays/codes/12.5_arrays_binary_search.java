// import java.util.*;
// public package codes;

public class arrays_binary_search {
    public static int BinarySearch(int number[],int key){
        int start = 0, end = number.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if (number[mid]==key) { // found condition
                return mid;
            }
            if (number[mid]<key){ //right
                start = mid + 1;
            }else{ //left
                end= mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]= {1,2,3,4,5,6,7,8,9};
        int key = 4;
        System.out.println("element found at index = "+ BinarySearch(number, key) );

        int result = BinarySearch(number,key);
        if(result==-1){
            System.out.println("eleme");
        }
    }
    
}