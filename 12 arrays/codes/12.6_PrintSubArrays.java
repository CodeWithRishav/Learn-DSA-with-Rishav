public class PrintSubArrays {
    public static void PrintSubArrays(int number[]){
        int total = 0;
        for (int i=0;i<number.length;i++){
            int start = i;
            for (int j=i;j<number.length;j++){
                int end = j;
                for (int k=start; k<=end; k++){
                    System.out.print(number[k]+ " ");
                }
                total++;
                System.out.println();
            }
            System.out.println();
        } 
        System.out.println("Total number of subarrays are = " + total);

    }
    public static void main(String[] args) {
        int numbers[] = {2,4,6,8,10};
        PrintSubArrays(numbers);
    }
}
