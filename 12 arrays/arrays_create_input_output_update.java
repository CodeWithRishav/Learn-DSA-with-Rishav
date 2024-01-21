import java.util.*;

class arrays_create_input_output_update{

    public static void main(String[] args) {
        /*
        creating an array
                syntax
        DataType Array_name[] = new DataType[size];
        */

        // type 1
        int ar1[] = new int[50];
        // type 2
        int arr2[] = {1,2,3,4,5};

        /*
            taking input in an array (ar1)
        */

        Scanner sc = new Scanner(System.in);
        System.out.println("enter first element");
        ar1[0] = sc.nextInt();
        System.out.println("enter second element");
        ar1[1] = sc.nextInt();
        System.out.println("enter third number");
        ar1[2] = sc.nextInt();
        // ......

        /*
            Printing values of an array
        */
        System.out.println("first element = " + ar1[0]);
        System.out.println("second element = " + ar1[1]);
        System.out.println("third element = " + ar1[2]);

        /*
                Updating values of an array 
        */

        ar1[1] += 1;
        System.out.println("first element after updating = " + ar1[1]);
    }
}