import java.util.*;
/*
            GET LARGEST VALUE OF THE GIVEN ARRAY
*/
public class code_largest_and_smallest_value{
    public static int larget_value(int num[]){
        int largest = Integer.MIN_VALUE; // - Infinity
        for(int i=0;i<num.length;i++){
            if(num[i]>largest){
                largest= num[i];

            } 
        }
        return largest;
    }
/*
            GET SMALLEST VALUE OF THE GIVEN ARRAY
*/
    public static int smallest_value(int num[]){
        int smallest = Integer.MAX_VALUE; // + Infinity
        for(int i=0;i<num.length;i++){
            if(num[i]<smallest){
                smallest = num[i];
            }
        }
        return smallest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,4,5,6,9,8,7,3,25};
        System.out.println("the largest value of the given array is = "+ larget_value(num));
        System.out.println("the smallest value of the given array is = "+ smallest_value(num));
        
    }
}