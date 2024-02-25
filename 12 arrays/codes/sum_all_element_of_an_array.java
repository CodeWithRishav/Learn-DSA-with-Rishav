public class sum_all_element_of_an_array {
    static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    // Function to multiply each element of an array by a factor
    public static void multiplyArray(int numbers[]) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] * 10 + " ");
        }
    }
    public static void main(String[] args) {
        int numbers[] = {1,2,3,4,5};
        int sum = sumArray(numbers);
        // Display result
        System.out.println("Sum of Array Elements: " + sum);
        System.out.println("product is ");
        multiplyArray(numbers);

    }
}



    


